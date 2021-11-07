package com.switchfully.til.api;

public class TilCreateDtoWithUI {
    private final String ownerName;
    private final String til;

    public TilCreateDtoWithUI(String ownerName, String til) {
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
