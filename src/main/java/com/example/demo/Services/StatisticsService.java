package com.example.demo.Services;



import com.example.demo.Modells.Statistics;
import com.example.demo.Modells.User;

import java.util.List;

public interface StatisticsService {
    List<Statistics> findAll();
    Statistics create(Statistics statistics);
    void delete(Integer id);
    Statistics update(Statistics statistics);
    List<Statistics> selectAllStatisticsDESC();
    List<Statistics> selectOneStatistics(Integer userIN);
    List<Object> joinTop3Statistics();

}
