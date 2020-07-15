package by.tc.task01.dao;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.IOException;
import java.util.List;

public interface ApplianceDAO {
	List<Appliance> find(Criteria criteria) throws IOException;
}
