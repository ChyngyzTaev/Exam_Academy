package task3.displayOfPet;

import task3.animal.Cat;
import task3.animal.Dog;
import task3.animal.Parrot;
import task3.animal.Pet;

import java.util.Map;

public class DisplayImpl implements Display{
    private Map<Cat, Pet> cat;
    private Map<Dog, Pet> dog;
    private Map<Parrot, Pet> parrot;

    public DisplayImpl() {
    }

    public DisplayImpl(Map<Cat, Pet> cat, Map<Dog, Pet> dog, Map<Parrot, Pet> parrot) {
        this.cat = cat;
        this.dog = dog;
        this.parrot = parrot;
    }

    public void showAllPets() {
        System.out.println(addCatAndPets().keySet());
        System.out.println(addDogAndPets().keySet());
        System.out.println(addParrotAndPets().keySet());
    }

    @Override
    public Map<Cat, Pet> addCatAndPets() {
        cat.put(new Cat("Morty", 2), new Parrot("Kosh", 1));
        cat.put(new Cat("Sad", 2), new Dog("Pety", 1));
        cat.put(new Cat("Con", 2), new Cat("Omar", 1));
        return cat;
    }

    @Override
    public Map<Dog, Pet> addDogAndPets() {
        dog.put(new Dog("Bob", 1), new Cat("Morty", 2));
        dog.put(new Dog("None", 2), new Dog("Pety", 1));
        dog.put(new Dog("Agent", 2), new Parrot("Kosh", 1));
        return dog;
    }

    @Override
    public Map<Parrot, Pet> addParrotAndPets() {
        parrot.put(new Parrot("Mag", 1), new Dog("Pety", 1));
        parrot.put(new Parrot("Kaban", 2), new Parrot("Kosh", 1));
        parrot.put(new Parrot("Drag", 1), new Cat("Morty", 2));
        return parrot;
    }

    public Map<Cat, Pet> getCat() {
        return cat;
    }

    public void setCat(Map<Cat, Pet> cat) {
        this.cat = cat;
    }

    public Map<Dog, Pet> getDog() {
        return dog;
    }

    public void setDog(Map<Dog, Pet> dog) {
        this.dog = dog;
    }

    public Map<Parrot, Pet> getParrot() {
        return parrot;
    }

    public void setParrot(Map<Parrot, Pet> parrot) {
        this.parrot = parrot;
    }
}
