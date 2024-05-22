package projem.kapında.business.abstracts;

import org.springframework.stereotype.Service;
import projem.kapında.business.requests.CreatSiparisRequest;
import projem.kapında.business.requests.UpdateSiparisRequest;
import projem.kapında.business.responses.GetAllSiparisResponse;
import projem.kapında.business.responses.GetByIdSiparisResponse;

import java.util.List;
@Service
public interface SiparisService {
    List<GetAllSiparisResponse> getALl();
    GetByIdSiparisResponse getById(int id);
    void add(CreatSiparisRequest creatSiparisRequest);
    void  update(UpdateSiparisRequest updateSiparisRequest);
    void delete(int id);
}
