package projem.kapında.business.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import projem.kapında.business.abstracts.KampanyaService;
import projem.kapında.business.requests.CreatKampanyaRequest;
import projem.kapında.business.requests.UpdateKampanyaRequest;
import projem.kapında.business.responses.GetAllKampanyaResponse;
import projem.kapında.business.responses.GetByIdKampanyaResponse;
import projem.kapında.core.utilities.mappers.ModelMappersService;
import projem.kapında.dataAccess.abstracts.KampanyaRepository;
import projem.kapında.entities.concretes.Kampanya;


import java.util.List;
import java.util.stream.Collectors;


@AllArgsConstructor
@Service
public class KampanyaManager implements KampanyaService {
    private KampanyaRepository kapmanyaRepository;
    private ModelMappersService modelMappersService;

    @Override
    public List<GetAllKampanyaResponse> getALl() {
        List<Kampanya> kampanyalar=kapmanyaRepository.findAll();
        List<GetAllKampanyaResponse>kampanyaResponses=
                kampanyalar.stream().map(kampanya -> this.modelMappersService.forResponse()
                        .map(kampanya, GetAllKampanyaResponse.class)).collect(Collectors.toList());

        return kampanyaResponses;
    }

    @Override
    public GetByIdKampanyaResponse getById(int id) {
        Kampanya kampanya=kapmanyaRepository.findById(id).orElseThrow();
        GetByIdKampanyaResponse kampanyaResponse =
                this.modelMappersService.forResponse().map(kampanya,GetByIdKampanyaResponse.class);
        return kampanyaResponse;
    }

    @Override
    public void add(CreatKampanyaRequest creatKampanyaRequest) {
        Kampanya kampanya=this.modelMappersService.forRequest().map(creatKampanyaRequest, Kampanya.class);
        this.kapmanyaRepository.save(kampanya);

    }


    @Override
    public void update(UpdateKampanyaRequest updateKampanyaRequest) {
        Kampanya kampanya=this.modelMappersService.forRequest().map(updateKampanyaRequest, Kampanya.class);
        this.kapmanyaRepository.save(kampanya);

    }

    @Override
    public void delete(@PathVariable int id) {
        this.kapmanyaRepository.deleteById(id);
    }

}
