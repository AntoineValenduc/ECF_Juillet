package com.ecfJuillet.back.services.impl;

import com.ecfJuillet.back.entities.Level;
import com.ecfJuillet.back.repositories.LevelRepository;
import com.ecfJuillet.back.services.LevelService;

import java.util.List;
import java.util.Optional;

public class LevelServiceImpl implements LevelService {

    private final LevelRepository levelRepository;

    public LevelServiceImpl(LevelRepository levelRepository) {
        this.levelRepository = levelRepository;
    }

    @Override
    public List<Level> getAllLevels() {
        return levelRepository.findAll();
    }

    @Override
    public Optional<Level> getLevelById(int id) {
        return levelRepository.findById(id);
    }
}
