package projem.kapında.business.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import projem.kapında.business.abstracts.MusteriService;
import projem.kapında.business.requests.CreatMusteriRequest;
import projem.kapında.business.requests.UpdateMusteriRequest;
import projem.kapında.business.responses.GetAllMusteriResponse;
import projem.kapında.business.responses.GetByIdMusteriResponse;
import projem.kapında.core.utilities.mappers.ModelMappersService;
import projem.kapında.dataAccess.abstracts.MusteriRepository;
import projem.kapında.entities.concretes.Musteri;


import java.util.List;
import java.util.stream.Collectors;
@Service
@AllArgsConstructor

public class MusteriManager  implements MusteriService {
    private MusteriRepository musteriRepository;
    private ModelMappersService modelMappersService;

    @Override
    public List<GetAllMusteriResponse> getALl() {
        List<Musteri> musteriler =musteriRepository.findAll();
        List<GetAllMusteriResponse>musteriResponses=
                musteriler.stream().map(musteri -> this.modelMappersService.forResponse()
                        .map(musteri, GetAllMusteriResponse.class)).collect(Collectors.toList());

        return musteriResponses;
    }

    @Override
    public GetByIdMusteriResponse getById(int id) {
        Musteri musteri=musteriRepository.findById(id).orElseThrow();
        GetByIdMusteriResponse musteriResponse=
                this.modelMappersService.forResponse().map(musteri,GetByIdMusteriResponse.class);
        return musteriResponse;
    }

    @Override
    public void add(CreatMusteriRequest creatMusteriRequest) {
        Musteri musteri=this.modelMappersService.forRequest().map(creatMusteriRequest, Musteri.class);
        this.musteriRepository.save(musteri);


    }

    @Override
    public void update(UpdateMusteriRequest updateMusteriRequest) {
        Musteri musteri=this.modelMappersService.forRequest().map(updateMusteriRequest, Musteri.class);
        this.musteriRepository.save(musteri);
    }

    @Override
    public void delete(@PathVariable int id) {
        this.musteriRepository.deleteById(id);
    }
}

