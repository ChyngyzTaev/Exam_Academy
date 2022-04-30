package task3.displayOfPet;

import task3.animal.Cat;
import task3.animal.Dog;
import task3.animal.Parrot;
import task3.animal.Pet;

import java.util.Map;

public interface Display {
    Map <Cat, Pet> addCatAndPets();

    Map<Dog, Pet> addDogAndPets();

    Map<Parrot, Pet> addParrotAndPets();
}
