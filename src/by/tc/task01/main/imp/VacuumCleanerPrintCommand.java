package by.tc.task01.main.imp;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.main.PrintCommand;

public class VacuumCleanerPrintCommand implements PrintCommand {

    @Override
    public void print(Appliance appliance) {
        VacuumCleaner cleaner = (VacuumCleaner) appliance;

        String output = "VacuumCleaner: " +
                "powerConsumption=" + cleaner.getPowerConsumption() +
                ", filterType='" + cleaner.getFilterType() +
                ", bagType='" + cleaner.getBagType() +
                ", wandType='" + cleaner.getWandType() +
                ", motorSpeedRegulation=" + cleaner.getMotorSpeedRegulation() +
                ", cleaningWidth=" + cleaner.getCleaningWidth();

        System.out.println(output);
    }
}
