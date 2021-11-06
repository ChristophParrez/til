package com.switchfully.til.mapper;

import com.switchfully.til.api.TilUICreateDto;
import com.switchfully.til.api.TilUIDto;
import com.switchfully.til.domain.Til;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TilMapper {
    public Til toEntity(TilUICreateDto dto) {
        return new Til(dto.getOwnerName(), dto.getTil(), dto.getUuid());
    }

    public TilUIDto toDto(Til entity) {
        return new TilUIDto(entity.getOwner(), entity.getKnowledgeOfTheDay(), entity.getUuid());
    }

    public List<TilUIDto> toDto(List<Til> tils) {
        return tils.stream().map(this::toDto).collect(Collectors.toList());
    }
}
