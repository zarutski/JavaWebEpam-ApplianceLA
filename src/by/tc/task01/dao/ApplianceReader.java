package by.tc.task01.dao;

import by.tc.task01.dao.exception.DaoException;

import java.util.List;

public interface ApplianceReader {

    List<String> loadGroup(String group) throws DaoException;
}
