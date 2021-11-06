package com.switchfully.til.api;

import java.util.UUID;

public class TilDto {
    private final String temployee;
    private final String til;
    private final UUID tid;

    public TilDto(String temployee, String til, UUID tid) {
        this.temployee = temployee;
        this.til = til;
        this.tid = tid;
    }

    public String getTemployee() {
        return temployee;
    }

    public String getTil() {
        return til;
    }

    public UUID getTid() {
        return tid;
    }
}
