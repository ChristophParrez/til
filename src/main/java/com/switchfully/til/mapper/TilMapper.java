package com.switchfully.til.mapper;

import com.switchfully.til.api.TilCreateDto;
import com.switchfully.til.domain.Til;
import org.springframework.stereotype.Service;

@Service
public class TilMapper {
    public Til toEntity(TilCreateDto dto) {
        return new Til(dto.getOwnerName(), dto.getTil(), dto.getUuid());
    }
}
