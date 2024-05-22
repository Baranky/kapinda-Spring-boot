package projem.kapında.business.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import projem.kapında.business.abstracts.RestorantService;
import projem.kapında.business.requests.CreatRestorantRequest;
import projem.kapında.business.requests.UpdateRestorantRequest;
import projem.kapında.business.responses.GetAllRestorantResponse;
import projem.kapında.business.responses.GetByIdRestorantResponse;
import projem.kapında.core.utilities.mappers.ModelMappersService;
import projem.kapında.dataAccess.abstracts.RestorantRepository;
import projem.kapında.entities.concretes.Restorant;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class RestorantManager implements RestorantService {
    private RestorantRepository restorantRepository;
    private ModelMappersService modelMappersService;

    @Override
    public List<GetAllRestorantResponse> getALl() {
        List<Restorant> restorantlar =restorantRepository.findAll();
        List<GetAllRestorantResponse>restorantResponse=
                restorantlar.stream().map(restorant -> this.modelMappersService.forResponse()
                        .map(restorant, GetAllRestorantResponse.class)).collect(Collectors.toList());

        return restorantResponse;
    }

    @Override
    public GetByIdRestorantResponse getById(int id) {
        Restorant restorant=restorantRepository.findById(id).orElseThrow();
        GetByIdRestorantResponse restorantResponse =
                this.modelMappersService.forResponse().map(restorant,GetByIdRestorantResponse.class);
        return restorantResponse;
    }

    @Override
    public void add(CreatRestorantRequest creatRestorantRequest) {
        Restorant restorant=this.modelMappersService.forRequest().map(creatRestorantRequest, Restorant.class);
        this.restorantRepository.save(restorant);


    }

    @Override
    public void update(UpdateRestorantRequest updateRestorantRequest) {
        Restorant restorant=this.modelMappersService.forRequest().map(updateRestorantRequest, Restorant.class);
        this.restorantRepository.save(restorant);
    }

    @Override
    public void delete(@PathVariable int id) {
        this.restorantRepository.deleteById(id);
    }
}
