package com.switchfully.til.api;

import java.util.UUID;

public class TilUICreateDto {    // UI needs ownerName
    private final String ownerName;
    private final String til;

    public TilUICreateDto(String ownerName, String til) {
        this.ownerName = ownerName;
        this.til = til;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getTil() {
        return til;
    }
}
