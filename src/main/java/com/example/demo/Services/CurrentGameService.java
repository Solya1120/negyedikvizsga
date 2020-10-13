package com.example.demo.Services;



import com.example.demo.Modells.CurrentGame;
import com.example.demo.Modells.Statistics;

import java.util.List;

public interface CurrentGameService {
    List<CurrentGame> findAll();
    CurrentGame create(CurrentGame currentGame);
    void delete(Integer id);
    CurrentGame update(CurrentGame currentGame);
    List<CurrentGame> selectAllPlayerDESC();
    List<CurrentGame> selectOnePlayer(Integer userIN);
}
