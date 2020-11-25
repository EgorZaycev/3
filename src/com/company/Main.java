package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static long add(List<Integer> a, int b) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < b; i++) {
            a.add(i);
        }
        return System.currentTimeMillis() - time;
    }

    public static long get(List<Integer> a, int b) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < b; i++) {
            a.get(i);
        }
        return System.currentTimeMillis() - time;
    }

    public static long del(List<Integer> a, int b) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < b - 1; i++) {
            a.remove(1);
        }
        return System.currentTimeMillis() - time;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1000, 10000, 100000};
        ArrayList<Integer> arr = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Для " + a[i] + " элементов");
            System.out.println("Для LinkedList add: " + add(list, a[i]));
            System.out.println("Для ArrayList add: " + add(arr, a[i]));
            System.out.println("Для LinkedList get: " + get(list, a[i]));
            System.out.println("Для ArrayList get: " + get(arr, a[i]));
            System.out.println("Для LinkedList del: " + del(list, a[i]));
            System.out.println("Для ArrayList del: " + del(arr, a[i]));
            System.out.println();
        }
    }
}