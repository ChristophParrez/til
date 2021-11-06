package com.switchfully.til.api;

import com.switchfully.til.domain.Til;

import java.util.Objects;
import java.util.UUID;

public class TilCreateDto {    // UI needs ownerName
    private final String ownerName;
    private final String til;
    private final UUID uuid;

    public TilCreateDto(String ownerName, String til, UUID uuid) {
        this.ownerName = ownerName;
        this.til = til;
        this.uuid = uuid;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getTil() {
        return til;
    }

    public UUID getUuid() {
        return uuid;
    }
}
