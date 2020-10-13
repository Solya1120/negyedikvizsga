package com.example.demo.Services;


import com.example.demo.Modells.CurrentGame;
import com.example.demo.Modells.Statistics;
import com.example.demo.Repository.CurrentGameRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.persistence.NoResultException;
import java.util.List;

@Service
public class CurrentGameServiceImpl implements CurrentGameService{
    public final CurrentGameRepository currentGameRepository;

    public CurrentGameServiceImpl(CurrentGameRepository currentGameRepository){
        this.currentGameRepository = currentGameRepository;
    }

    @Override
    public List<CurrentGame> findAll(){
        return currentGameRepository.findAll();
    }

    @Override
    public CurrentGame create(CurrentGame currentGame){
        currentGameRepository.save(currentGame);
        return currentGame;
    }

    @Override
    public void delete(Integer id) {
        currentGameRepository.deleteById(id);
    }

    @Override
    public CurrentGame update(CurrentGame currentGame) {
        currentGameRepository.save(currentGame);
        return currentGame;
    }

    @Override
    public List<CurrentGame> selectAllPlayerDESC() {
        List<CurrentGame> currentGame = currentGameRepository.selectAllPlayerDESC();

        if(!CollectionUtils.isEmpty(currentGame)) {
            return currentGame;
        }

        throw new NoResultException("Nincs találat");

    }

    @Override
    public List<CurrentGame> selectOnePlayer(Integer userIN) {
        List<CurrentGame> currentGame = currentGameRepository.selectOnePlayer(userIN);

        if(!CollectionUtils.isEmpty(currentGame)) {
            return currentGame;
        }

        throw new NoResultException("Nincs találat");

    }
}
