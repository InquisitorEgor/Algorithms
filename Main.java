package Homw;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        System.out.println(exponentiation(4, -2));
        System.out.println(exponentiation(3, 4));
        System.out.println("Task2");
        List<Item> list = new LinkedList<>();
        list.add(new Item("Книга",   1, 600));
        list.add(new Item("Бинокль", 2, 5000));
        list.add(new Item("Аптечка", 4, 1500));
        list.add(new Item("Ноутбук", 2, 40000));
        list.add(new Item("Котелок", 1, 500));


        Backpack backpack = new Backpack(5);
        backpack.calcBestSet(list);

        list = backpack.getBestSet();


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).name + " " + list.get(i).price);
        }

        System.out.println("Total best price is " + backpack.getBestPrice());
        System.out.println("Count: " + backpack.count);
    }
    private static double exponentiation(double digit, int rank) {
        if (rank < 0) {
            return 1 / (digit * exponentiation(digit, -rank - 1));
        } else {
            return rank > 0 ? digit * exponentiation(digit, rank - 1) : 1;
        }
    }
}
