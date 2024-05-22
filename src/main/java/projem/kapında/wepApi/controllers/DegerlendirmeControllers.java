package projem.kapında.wepApi.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import projem.kapında.business.abstracts.DegerlendirmeService;
import projem.kapında.business.requests.CreatDegerlendirmeRequest;
import projem.kapında.business.requests.UpdateDegerlendirmeRequest;
import projem.kapında.business.responses.GetAllDegerlendirmeResponse;
import projem.kapında.business.responses.GetByIdDegerlendirmeResponse;

import java.util.List;

@RestController
@RequestMapping("/api/degerlendirme")
@AllArgsConstructor
public class DegerlendirmeControllers {
   private DegerlendirmeService degerlendirmeService;

    @GetMapping()
    public List<GetAllDegerlendirmeResponse> getAll(){

        return degerlendirmeService.getALl();
    }

    @GetMapping("/{id}")
    public GetByIdDegerlendirmeResponse getById(@PathVariable int id){
        return degerlendirmeService.getById(id);
    }

    @PostMapping()
    @ResponseStatus(code= HttpStatus.CREATED)
    public void add(@RequestBody() CreatDegerlendirmeRequest creatDegerlendirmeRequest){
        this.degerlendirmeService.add(creatDegerlendirmeRequest);
    }

    @PutMapping()
    public void update(@RequestBody UpdateDegerlendirmeRequest updateDegerlendirmeRequest){
        this.degerlendirmeService.update(updateDegerlendirmeRequest);
    }

    @DeleteMapping("/{id}")
    public  void delete(@PathVariable int id){
        this.degerlendirmeService.delete(id);

    }


}
