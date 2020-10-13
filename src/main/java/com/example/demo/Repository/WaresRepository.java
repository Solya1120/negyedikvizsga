package com.example.demo.Repository;


import com.example.demo.Modells.Wares;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface WaresRepository extends JpaRepository<Wares, Integer> {

    @Query(value = "SELECT * FROM `Wares` ORDER BY `wares`.`price` DESC LIMIT 3", nativeQuery = true)
    List<Wares> selectTop3Wares();

}
