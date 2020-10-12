package com.example.demo.Services;



import com.example.demo.Modells.Score;

import java.util.List;

public interface ScoreService {
    List<Score> findAll();
    Score create(Score score);
    void delete(Integer id);
    Score update(Score score);
}
