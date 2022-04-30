package task3.animal;

public class Parrot extends Pet{
    public Parrot() {
    }

    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
