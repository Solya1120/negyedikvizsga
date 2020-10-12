package com.example.demo.Services;


import com.example.demo.Modells.Score;
import com.example.demo.Repository.ScoreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreServiceImpl implements ScoreService{
    public final ScoreRepository scoreRepository;

    public ScoreServiceImpl(ScoreRepository scoreRepository){
        this.scoreRepository = scoreRepository;
    }

    @Override
    public List<Score> findAll(){
        return scoreRepository.findAll();
    }

    @Override
    public Score create(Score score){
        scoreRepository.save(score);
        return score;
    }

    @Override
    public void delete(Integer id) {
        scoreRepository.deleteById(id);
    }

    @Override
    public Score update(Score score) {
        scoreRepository.save(score);
        return score;
    }
}
