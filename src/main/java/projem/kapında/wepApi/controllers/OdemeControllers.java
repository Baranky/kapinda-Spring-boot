package projem.kapında.wepApi.controllers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import projem.kapında.business.abstracts.OdemeService;
import projem.kapında.business.requests.CreatOdemeRequest;
import projem.kapında.business.requests.UpdateOdemeRequest;
import projem.kapında.business.responses.GetAllOdemeResponse;
import projem.kapında.business.responses.GetByIdOdemeResponse;

import java.util.List;

@RestController
@RequestMapping("api/odeme")
@AllArgsConstructor
public class OdemeControllers {
    private OdemeService odemeService;

    @GetMapping()
    public List<GetAllOdemeResponse> getAll(){
        return odemeService.getALl();
    }

    @GetMapping("/{id}")
    public GetByIdOdemeResponse getById(@PathVariable int id){
        return odemeService.getById(id);
    }

    @PostMapping()
    @ResponseStatus(code= HttpStatus.CREATED)
    public void add(@RequestBody CreatOdemeRequest creatOdemeRequest){
        this.odemeService.add(creatOdemeRequest);
    }

    @PutMapping()
    public void update(@RequestBody UpdateOdemeRequest updateOdemeRequest){
        this.odemeService.update(updateOdemeRequest);
    }

    @DeleteMapping("/{id}")
    public  void delete(@PathVariable int id){
        this.odemeService.delete(id);

    }
}
