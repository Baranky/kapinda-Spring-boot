package projem.kapında.business.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import projem.kapında.business.abstracts.DegerlendirmeService;
import projem.kapında.business.requests.CreatDegerlendirmeRequest;
import projem.kapında.business.requests.UpdateDegerlendirmeRequest;
import projem.kapında.business.responses.GetAllDegerlendirmeResponse;
import projem.kapında.business.responses.GetByIdDegerlendirmeResponse;
import projem.kapında.core.utilities.mappers.ModelMappersService;
import projem.kapında.dataAccess.abstracts.DegerlendirmeRepository;
import projem.kapında.entities.concretes.Degerlendirme;

import java.util.List;
import java.util.stream.Collectors;


@AllArgsConstructor
@Service
public class DegerlendirmeManager implements DegerlendirmeService {
    private DegerlendirmeRepository degerlendirmeRepository;
    private ModelMappersService modelMappersService;

    @Override
    public List<GetAllDegerlendirmeResponse> getALl() {

        List<Degerlendirme> degerlendirmeler = degerlendirmeRepository.findAll();
        List<GetAllDegerlendirmeResponse> degerlendirmeResponses =
                degerlendirmeler.stream().map(degerlendirme -> this.modelMappersService.forResponse()
                        .map(degerlendirme, GetAllDegerlendirmeResponse.class)).collect(Collectors.toList());

        return degerlendirmeResponses;
    }


    @Override
    public GetByIdDegerlendirmeResponse getById(int id) {
        Degerlendirme degerlendirme = degerlendirmeRepository.findById(id).orElseThrow();
        GetByIdDegerlendirmeResponse degerlendirmeResponse = this.modelMappersService.forResponse().
                map(degerlendirme, GetByIdDegerlendirmeResponse.class);
        return degerlendirmeResponse;
    }

    @Override
    public void add(CreatDegerlendirmeRequest creatDegerlendirmeRequest) {
        Degerlendirme degerlendirme = this.modelMappersService.forRequest().
                map(creatDegerlendirmeRequest, Degerlendirme.class);
        this.degerlendirmeRepository.save(degerlendirme);
    }

    @Override
    public void update(UpdateDegerlendirmeRequest updateDegerlendirmeRequest) {
        Degerlendirme degerlendirme = this.modelMappersService.forRequest().
                map(updateDegerlendirmeRequest, Degerlendirme.class);
        this.degerlendirmeRepository.save(degerlendirme);

    }

    @Override
    public void delete(@PathVariable int id) {
        this.degerlendirmeRepository.deleteById(id);
    }


}
