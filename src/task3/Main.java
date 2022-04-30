package task3;


import task3.displayOfPet.DisplayImpl;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        DisplayImpl display = new DisplayImpl(new HashMap<>(),new HashMap<>(),new HashMap<>());
        display.showAllPets();
    }
}
