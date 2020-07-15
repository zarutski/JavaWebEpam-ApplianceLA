package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Appliance> appliances = null;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //////////////////////////////////////////////////////////////////

        Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
        criteriaOven.add(Oven.CAPACITY.toString(), 33);

        try {
            appliances = service.find(criteriaOven);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (appliances != null) {
            for (Appliance appliance : appliances) {
                PrintApplianceInfo.print(appliance);
            }
        }

        //////////////////////////////////////////////////////////////////

        criteriaOven = new Criteria(Oven.class.getSimpleName());
        criteriaOven.add(Oven.HEIGHT.toString(), 200);
        criteriaOven.add(Oven.DEPTH.toString(), 300);

        try {
            appliances = service.find(criteriaOven);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (appliances != null) {
            for (Appliance appliance : appliances) {
                PrintApplianceInfo.print(appliance);
            }
        }

        //////////////////////////////////////////////////////////////////

        Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());

        criteriaTabletPC.add(TabletPC.COLOR.toString(), "BLUE");
        criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
        criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 8000);

        try {
            appliances = service.find(criteriaTabletPC);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (appliances != null) {
            for (Appliance appliance : appliances) {
                PrintApplianceInfo.print(appliance);
            }
        }
    }
}