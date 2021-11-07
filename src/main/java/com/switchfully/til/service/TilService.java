package com.switchfully.til.service;

import com.switchfully.til.api.TilCreateDtoWithPostman;
import com.switchfully.til.api.TilCreateDtoWithUI;
import com.switchfully.til.api.TilDto;
import com.switchfully.til.domain.Til;
import com.switchfully.til.mapper.TilMapper;
import com.switchfully.til.repository.TilRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TilService {
    private final TilRepository tilRepository;
    private final TilMapper tilMapper;

    public TilService(TilRepository tilRepository, TilMapper tilMapper) {
        this.tilRepository = tilRepository;
        this.tilMapper = tilMapper;
    }

    public List<TilDto> getTils() {
        return tilMapper.toDto(tilRepository.getTils());
    }

    public void addTil(TilCreateDtoWithUI tilToAdd) {
        tilRepository.addTil(tilMapper.toEntity(tilToAdd));
    }

    public Til addTil(TilCreateDtoWithPostman tilToAdd) {
        return tilRepository.addTil(tilMapper.toEntity(tilToAdd));
    }

    public void removeTil(String id) {
        tilRepository.deleteTil(UUID.fromString(id));
    }
}
