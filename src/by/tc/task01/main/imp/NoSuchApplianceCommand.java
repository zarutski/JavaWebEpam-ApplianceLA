package by.tc.task01.main.imp;

import by.tc.task01.entity.Appliance;
import by.tc.task01.main.PrintCommand;

public class NoSuchApplianceCommand implements PrintCommand {

    @Override
    public void print(Appliance appliance) {
        System.out.println("There's no such appliance type");
    }
}
