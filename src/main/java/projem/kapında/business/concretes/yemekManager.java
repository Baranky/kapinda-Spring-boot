package projem.kapında.business.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import projem.kapında.business.abstracts.YemekService;
import projem.kapında.business.requests.CreatYemekRequest;
import projem.kapında.business.requests.UpdateYemekRequest;
import projem.kapında.business.responses.GetByIdYemekResponse;
import projem.kapında.business.responses.GetAllYemekResponse;
import projem.kapında.core.utilities.mappers.ModelMappersService;
import projem.kapında.dataAccess.abstracts.YemekRepository;
import projem.kapında.entities.concretes.Yemek;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class yemekManager  implements YemekService {
    private YemekRepository yemekRepository;
    private ModelMappersService modelMappersService;
    @Override
    public List<GetAllYemekResponse> getALl() {
        List<Yemek> yemekler =yemekRepository.findAll();
        List<GetAllYemekResponse>yemekResponse=
                yemekler.stream().map(yemek -> this.modelMappersService.forResponse()
                        .map(yemek, GetAllYemekResponse.class)).collect(Collectors.toList());

        return yemekResponse;

    }

    @Override
    public GetByIdYemekResponse getById(int id) {
        Yemek yemek=yemekRepository.findById(id).orElseThrow();
        GetByIdYemekResponse yemekResponse =
                this.modelMappersService.forResponse().map(yemek,GetByIdYemekResponse.class);
        return yemekResponse;
    }

    @Override
    public void add(CreatYemekRequest creatYemekRequest) {
        Yemek yemek=this.modelMappersService.forRequest().map(creatYemekRequest, Yemek.class);
        this.yemekRepository.save(yemek);

    }

    @Override
    public void update(UpdateYemekRequest updateYemekRequest) {
        Yemek yemek=this.modelMappersService.forRequest().map(updateYemekRequest, Yemek.class);
        this.yemekRepository.save(yemek);
    }

    @Override
    public void delete(@PathVariable int id) {
        this.yemekRepository.deleteById(id);
    }
}
