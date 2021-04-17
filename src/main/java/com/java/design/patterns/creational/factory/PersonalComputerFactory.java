package com.java.design.patterns.creational.factory;

public class PersonalComputerFactory {
    public PersonalComputer getPc(PCType pcType) {
        switch (pcType) {
            case HOME_EDITION:
                return new HomeEditionPC();
            case GAME_EDITION:
                return new GameEditionPC();
            case WORK_EDITION:
                return new WorkEditionPC();
            default:
                return null;
        }
    }
}
