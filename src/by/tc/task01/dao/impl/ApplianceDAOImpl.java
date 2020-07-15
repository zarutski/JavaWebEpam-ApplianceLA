package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.ApplianceReader;
import by.tc.task01.dao.ReaderFactory;
import by.tc.task01.dao.RecordParser;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.ApplianceFactory;
import by.tc.task01.entity.criteria.Criteria;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ApplianceDAOImpl implements ApplianceDAO {

    @Override
    public List<Appliance> find(Criteria criteria) throws IOException {

        ReaderFactory readerFactory = ReaderFactory.getInstance();
        ApplianceReader reader = readerFactory.getFileApplianceReader();

        String groupName = criteria.getGroupSearchName();
        List<String> applianceGroup = reader.loadGroup(groupName);

        ApplianceFactory factory = new ApplianceFactory();
        List<Appliance> suitableAppliances = new ArrayList<>();
        Appliance appliance;

        for (String record : applianceGroup) {

            if (isMatchingCriteria(record, criteria)) {
                String[] paramsValue = RecordParser.applianceParamsValue(record);
                appliance = factory.create(groupName, paramsValue);
                suitableAppliances.add(appliance);
            }
        }

        return suitableAppliances;
    }

    private boolean isMatchingCriteria(String record, Criteria criteria) {

        boolean matching = true;

        String[] recordParams = RecordParser.applianceParams(record);
        Map<String, Object> criteriaMap = criteria.getCriteria();

        for (Map.Entry<String, Object> criteriaEntry : criteriaMap.entrySet()) {
            String type = criteriaEntry.getKey();
            String value = criteriaEntry.getValue().toString();
            String criteriaParam = (type + "=" + value).toUpperCase();

            for (String recordParam : recordParams) {
                if (recordParam.startsWith(type) && (!(recordParam.toUpperCase()).equals(criteriaParam))) {
                    matching = false;
                    break;
                }
            }
        }

        return matching;
    }
}