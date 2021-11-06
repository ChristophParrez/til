package com.switchfully.til.api;

import java.util.UUID;

public class TilDto {
    // UI needs ownerName
    // UI also needs temployee
    // Postman needs owner
    // In java, a Person is needed
    private final String temployee;
    // UI needs til
    // Postman needs knowledgeOfTheDay
    private final String til;
    // UI needs tid
    // Postman needs uuid
    private final UUID tid;

    public TilDto(String temployee, String til, UUID tid) {
        this.temployee = temployee;
        this.til = til;
        this.tid = tid;
    }

    public String getTemployee() {
        return temployee;
    }

    public String getOwnerName() {
        return temployee;
    }

    public String getOwner() {
        return temployee;
    }

    public String getTil() {
        return til;
    }

    public String getKnowledgeOfTheDay() {
        return til;
    }

    public UUID getTid() {
        return tid;
    }

    public UUID getUuid() {
        return tid;
    }
}
