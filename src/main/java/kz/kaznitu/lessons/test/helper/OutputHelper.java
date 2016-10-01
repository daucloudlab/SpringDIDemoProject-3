package kz.kaznitu.lessons.test.helper;

import kz.kaznitu.lessons.test.classes.CsvOutputGenerator;
import kz.kaznitu.lessons.test.interfaces.IOutputGenerator;

public class OutputHelper
{
    IOutputGenerator outputGenerator;

    public void generateOutput(){
        outputGenerator.generateOutput();
    }

    public void setOutputGenerator(IOutputGenerator outputGenerator){
        this.outputGenerator = outputGenerator;
    }
}