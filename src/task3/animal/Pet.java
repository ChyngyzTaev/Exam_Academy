package task3.animal;

import java.util.Objects;

public class Pet {
    String name;
    int age;

    public Pet() {

    }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet petAbs = (Pet) o;
        return age == petAbs.age && Objects.equals(name, petAbs.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
