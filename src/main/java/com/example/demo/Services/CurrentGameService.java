package com.example.demo.Services;



import com.example.demo.Modells.CurrentGame;

import java.util.List;

public interface CurrentGameService {
    List<CurrentGame> findAll();
    CurrentGame create(CurrentGame currentGame);
    void delete(Integer id);
    CurrentGame update(CurrentGame currentGame);
}
