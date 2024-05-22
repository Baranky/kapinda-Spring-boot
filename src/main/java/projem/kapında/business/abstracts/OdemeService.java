package projem.kapında.business.abstracts;



import org.springframework.stereotype.Service;

import projem.kapında.business.requests.CreatOdemeRequest;
import projem.kapında.business.requests.UpdateOdemeRequest;
import projem.kapında.business.responses.GetAllOdemeResponse;
import projem.kapında.business.responses.GetByIdOdemeResponse;

import java.util.List;

@Service
public interface OdemeService {
    List<GetAllOdemeResponse> getALl();
    GetByIdOdemeResponse getById(int id);
    void add(CreatOdemeRequest creatMusteriRequest);
    void  update(UpdateOdemeRequest updateMusteriRequest);
    void delete(int id);
}
