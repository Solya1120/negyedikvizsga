package com.example.demo.Repository;


import com.example.demo.Modells.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ScoreRepository extends JpaRepository<Score, Integer> {

}
