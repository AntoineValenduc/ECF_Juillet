package com.ecfJuillet.back.services;

import com.ecfJuillet.back.entities.Level;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface LevelService {

    public List<Level> getAllLevels();

    public Optional<Level> getLevelById(int id);
}
