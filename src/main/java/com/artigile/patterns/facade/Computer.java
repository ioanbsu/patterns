package com.artigile.patterns.facade;

/**
 * @author IoaN, 2/6/12 12:26 PM
 */
public class Computer {

    private CPU cpu;

    private Memory memory;

    private HardDrive hardDrive;

    public Computer() {
        cpu = new CPU();
        memory = new Memory();
        hardDrive = new HardDrive();
    }

    public void startComputer() {
        cpu.freeze();
        memory.load(222, hardDrive.read(223, 123));
        cpu.jump(223);
        cpu.execute();
    }
}
