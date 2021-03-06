package com.example.demo.Controller;


import com.example.demo.Modells.CurrentGame;
import com.example.demo.Modells.Statistics;
import com.example.demo.Services.CurrentGameService;
import com.example.demo.Services.CurrentGameServiceImpl;
import com.example.demo.Services.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping(value = "/currentGame/selectAllPlayerDESC")
    public List<CurrentGame> selectAllPlayerDESC(){return currentGameService.selectAllPlayerDESC();}

    @GetMapping(value = "/currentGame/selectOnePlayer/{userIN}")
    public List<CurrentGame> selectOnePlayer(@PathVariable("userIN") Integer userIN){
        return currentGameService.selectOnePlayer(userIN);
    }

    @Autowired
    CurrentGameService CurrentGameService;

    @GetMapping("/currentGame/checkPlayerByUsername/{usernameIN}")
    public List<Object> checkPlayerByUsername(@PathVariable("usernameIN") String usernameIN)
    {
        return CurrentGameService.checkPlayerByUsername(usernameIN);
    }

    @GetMapping("/currentGame/selectUserNotPlayer")
    public List<Object> selectUserNotPlayer()
    {
        return CurrentGameService.selectUserNotPlayer();
    }

}
