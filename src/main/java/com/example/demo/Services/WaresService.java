package com.example.demo.Services;





import com.example.demo.Modells.Wares;

import java.util.List;

public interface WaresService {
    List<Wares> findAll();
    Wares create(Wares wares);
    void delete(Integer id);
    Wares update(Wares wares);
}
