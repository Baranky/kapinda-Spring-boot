package projem.kapında.business.abstracts;

import org.springframework.stereotype.Service;
import projem.kapında.business.requests.CreatMusteriRequest;
import projem.kapında.business.requests.UpdateMusteriRequest;
import projem.kapında.business.responses.GetAllMusteriResponse;
import projem.kapında.business.responses.GetByIdMusteriResponse;

import java.util.List;

@Service
public interface MusteriService {
    List<GetAllMusteriResponse> getALl();
    GetByIdMusteriResponse getById(int id);
    void add(CreatMusteriRequest creatMusteriRequest);
    void  update(UpdateMusteriRequest updateMusteriRequest);
    void delete(int id);
}
