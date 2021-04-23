public class Person implements Comparable {
    private int age;
    private Sex sex;
    private String name;

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public int getAge() {
        return this.age;
    }

    public Person setSex(Sex sex) {
        this.sex = sex;
        return this;
    }

    public Sex getSex() {
        return sex;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", sex=" + sex +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        int result;

        if (this.getSex().getSex().equals(Sex.MAN) && ((Person) o).getSex().getSex().equals(Sex.WOMEN)) {
            result = -1;
        } else {
            if (this.getSex().getSex().equals(Sex.MAN) && ((Person) o).getSex().getSex().equals(Sex.MAN)) {
                result = 0;
            } else {
                result = 1;
            }
        }

        return result;
    }
}
