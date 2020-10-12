package com.example.demo.Repository;



import com.example.demo.Modells.Wares;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WaresRepository extends JpaRepository<Wares, Integer> {

}
