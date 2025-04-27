package com.mk.dev.practice;

import java.util.*;

public class HoldStuff {

    public static void SimpleArrayList() {
        String[] names = {"Jane", "Bob", "John", "Jack", "Jennie"};
        List<String> list = new ArrayList<>(List.of(names));

        System.out.println(list);

        list.add("Paul");
        list.addAll(List.of("Benny", "Sully"));
        System.out.println(list);

        System.out.println(list.contains("Paul"));

        list.removeIf(n -> n.equals("Paul"));
        System.out.println(list);
        System.out.println(list.contains("Paul"));
    }

    public static void SimpleCollection() {
        String[] names = {"Jane", "Bob", "John", "Jack", "Jennie"};
        Collection<String> list = new HashSet<>(List.of(names));

        System.out.println(list);

        list.add("Paul");
        list.addAll(List.of("Benny", "Sully"));
        System.out.println(list);

        System.out.println(list.contains("Paul"));

        list.removeIf(n -> n.equals("Paul"));
        System.out.println(list);
        System.out.println(list.contains("Paul"));


    }
}
