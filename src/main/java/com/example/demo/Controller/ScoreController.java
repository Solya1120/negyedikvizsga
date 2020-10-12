package com.example.demo.Controller;


import com.example.demo.Modells.Score;
import com.example.demo.Services.ScoreServiceImpl;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ScoreController {
    public final ScoreServiceImpl scoreService;

    public ScoreController(ScoreServiceImpl scoreService){
        this.scoreService = scoreService;
    }

    @GetMapping(value = "/score")
    public List<Score> findAll(){
        return scoreService.findAll();
    }

    @PostMapping(value = "/score")
    public Score create(Score score){
        return scoreService.create(score);
    }

    @DeleteMapping(value = "/score/{id}")
    public void delete(@PathVariable("id") Integer id){
        scoreService.delete(id);
        System.out.println("Sikeres törlés");
    }

    @PostMapping(value = "/score/update")
    public Score update(Score score) {
        return scoreService.update(score);
    }


}
