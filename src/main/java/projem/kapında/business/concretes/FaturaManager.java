package projem.kapında.business.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import projem.kapında.business.abstracts.FaturaService;
import projem.kapında.business.requests.CreatFaturaRequest;
import projem.kapında.business.requests.UpdateFaturaRequest;
import projem.kapında.business.responses.GetAllFaturaResponse;
import projem.kapında.business.responses.GetByIdFaturaResponse;
import projem.kapında.core.utilities.mappers.ModelMappersService;
import projem.kapında.dataAccess.abstracts.FaturaRepository;
import projem.kapında.entities.concretes.Fatura;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor

public class FaturaManager  implements FaturaService {
    private FaturaRepository faturaRepository;
    private ModelMappersService modelMappersService;

    @Override
    public List<GetAllFaturaResponse> getALl() {
        List<Fatura> faturalar =faturaRepository.findAll();
        List<GetAllFaturaResponse>faturaResponses=
                faturalar.stream().map(fatura -> this.modelMappersService.forResponse()
                        .map(fatura, GetAllFaturaResponse.class)).collect(Collectors.toList());

        return faturaResponses;
    }

    @Override
    public GetByIdFaturaResponse getById(int id) {
        Fatura fatura=faturaRepository.findById(id).orElseThrow();
        GetByIdFaturaResponse faturaResponse =
                this.modelMappersService.forResponse().map(fatura,GetByIdFaturaResponse.class);
        return faturaResponse;
    }

    @Override
    public void add(CreatFaturaRequest creatFaturaRequest) {
        Fatura fatura=this.modelMappersService.forRequest().map(creatFaturaRequest, Fatura.class);
        this.faturaRepository.save(fatura);

    }

    @Override
    public void update(UpdateFaturaRequest updateFaturaRequest) {
        Fatura fatura=this.modelMappersService.forRequest().map(updateFaturaRequest, Fatura.class);
        this.faturaRepository.save(fatura);

    }

    @Override
    public void delete(@PathVariable int id) {
        this.faturaRepository.deleteById(id);
    }



}
