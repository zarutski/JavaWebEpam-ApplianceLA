package by.tc.task01.main.imp;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.main.PrintCommand;

public class TablePCPrintCommand implements PrintCommand {

    @Override
    public void print(Appliance appliance) {
        TabletPC tabletPC = (TabletPC) appliance;

        String output = "TablePC: " +
                "batteryCapacity=" + tabletPC.getBatteryCapacity() +
                ", displayInches=" + tabletPC.getDisplayInches() +
                ", memoryROM=" + tabletPC.getMemoryROM() +
                ", FlashMemoryCapacity=" + tabletPC.getFlashMemoryCapacity() +
                ", color=" + tabletPC.getColor();

        System.out.println(output);
    }
}
