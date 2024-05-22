package projem.kapında.business.abstracts;

import org.springframework.stereotype.Service;
import projem.kapında.business.requests.CreatRestorantRequest;
import projem.kapında.business.requests.UpdateRestorantRequest;
import projem.kapında.business.responses.GetAllRestorantResponse;
import projem.kapında.business.responses.GetByIdRestorantResponse;

import java.util.List;

@Service
public interface RestorantService {
    List<GetAllRestorantResponse> getALl();
    GetByIdRestorantResponse getById(int id);
    void add(CreatRestorantRequest creatRestorantRequest);
    void  update(UpdateRestorantRequest updateRestorantRequest);
    void delete(int id);
}
