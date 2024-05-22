package projem.kapında.wepApi.controllers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import projem.kapında.business.abstracts.YemekService;
import projem.kapında.business.requests.CreatYemekRequest;
import projem.kapında.business.requests.UpdateYemekRequest;
import projem.kapında.business.responses.GetAllYemekResponse;
import projem.kapında.business.responses.GetByIdYemekResponse;

import java.util.List;

@RestController
@RequestMapping("/api/yemek")
@AllArgsConstructor
public class YemekControllers {
    private YemekService yemekService;

    @GetMapping()
    public List<GetAllYemekResponse> getAll(){
        return yemekService.getALl();
    }
    @GetMapping("/{id}")
    public GetByIdYemekResponse getById(@PathVariable int id){
        return yemekService.getById(id);
    }
    @PostMapping()
    @ResponseStatus(code= HttpStatus.CREATED)
    public void add(@RequestBody() CreatYemekRequest creatYemekRequest){
        this.yemekService.add(creatYemekRequest);
    }
    @PutMapping()
    public void update(@RequestBody UpdateYemekRequest updateYemekRequest){
        this.yemekService.update(updateYemekRequest);
    }
    @DeleteMapping("/{id}")
    public  void delete(@PathVariable int id){
        this.yemekService.delete(id);

    }

}
