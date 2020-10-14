package com.example.demo.Services;


import com.example.demo.Modells.Statistics;
import com.example.demo.Modells.User;
import com.example.demo.Repository.StatisticsRepository;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;

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
    @Override
    public List<Statistics> selectAllStatisticsDESC() {
        List<Statistics> statistics = statisticsRepository.selectAllStatisticsDESC();

        if(!CollectionUtils.isEmpty(statistics)) {
            return statistics;
        }

        throw new NoResultException("Nincs találat");

    }

    @Override
    public List<Statistics> selectOneStatistics(Integer userIN) {
        List<Statistics> statistics = statisticsRepository.selectOneStatistics(userIN);

        if(!CollectionUtils.isEmpty(statistics)) {
            return statistics;
        }

        throw new NoResultException("Nincs találat");

    }

    @Override
    public List<Object> joinTop3Statistics() {
        List<Object> statistics = statisticsRepository.joinTop3Statistics();

        if(!CollectionUtils.isEmpty(statistics)) {
            return statistics;
        }

        throw new NoResultException("Nincs találat");

    }



}
