package projem.kapında.business.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import projem.kapında.business.abstracts.KuryeService;
import projem.kapında.business.requests.CreatKuryeRequest;
import projem.kapında.business.requests.UpdateKuryeRequest;
import projem.kapında.business.responses.GetAllKuryeResponse;
import projem.kapında.business.responses.GetByIdKuryeResponse;
import projem.kapında.core.utilities.mappers.ModelMappersService;
import projem.kapında.dataAccess.abstracts.KuryeRepository;
import projem.kapında.entities.concretes.Kurye;


import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class KuryeManager implements KuryeService {
    private KuryeRepository kuryeRepository;
    private ModelMappersService modelMappersService;

    @Override
    public List<GetAllKuryeResponse> getALl() {
        List<Kurye> kuryeler =kuryeRepository.findAll();
        List<GetAllKuryeResponse>kuryeResponse=
                kuryeler.stream().map(kurye -> this.modelMappersService.forResponse()
                        .map(kurye, GetAllKuryeResponse.class)).collect(Collectors.toList());

        return kuryeResponse;
    }

    @Override
    public GetByIdKuryeResponse getById(int id) {
        Kurye kurye=kuryeRepository.findById(id).orElseThrow();
        GetByIdKuryeResponse kuryeResponse =
                this.modelMappersService.forResponse().map(kurye,GetByIdKuryeResponse.class);
        return kuryeResponse;
    }

    @Override
    public void add(CreatKuryeRequest creatKuryeRequest) {
        Kurye kurye=this.modelMappersService.forRequest().map(creatKuryeRequest, Kurye.class);
        this.kuryeRepository.save(kurye);


    }

    @Override
    public void update(UpdateKuryeRequest updateKuryeRequest) {
        Kurye kurye=this.modelMappersService.forRequest().map(updateKuryeRequest, Kurye.class);
        this.kuryeRepository.save(kurye);
    }

    @Override
    public void delete(@PathVariable int id) {
        this.kuryeRepository.deleteById(id);
    }
}

