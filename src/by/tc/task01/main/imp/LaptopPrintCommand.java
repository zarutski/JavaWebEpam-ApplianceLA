package by.tc.task01.main.imp;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.main.PrintCommand;

public class LaptopPrintCommand implements PrintCommand {

    @Override
    public void print(Appliance appliance) {
        Laptop laptop = (Laptop) appliance;

        String output = "Laptop: " +
                "batteryCapacity=" + laptop.getBatteryCapacity() +
                ", OC='" + laptop.getOc() +
                ", memoryROM=" + laptop.getMemoryRom() +
                ", systemMemory=" + laptop.getSystemMemory() +
                ", cpu=" + laptop.getCpu() +
                ", displayInches=" + laptop.getDisplayInches();

        System.out.println(output);
    }
}
