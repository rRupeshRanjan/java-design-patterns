package com.java.design.patterns.creational.factory;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class PersonalComputer {
    protected int cpuCores;
    protected String cpuFlavour;
    protected String hdd;
    protected String ram;
    protected String os;
}
