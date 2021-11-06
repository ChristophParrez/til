package com.switchfully.til.mapper;

import com.switchfully.til.api.TilUICreateDto;
import com.switchfully.til.api.TilDto;
import com.switchfully.til.domain.Til;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class TilMapper {
    public Til toEntity(TilUICreateDto dto) {
        return new Til(dto.getOwnerName(), dto.getTil(), UUID.randomUUID());
    }

    public TilDto toDto(Til entity) {
        return new TilDto(entity.getOwner(), entity.getKnowledgeOfTheDay(), entity.getUuid());
    }

    public List<TilDto> toDto(List<Til> tils) {
        return tils.stream().map(this::toDto).collect(Collectors.toList());
    }
}
