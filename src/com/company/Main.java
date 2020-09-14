package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] arr = {10.0, -12.3, 43.5, 34.5, -10.0,
                2.3, 43.5, -34.5, 10.0, 12.3,
                43.5, 34.5, 55.7, 34.5, -10.2};

        int colichestvo = 0;
        double sum = 0;
        boolean knopka = false;

        for (double number : arr) {
            if (knopka) {
                colichestvo++;
                sum += number;
            }
            if (number < 0) {
                knopka = true;
            }
        }
        System.out.println("summa: " + sum);
        System.out.println("colichestvo: " + colichestvo);
        System.out.println("srednee arifmeticheskor chislo: " + sum / colichestvo);


        for (int i = 0; i < arr.length; i++) {              // Dopolnitelnoe zadanie na soobrazitelnost
            double minValue = arr[i];
            for (int i1 = i; i1 < arr.length; i1++) {
                if (minValue > arr[i1]){
                 double d = minValue;
                 minValue = arr[i1];
                 arr[i1] = d;
                }
            }
            arr[i] = minValue;
        }

        System.out.println(Arrays.toString(arr));

    }
}
