package projem.kapında.business.abstracts;

import org.springframework.stereotype.Service;
import projem.kapında.business.requests.CreatSepetRequest;
import projem.kapında.business.requests.UpdateSepetRequest;
import projem.kapında.business.responses.GetAllSepetResponse;
import projem.kapında.business.responses.GetByIdSepetResponse;

import java.util.List;

@Service
public interface SepetService {
    List<GetAllSepetResponse> getALl();
    GetByIdSepetResponse getById(int id);
    void add(CreatSepetRequest creatSepetRequest);
    void  update(UpdateSepetRequest updateSepetRequest);
    void delete(int id);
}
