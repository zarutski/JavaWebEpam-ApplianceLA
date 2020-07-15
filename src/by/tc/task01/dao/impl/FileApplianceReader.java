package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileApplianceReader implements ApplianceReader {

    @Override
    public List<String> loadGroup(String group) throws IOException {

        Path filePath = FileSystems.getDefault().getPath("resources" + File.separator + "appliances_db.txt");
        List<String> records = new ArrayList<>();

        boolean startReadingGroup = false;
        try (BufferedReader reader = Files.newBufferedReader(filePath)) {

            String currentLine;
            while ((currentLine = reader.readLine()) != null) {

                if (!currentLine.startsWith(group)) {
                    continue;
                }

                if (!startReadingGroup && (currentLine.startsWith(group))) {
                    startReadingGroup = true;
                }

                if (startReadingGroup && (currentLine.isEmpty())) {
                    break;
                }

                records.add(currentLine);
            }
        }

        return records;
    }
}
