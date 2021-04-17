package com.java.design.patterns.creational;

import com.java.design.patterns.creational.factory.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonalComputerFactoryTest {

    @Test
    void shouldCreateHomeEditionPC() {
        PersonalComputerFactory personalComputerFactory = new PersonalComputerFactory();
        PersonalComputer pc = personalComputerFactory.getPc(PCType.HOME_EDITION);

        assertEquals("i3", pc.getCpuFlavour());
        assertEquals(4, pc.getCpuCores());
        assertEquals("500GB", pc.getHdd());
        assertEquals("Windows Home Edition", pc.getOs());
        assertEquals("8GB", pc.getRam());
    }

    @Test
    void shouldCreateWorkEditionPC() {
        PersonalComputerFactory personalComputerFactory = new PersonalComputerFactory();
        PersonalComputer pc = personalComputerFactory.getPc(PCType.WORK_EDITION);

        assertEquals("i9", pc.getCpuFlavour());
        assertEquals(8, pc.getCpuCores());
        assertEquals("2TB", pc.getHdd());
        assertEquals("Mac OS Sur", pc.getOs());
        assertEquals("32GB", pc.getRam());
    }

    @Test
    void shouldCreateGameEditionPC() {
        PersonalComputerFactory personalComputerFactory = new PersonalComputerFactory();
        PersonalComputer pc = personalComputerFactory.getPc(PCType.GAME_EDITION);

        assertEquals("Intel M1", pc.getCpuFlavour());
        assertEquals(32, pc.getCpuCores());
        assertEquals("2TB", pc.getHdd());
        assertEquals("Windows Ultimate Edition", pc.getOs());
        assertEquals("32GB", pc.getRam());
    }
}