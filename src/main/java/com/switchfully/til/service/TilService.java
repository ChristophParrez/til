package com.switchfully.til.service;

import com.switchfully.til.domain.Til;
import com.switchfully.til.repository.TilRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TilService {
    private final TilRepository tilRepository;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public TilService(TilRepository tilRepository) {
        this.tilRepository = tilRepository;
    }

    public List<Til> getTils() {
        return tilRepository.getTils();
    }

    public Til addTil(Til tilToAdd) {
        return tilRepository.addTil(tilToAdd);
    }

    public void removeTil(String id) {
        tilRepository.deleteTil(UUID.fromString(id));
    }
}
