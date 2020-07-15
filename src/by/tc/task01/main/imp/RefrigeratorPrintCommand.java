package by.tc.task01.main.imp;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.main.PrintCommand;

public class RefrigeratorPrintCommand implements PrintCommand {

    @Override
    public void print(Appliance appliance) {
        Refrigerator refrigerator = (Refrigerator) appliance;

        String output = "Refrigerator: " +
                "powerConsumption=" + refrigerator.getPowerConsumption() +
                ", weight=" + refrigerator.getWeight() +
                ", freezerCapacity=" + refrigerator.getFreezerCapacity() +
                ", overallCapacity=" + refrigerator.getOverallCapacity() +
                ", height=" + refrigerator.getHeight() +
                ", width=" + refrigerator.getWidth();

        System.out.println(output);
    }
}
