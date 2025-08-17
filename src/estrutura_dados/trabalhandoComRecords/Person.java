package estrutura_dados.trabalhandoComRecords;

import java.util.SplittableRandom;

public record Person(String name, int age) {

    public Person {

    }
    public String getInfo() {
        return "Name: " + name + ", Age: " + age;
    }
}
