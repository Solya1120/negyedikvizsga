package com.example.demo.Services;


import com.example.demo.Modells.Statistics;
import com.example.demo.Repository.StatisticsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatisticsServiceImpl implements StatisticsService{
    public final StatisticsRepository statisticsRepository;

    public StatisticsServiceImpl(StatisticsRepository statisticsRepository){
        this.statisticsRepository = statisticsRepository;
    }

    @Override
    public List<Statistics> findAll(){
        return statisticsRepository.findAll();
    }

    @Override
    public Statistics create(Statistics statistics){
        statisticsRepository.save(statistics);
        return statistics;
    }

    @Override
    public void delete(Integer id) {
        statisticsRepository.deleteById(id);
    }

    @Override
    public Statistics update(Statistics statistics) {
        statisticsRepository.save(statistics);
        return statistics;
    }
}
