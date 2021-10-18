package com.discordnotifier;

import java.util.ArrayList;

public class Quest {
    private String name;
    private boolean freetoplay;
    private String difficulty;
    private int questPoints;
    private String rewards;

    public Quest(String name, boolean freetoplay, String difficulty, int questPoints, String rewards) {
        this.name = name;
        this.freetoplay = freetoplay;
        this.difficulty = difficulty;
        this.questPoints = questPoints;
        this.rewards = rewards;
    }

    public String getName() {
        return name;
    }

    public boolean getFreeToPlay() {
        return freetoplay;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public int getQuestPoints() {
        return questPoints;
    }

    public String getRewards() {
        return rewards;
    }


}
