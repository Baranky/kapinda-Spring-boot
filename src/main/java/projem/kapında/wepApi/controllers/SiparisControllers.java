package projem.kapında.wepApi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import projem.kapında.business.abstracts.SiparisService;
import projem.kapında.business.requests.CreatSiparisRequest;
import projem.kapında.business.requests.UpdateSiparisRequest;
import projem.kapında.business.responses.GetAllSiparisResponse;
import projem.kapında.business.responses.GetByIdSiparisResponse;

import java.util.List;

@RestController
@RequestMapping("/api/siparis")
@AllArgsConstructor

public class SiparisControllers {
    private SiparisService siparisService;

    @GetMapping()
    public List<GetAllSiparisResponse> getAll(){
        return siparisService.getALl();
    }
    @GetMapping("/{id}")
    public GetByIdSiparisResponse getById(@PathVariable int id){
        return siparisService.getById(id);
    }

    @PostMapping()
    @ResponseStatus(code= HttpStatus.CREATED)
    public void add(@RequestBody() CreatSiparisRequest creatSiparisRequest){
        this.siparisService.add(creatSiparisRequest);
    }

    @PutMapping()
    public void update(@RequestBody UpdateSiparisRequest updateSiparisRequest){
        this.siparisService.update(updateSiparisRequest);
    }

    @DeleteMapping("/{id}")
    public  void delete(@PathVariable int id){
        this.siparisService.delete(id);

    }

}

