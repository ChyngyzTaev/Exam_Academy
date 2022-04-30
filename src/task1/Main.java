package task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа: ");
        String numbers;
        numbers = sc.nextLine();
        Set<String> set = new HashSet<>();
        set.addAll(Arrays.asList(numbers.split(" ")));
        System.out.println(set);
    }
}

