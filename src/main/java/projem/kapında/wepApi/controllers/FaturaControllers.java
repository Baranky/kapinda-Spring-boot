package projem.kapında.wepApi.controllers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import projem.kapında.business.abstracts.FaturaService;
import projem.kapında.business.requests.CreatFaturaRequest;
import projem.kapında.business.requests.UpdateFaturaRequest;
import projem.kapında.business.responses.GetAllFaturaResponse;
import projem.kapında.business.responses.GetByIdFaturaResponse;


import java.util.List;

@RestController
@RequestMapping("api/fatura")
@AllArgsConstructor

public class FaturaControllers {
    private FaturaService faturaService;

    @GetMapping()
    public List<GetAllFaturaResponse> getAll(){

        return faturaService.getALl();
    }

    @GetMapping("/{id}")
    public GetByIdFaturaResponse getById(@PathVariable int id){
        return faturaService.getById(id);
    }

    @PostMapping()
    @ResponseStatus(code= HttpStatus.CREATED)
    public void add(@RequestBody() CreatFaturaRequest creatFaturaRequest){
        this.faturaService.add(creatFaturaRequest);
    }

    @PutMapping()
    public void update(@RequestBody UpdateFaturaRequest updateFaturaRequest){
        this.faturaService.update(updateFaturaRequest);
    }

    @DeleteMapping("/{id}")
    public  void delete(@PathVariable int id){
        this.faturaService.delete(id);

    }
}

