package projem.kapında.business.abstracts;

import org.springframework.stereotype.Service;
import projem.kapında.business.requests.CreatYemekRequest;
import projem.kapında.business.requests.UpdateYemekRequest;
import projem.kapında.business.responses.GetAllYemekResponse;
import projem.kapında.business.responses.GetByIdYemekResponse;

import java.util.List;

@Service
public interface YemekService {
    List<GetAllYemekResponse> getALl();
    GetByIdYemekResponse getById(int id);
    void add(CreatYemekRequest creatYemekRequest);
    void  update(UpdateYemekRequest updateYemekRequest);
    void delete(int id);
}
