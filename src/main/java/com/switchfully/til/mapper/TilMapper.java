package com.switchfully.til.mapper;

import com.switchfully.til.api.TilCreateDto;
import com.switchfully.til.api.TilDto;
import com.switchfully.til.domain.Til;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TilMapper {
    public Til toEntity(TilCreateDto dto) {
        return new Til(dto.getOwnerName(), dto.getTil(), dto.getUuid());
    }

    public TilDto toDto(Til entity) {
        return new TilDto(entity.getOwner(), entity.getKnowledgeOfTheDay(), entity.getUuid());
    }

    public List<TilDto> toDto(List<Til> tils) {
        return tils.stream().map(this::toDto).collect(Collectors.toList());
    }
}
