package projem.kapında.business.abstracts;


import org.springframework.stereotype.Service;
import projem.kapında.business.requests.CreatKampanyaRequest;
import projem.kapında.business.requests.UpdateKampanyaRequest;
import projem.kapında.business.responses.GetAllKampanyaResponse;
import projem.kapında.business.responses.GetByIdKampanyaResponse;

import java.util.List;

@Service
public interface KampanyaService {
    List<GetAllKampanyaResponse> getALl();
    GetByIdKampanyaResponse getById(int id);
    void add(CreatKampanyaRequest creatKampanyaRequest);
    void  update(UpdateKampanyaRequest updateKampanyaRequest);
    void delete(int id);
}
