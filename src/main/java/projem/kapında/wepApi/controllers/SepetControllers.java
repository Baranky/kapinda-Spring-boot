package projem.kapında.wepApi.controllers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import projem.kapında.business.abstracts.SepetService;
import projem.kapında.business.requests.CreatSepetRequest;
import projem.kapında.business.requests.UpdateSepetRequest;
import projem.kapında.business.responses.GetAllSepetResponse;
import projem.kapında.business.responses.GetByIdSepetResponse;

import java.util.List;

@RestController
@RequestMapping("api/sepet")
@AllArgsConstructor
public class SepetControllers {
    private SepetService sepetService;

    @GetMapping()
    public List<GetAllSepetResponse> getAll(){
        return sepetService.getALl();
    }
    @GetMapping("/{id}")
    public GetByIdSepetResponse getById(@PathVariable int id){
        return sepetService.getById(id);
    }

    @PostMapping()
    @ResponseStatus(code= HttpStatus.CREATED)
    public void add(@RequestBody() CreatSepetRequest creatSepetRequest){
        this.sepetService.add(creatSepetRequest);
    }

    @PutMapping()
    public void update(@RequestBody UpdateSepetRequest updateSepetRequest){
        this.sepetService.update(updateSepetRequest);
    }

    @DeleteMapping("/{id}")
    public  void delete(@PathVariable int id){
        this.sepetService.delete(id);

    }

}
