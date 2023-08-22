package jproject.io.objectStream;

import java.io.Serializable;

public class DataObejct implements Serializable {
    String name;
    int age;
    String home;

    public DataObejct(String name, int age, String home) {
        this.name = name;
        this.age = age;
        this.home = home;
    }
}
