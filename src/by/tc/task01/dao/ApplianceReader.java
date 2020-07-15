package by.tc.task01.dao;

import java.io.IOException;
import java.util.List;

public interface ApplianceReader {

    List<String> loadGroup(String group) throws IOException;
}
