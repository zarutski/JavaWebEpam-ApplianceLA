package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;

public class Validator {

    public static boolean criteriaValidator(Criteria criteria) {

        Map<String, Object> objectMap = criteria.getCriteria();
        for (Map.Entry<String, Object> entry : objectMap.entrySet()) {

            if (entry.getValue() == null) {
                return false;
            }
        }

        return true;
    }
}
