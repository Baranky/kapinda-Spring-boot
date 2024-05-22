package projem.kapında.wepApi.controllers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import projem.kapında.business.abstracts.KampanyaService;
import projem.kapında.business.requests.CreatKampanyaRequest;
import projem.kapında.business.requests.UpdateKampanyaRequest;
import projem.kapında.business.responses.GetAllKampanyaResponse;
import projem.kapında.business.responses.GetByIdKampanyaResponse;


import java.util.List;
@RestController
@RequestMapping("api/kampanya")
@AllArgsConstructor
public class KampanyaControllers {

        private KampanyaService kampanyaService;

        @GetMapping()
        public List<GetAllKampanyaResponse> getAll(){

            return kampanyaService.getALl();
        }

        @GetMapping("/{id}")
        public GetByIdKampanyaResponse getById(@PathVariable int id){
            return kampanyaService.getById(id);
        }

        @PostMapping()
        @ResponseStatus(code= HttpStatus.CREATED)
        public void add(@RequestBody() CreatKampanyaRequest creatKampanyaRequest){
            this.kampanyaService.add(creatKampanyaRequest);
        }

        @PutMapping()
        public void update(@RequestBody UpdateKampanyaRequest updateKampanyaRequest){
            this.kampanyaService.update(updateKampanyaRequest);
        }

        @DeleteMapping("/{id}")
        public  void delete(@PathVariable int id){
            this.kampanyaService.delete(id);

        }

}
