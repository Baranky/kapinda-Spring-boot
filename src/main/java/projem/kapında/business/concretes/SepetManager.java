package projem.kapında.business.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import projem.kapında.business.abstracts.SepetService;
import projem.kapında.business.requests.CreatSepetRequest;
import projem.kapında.business.requests.UpdateSepetRequest;
import projem.kapında.business.responses.GetAllSepetResponse;
import projem.kapında.business.responses.GetByIdSepetResponse;
import projem.kapında.core.utilities.mappers.ModelMappersService;
import projem.kapında.dataAccess.abstracts.SepetlemeRepository;
import projem.kapında.entities.concretes.Sepet;

import java.util.List;
import java.util.stream.Collectors;
@Service
@AllArgsConstructor
public class SepetManager  implements SepetService {
    private SepetlemeRepository sepetlemeRepository;
    private ModelMappersService modelMappersService;

    @Override
    public List<GetAllSepetResponse> getALl() {
        List<Sepet> sepetler =sepetlemeRepository.findAll();
        List<GetAllSepetResponse>sepetResponses=
                sepetler.stream().map(sepetleme -> this.modelMappersService.forResponse()
                        .map(sepetleme, GetAllSepetResponse.class)).collect(Collectors.toList());

        return sepetResponses;
    }

    @Override
    public GetByIdSepetResponse getById(int id) {
        Sepet sepet=sepetlemeRepository.findById(id).orElseThrow();
        GetByIdSepetResponse sepetResponse =
                this.modelMappersService.forResponse().map(sepet,GetByIdSepetResponse.class);
        return sepetResponse;
    }

    @Override
    public void add(CreatSepetRequest creatSepetRequest) {
        Sepet sepet=this.modelMappersService.forRequest().map(creatSepetRequest, Sepet.class);
        this.sepetlemeRepository.save(sepet);

    }

    @Override
    public void update(UpdateSepetRequest updateSepetRequest) {
        Sepet sepet=this.modelMappersService.forRequest().map(updateSepetRequest, Sepet.class);
        this.sepetlemeRepository.save(sepet);
    }

    @Override
        public void delete(@PathVariable int id) {
            this.sepetlemeRepository.deleteById(id);
        }
}
