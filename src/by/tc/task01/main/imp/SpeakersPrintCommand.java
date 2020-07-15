package by.tc.task01.main.imp;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;
import by.tc.task01.main.PrintCommand;

public class SpeakersPrintCommand implements PrintCommand {

    @Override
    public void print(Appliance appliance) {
        Speakers speakers = (Speakers) appliance;

        String output = "Speakers: " +
                "powerConsumption=" + speakers.getPowerConsumption() +
                ", numOfSpeakers=" + speakers.getNumOfSpeakers() +
                ", frequencyRange='" + speakers.getFrequencyRange() +
                ", cordLength=" + speakers.getCordLength();

        System.out.println(output);
    }
}
