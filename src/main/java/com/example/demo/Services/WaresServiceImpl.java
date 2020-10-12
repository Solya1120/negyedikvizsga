package com.example.demo.Services;


import com.example.demo.Modells.Wares;
import com.example.demo.Repository.WaresRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaresServiceImpl implements WaresService{
    public final WaresRepository waresRepository;

    public WaresServiceImpl(WaresRepository waresRepository){
        this.waresRepository = waresRepository;
    }

    @Override
    public List<Wares> findAll(){
        return waresRepository.findAll();
    }

    @Override
    public Wares create(Wares wares){
        waresRepository.save(wares);
        return wares;
    }

    @Override
    public void delete(Integer id) {
        waresRepository.deleteById(id);
    }

    @Override
    public Wares update(Wares wares) {
        waresRepository.save(wares);
        return wares;
    }
}
