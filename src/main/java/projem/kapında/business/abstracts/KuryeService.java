package projem.kapında.business.abstracts;


import org.springframework.stereotype.Service;
import projem.kapında.business.requests.CreatKuryeRequest;
import projem.kapında.business.requests.UpdateKuryeRequest;
import projem.kapında.business.responses.GetAllKuryeResponse;
import projem.kapında.business.responses.GetByIdKuryeResponse;

import java.util.List;

@Service
public interface KuryeService {
    List<GetAllKuryeResponse> getALl();
    GetByIdKuryeResponse getById(int id);
    void add(CreatKuryeRequest creatKuryeRequest);
    void  update(UpdateKuryeRequest updateKuryeRequest);
    void delete(int id);
}
