package projem.kapında.wepApi.controllers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import projem.kapında.business.abstracts.KuryeService;
import projem.kapında.business.requests.CreatKuryeRequest;
import projem.kapında.business.requests.UpdateKuryeRequest;
import projem.kapında.business.responses.GetAllKuryeResponse;
import projem.kapında.business.responses.GetByIdKuryeResponse;

import java.util.List;
@RestController
@RequestMapping("api/kurye")
@AllArgsConstructor

public class KuryeControllers {

    private KuryeService kuryeService;

    @GetMapping()
    public List<GetAllKuryeResponse> getAll(){
        return kuryeService.getALl();
    }

    @GetMapping("/{id}")
    public GetByIdKuryeResponse getById(@PathVariable int id){
        return kuryeService.getById(id);
    }

    @PostMapping()
    @ResponseStatus(code= HttpStatus.CREATED)
    public void add(@RequestBody() CreatKuryeRequest creatKuryeRequest){
        this.kuryeService.add(creatKuryeRequest);
    }

    @PutMapping()
    public void update(@RequestBody UpdateKuryeRequest updateKuryeRequest){
        this.kuryeService.update(updateKuryeRequest);
    }

    @DeleteMapping("/{id}")
    public  void delete(@PathVariable int id){
        this.kuryeService.delete(id);

    }
}
