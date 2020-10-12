package com.example.demo.Controller;


import com.example.demo.Modells.CurrentGame;
import com.example.demo.Services.CurrentGameServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CurrentGameController {
    public final CurrentGameServiceImpl currentGameService;

    public CurrentGameController(CurrentGameServiceImpl currentGameService){
        this.currentGameService = currentGameService;
    }

    @GetMapping(value = "/currentGame")
    public List<CurrentGame> findAll(){
        return currentGameService.findAll();
    }

    @PostMapping(value = "/currentGame")
    public CurrentGame create(CurrentGame currentGame){
        return currentGameService.create(currentGame);
    }

    @DeleteMapping(value = "/currentGame/{id}")
    public void delete(@PathVariable("id") Integer id){
        currentGameService.delete(id);
        System.out.println("Sikeres törlés");
    }

    @PostMapping(value = "/currentGame/update")
    public CurrentGame update(CurrentGame currentGame) {
        return currentGameService.update(currentGame);
    }


}
