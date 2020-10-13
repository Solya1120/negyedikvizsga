package com.example.demo.Repository;



import com.example.demo.Modells.Statistics;
import com.example.demo.Modells.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StatisticsRepository extends JpaRepository<Statistics, Integer> {
    @Query(value = "SELECT * FROM `Statistics` ORDER BY `Statistics`.`total_score` DESC", nativeQuery = true)
    List<Statistics> selectAllStatisticsDESC();

    @Query(value = "SELECT * FROM `Statistics` WHERE `Statistics`.`user_id`= :userIN", nativeQuery = true)
    List<Statistics>  selectOneStatistics(@Param("userIN") Integer userIN);

}
