
package projem.kapında.business.abstracts;


import org.springframework.stereotype.Service;
import projem.kapında.business.requests.CreatFaturaRequest;
import projem.kapında.business.requests.UpdateFaturaRequest;
import projem.kapında.business.responses.GetAllFaturaResponse;
import projem.kapında.business.responses.GetByIdFaturaResponse;

import java.util.List;

@Service
public interface FaturaService{
        List<GetAllFaturaResponse> getALl();
        GetByIdFaturaResponse getById(int id);
        void add(CreatFaturaRequest creatFaturaRequest);
        void  update(UpdateFaturaRequest updateFaturaRequest);
        void delete(int id);
}
