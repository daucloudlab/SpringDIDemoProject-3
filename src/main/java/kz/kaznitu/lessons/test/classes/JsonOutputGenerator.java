package kz.kaznitu.lessons.test.classes;

import kz.kaznitu.lessons.test.interfaces.IOutputGenerator;

public class JsonOutputGenerator implements IOutputGenerator
{
    public void generateOutput(){
        System.out.println("Json Output Generator");
    }
}