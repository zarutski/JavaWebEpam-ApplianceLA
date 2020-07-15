package by.tc.task01.dao;

import by.tc.task01.dao.impl.FileApplianceReader;

public final class ReaderFactory {

    private static final ReaderFactory instance = new ReaderFactory();

    private final ApplianceReader fileApplianceReader = new FileApplianceReader();

    private ReaderFactory() {}

    public ApplianceReader getFileApplianceReader() {
        return fileApplianceReader;
    }

    public static ReaderFactory getInstance() {
        return instance;
    }
}