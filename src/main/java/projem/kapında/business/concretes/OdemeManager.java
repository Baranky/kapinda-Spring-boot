package projem.kapında.business.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import projem.kapında.business.abstracts.OdemeService;
import projem.kapında.business.requests.CreatOdemeRequest;
import projem.kapında.business.requests.UpdateOdemeRequest;
import projem.kapında.business.responses.GetAllOdemeResponse;
import projem.kapında.business.responses.GetByIdOdemeResponse;
import projem.kapında.core.utilities.mappers.ModelMappersService;
import projem.kapında.dataAccess.abstracts.OdemeRepository;
import projem.kapında.entities.concretes.Odeme;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class OdemeManager implements OdemeService {
    private OdemeRepository odemeRepository;
    private ModelMappersService modelMappersService;

    @Override
    public List<GetAllOdemeResponse> getALl() {

            List<Odeme> odemeler =odemeRepository.findAll();
            List<GetAllOdemeResponse>odemeResponses=
                    odemeler.stream().map(odeme -> this.modelMappersService.forResponse()
                            .map(odeme, GetAllOdemeResponse.class)).collect(Collectors.toList());

            return odemeResponses;
        }


    @Override
    public GetByIdOdemeResponse getById(int id) {
        Odeme odeme=odemeRepository.findById(id).orElseThrow();
        GetByIdOdemeResponse odemeResponse=
                this.modelMappersService.forResponse().map(odeme,GetByIdOdemeResponse.class);
        return odemeResponse;
    }

    @Override
    public void add(CreatOdemeRequest creatOdemeRequest) {
        Odeme odeme=this.modelMappersService.forRequest().map(creatOdemeRequest, Odeme.class);
        this.odemeRepository.save(odeme);
    }

    @Override
    public void update(UpdateOdemeRequest updateOdemeRequest) {

        Odeme odeme=this.modelMappersService.forRequest().map(updateOdemeRequest, Odeme.class);
        this.odemeRepository.save(odeme);
    }

    @Override
    public void delete(@PathVariable int id) {
        this.odemeRepository.deleteById(id);
    }

}
