package kz.kaznitu.lessons.test.classes;

import kz.kaznitu.lessons.test.interfaces.IOutputGenerator;

public class CsvOutputGenerator implements IOutputGenerator {
    public void generateOutput() {
        System.out.println("Csv Output Generator");
    }
}