package com.example.demo.Repository;



import com.example.demo.Modells.Statistics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StatisticsRepository extends JpaRepository<Statistics, Integer> {

}
