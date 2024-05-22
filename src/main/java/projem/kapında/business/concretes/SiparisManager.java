package projem.kapında.business.concretes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import projem.kapında.business.abstracts.SiparisService;
import projem.kapında.business.requests.CreatSiparisRequest;
import projem.kapında.business.requests.UpdateSiparisRequest;
import projem.kapında.business.responses.GetAllSiparisResponse;
import projem.kapında.business.responses.GetByIdSiparisResponse;
import projem.kapında.core.utilities.mappers.ModelMappersService;
import projem.kapında.dataAccess.abstracts.SiparisRepository;
import projem.kapında.entities.concretes.Siparis;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class SiparisManager implements SiparisService {
    private SiparisRepository siparisRepository;
    private ModelMappersService modelMappersService;
    @Override
    public List<GetAllSiparisResponse> getALl() {
        List<Siparis> siparisler =siparisRepository.findAll();
        List<GetAllSiparisResponse>siparisResponses=
                siparisler.stream().map(siparis -> this.modelMappersService.forResponse()
                        .map(siparis, GetAllSiparisResponse.class)).collect(Collectors.toList());

        return siparisResponses;
    }

    @Override
    public GetByIdSiparisResponse getById(int id) {
        Siparis siparis=siparisRepository.findById(id).orElseThrow();
        GetByIdSiparisResponse siparisResponses =
                this.modelMappersService.forResponse().map(siparis,GetByIdSiparisResponse.class);
        return siparisResponses;
    }

    @Override
    public void add(CreatSiparisRequest creatSiparisRequest) {
        Siparis siparis=this.modelMappersService.forRequest().map(creatSiparisRequest, Siparis.class);
        this.siparisRepository.save(siparis);

    }

    @Override
    public void update(UpdateSiparisRequest updateSiparisRequest) {
        Siparis siparis=this.modelMappersService.forRequest().map(updateSiparisRequest, Siparis.class);
        this.siparisRepository.save(siparis);

    }

    @Override
    public void delete(@PathVariable int id) {
        this.siparisRepository.deleteById(id);
    }



}

