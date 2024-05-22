package projem.kapında.wepApi.controllers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import projem.kapında.business.abstracts.MusteriService;
import projem.kapında.business.requests.CreatMusteriRequest;
import projem.kapında.business.requests.UpdateMusteriRequest;
import projem.kapında.business.responses.GetAllMusteriResponse;
import projem.kapında.business.responses.GetByIdMusteriResponse;

import java.util.List;
@RestController
@RequestMapping("api/musteri")
@AllArgsConstructor
public class MusteriControllers {

        private MusteriService musteriService;

        @GetMapping()
        public List<GetAllMusteriResponse> getAll(){
            return musteriService.getALl();
        }

        @GetMapping("/{id}")
        public GetByIdMusteriResponse getById(@PathVariable int id){
            return musteriService.getById(id);
        }

        @PostMapping()
        @ResponseStatus(code= HttpStatus.CREATED)
        public void add(@RequestBody() CreatMusteriRequest creatMusteriRequest){
            this.musteriService.add(creatMusteriRequest);
        }

        @PutMapping()
        public void update(@RequestBody UpdateMusteriRequest updateMusteriRequest){
            this.musteriService.update(updateMusteriRequest);
        }

        @DeleteMapping("/{id}")
        public  void delete(@PathVariable int id){
            this.musteriService.delete(id);

        }
    }


