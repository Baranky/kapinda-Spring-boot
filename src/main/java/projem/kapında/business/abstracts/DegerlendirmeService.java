package projem.kapında.business.abstracts;

import org.springframework.stereotype.Service;
import projem.kapında.business.requests.CreatDegerlendirmeRequest;
import projem.kapında.business.requests.UpdateDegerlendirmeRequest;
import projem.kapında.business.responses.GetAllDegerlendirmeResponse;
import projem.kapında.business.responses.GetByIdDegerlendirmeResponse;

import java.util.List;

@Service
public interface DegerlendirmeService {
    List<GetAllDegerlendirmeResponse> getALl();
    GetByIdDegerlendirmeResponse getById(int id);
    void add(CreatDegerlendirmeRequest creatDegerlendirmeRequest);
    void  update(UpdateDegerlendirmeRequest updateDegerlendirmeRequest);
    void delete(int id);
}
