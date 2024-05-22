package projem.kapında.wepApi.controllers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import projem.kapında.business.abstracts.RestorantService;
import projem.kapında.business.requests.CreatRestorantRequest;
import projem.kapında.business.requests.UpdateRestorantRequest;
import projem.kapında.business.responses.GetAllRestorantResponse;
import projem.kapında.business.responses.GetByIdRestorantResponse;

import java.util.List;

@RestController
@RequestMapping("/api/restorant")

@AllArgsConstructor
public class RestorantControllers {
    private RestorantService restorantService;

    @GetMapping()
    public List<GetAllRestorantResponse> getAll(){
        return restorantService.getALl();
    }

    @GetMapping("/{id}")
    public GetByIdRestorantResponse getById(@PathVariable int id){
        return restorantService.getById(id);
    }

    @PostMapping()
    @ResponseStatus(code= HttpStatus.CREATED)
    public void add(@RequestBody() CreatRestorantRequest creatRestorantRequest){
        this.restorantService.add(creatRestorantRequest);
    }

    @PutMapping()
    public void update(@RequestBody UpdateRestorantRequest updateRestorantRequest){
        this.restorantService.update(updateRestorantRequest);
    }

    @DeleteMapping("/{id}")
    public  void delete(@PathVariable int id){
        this.restorantService.delete(id);

    }
}
