package com.example.demo.Controller;



import com.example.demo.Modells.Wares;
import com.example.demo.Services.WaresServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WaresController {
    public final WaresServiceImpl waresService;

    public WaresController(WaresServiceImpl waresService){
        this.waresService = waresService;
    }

    @GetMapping(value = "/wares")
    public List<Wares> findAll(){
        return waresService.findAll();
    }

    @PostMapping(value = "/wares")
    public Wares create(Wares wares){
        return waresService.create(wares);
    }

    @DeleteMapping(value = "/wares/{id}")
    public void delete(@PathVariable("id") Integer id){
        waresService.delete(id);
        System.out.println("Sikeres törlés");
    }

    @PostMapping(value = "/wares/update")
    public Wares update(Wares wares) {
        return waresService.update(wares);
    }


}
