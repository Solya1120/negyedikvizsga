package com.example.demo.Controller;


import com.example.demo.Modells.Statistics;
import com.example.demo.Modells.User;
import com.example.demo.Modells.Wares;
import com.example.demo.Services.StatisticsServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StatisticsController {
    public final StatisticsServiceImpl statisticsService;

    public StatisticsController(StatisticsServiceImpl statisticsService){
        this.statisticsService = statisticsService;
    }

    @GetMapping(value = "/statistics")
    public List<Statistics> findAll(){
        return statisticsService.findAll();
    }

    @PostMapping(value = "/statistics")
    public Statistics create(Statistics statistics){
        return statisticsService.create(statistics);
    }

    @DeleteMapping(value = "/statistics/{id}")
    public void delete(@PathVariable("id") Integer id){
        statisticsService.delete(id);
        System.out.println("Sikeres törlés");
    }

    @PostMapping(value = "/statistics/update")
    public Statistics update(Statistics statistics) {
        return statisticsService.update(statistics);
    }

    @GetMapping(value = "/statistics/selectAllStatisticsDESC")
    public List<Statistics> selectAllStatisticsDESC(){return statisticsService.selectAllStatisticsDESC();}

    @GetMapping(value = "/statistics/selectOneStatistics/{userIN}")
    public List<Statistics> selectOneStatistics(@PathVariable("userIN") Integer userIN){
        return statisticsService.selectOneStatistics(userIN);
    }

}
