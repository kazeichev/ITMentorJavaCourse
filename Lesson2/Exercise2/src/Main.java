import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person nikita = new Person();
        Person yulia = new Person();
        Person alexey = new Person();

        nikita
                .setAge(27)
                .setName("Nikita")
                .setSex((new Sex(Sex.MAN)));

        yulia
                .setAge(26)
                .setName("Yulia")
                .setSex((new Sex(Sex.WOMEN)));

        alexey
                .setAge(32)
                .setName("Alexey")
                .setSex((new Sex(Sex.MAN)));

        Person[] persons = new Person[]{nikita, yulia, alexey};

        System.out.println(Arrays.toString(persons));
        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));
    }
}
