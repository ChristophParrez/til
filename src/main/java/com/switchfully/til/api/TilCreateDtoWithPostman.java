package com.switchfully.til.api;

public class TilCreateDtoWithPostman {
    private final String owner;
    private final String knowledgeOfTheDay;

    public TilCreateDtoWithPostman(String owner, String knowledgeOfTheDay) {
        this.owner = owner;
        this.knowledgeOfTheDay = knowledgeOfTheDay;
    }

    public String getOwnerName() {
        return owner;
    }

    public String getTil() {
        return knowledgeOfTheDay;
    }
}
