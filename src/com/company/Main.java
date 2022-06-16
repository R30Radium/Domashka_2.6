package com.company;

import java.util.*;
import java.util.Objects;
import java.util.Set;
import java.util.List;
import java.util.Collections;
import java.util.Random;


public class Main {


    //Задание 1

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1,1,2,3,4,5,6,7,8,9,10 ));
        for (Integer R : numbers) {
            if (Objects.nonNull(R) && R % 2 == 1) {
                System.out.println(R);
            }
        }
    }

    private static Random Randommm = new Random();


    public static List<Integer> generateList(int P) {
        List<Integer> list = new ArrayList<>(P);
        System.out.println("Generated list: " );
        for (int i = 0; i < P; i++) {
            list.add(Randommm.nextInt(0,100));
        }
        System.out.println(list);
        return list;
    }

    //Задание 2

    public static void zadanie2(String[] args) {
        List<Integer> nume = generateList(20);
        Set<Integer> set = new TreeSet<>();
        for (Integer X : nume) {
            if (Objects.nonNull(X) && X % 2 == 0) {
                set.add(X);
            }
        }
        for (Integer X : set) {
            System.out.println(X);
        }
    }

    //Задание 3

    private static void zadanie3(){
        List<String> strings = List.of("te3st","te1st","test5","tes34t","te132st","te431st");
        System.out.println(new HashSet<>(strings));
    }

    //Задание 4

    private static void zadanie4(){
        List<String> stringssss = List.of("te3st","te1st","test5","tes34t","te132st","te431st");
        Map<String, Integer> result = new HashMap<>();
        for (String st: stringssss) {
            if (result.containsKey(st)){
                result.put(st, result.get(st) + 1);
            } else {
                result.put(st, 1);
            }
            for (Map.Entry<String, Integer> entry: result.entrySet()) {
                System.out.println(entry.getKey()+" -> " + entry.getValue());
            }
    }
}}