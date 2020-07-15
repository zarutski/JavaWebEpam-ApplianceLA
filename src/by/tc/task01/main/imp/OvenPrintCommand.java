package by.tc.task01.main.imp;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import by.tc.task01.main.PrintCommand;

public class OvenPrintCommand implements PrintCommand {

    @Override
    public void print(Appliance appliance) {
        Oven oven = (Oven) appliance;

        String output = "Oven: " +
                "powerConsumption=" + oven.getPowerConsumption() +
                ", weight=" + oven.getWeight() +
                ", capacity=" + oven.getCapacity() +
                ", depth=" + oven.getDepth() +
                ", height=" + oven.getHeight() +
                ", width=" + oven.getWidth();

        System.out.println(output);
    }
}
