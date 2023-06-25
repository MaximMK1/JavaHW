package HW.HW3;

//Пусть дан произвольный список целых чисел.
//
//        1) Найти максимальное значение
//        2) Найти минимальное значение
//        3) Найти среднее значение
//        4) Нужно удалить из него чётные числа

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> some_list = new ArrayList<>(Arrays.asList (8, 35, 7, 0, 9, 56, 5, 0, 1, 19, 1));
        System.out.println("Заданный массив: " + some_list);
        Max(some_list);
        Min(some_list);
        Sred(some_list);
        minus2num(some_list);
    }
    static void Max(List<Integer> arr) {
        int max = arr.get(0);
        for (int i = 0; i < arr.size()-1; i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        System.out.println("Максимальное значение: " + max);
    }
    static void Min(List<Integer> arr) {
        int min = arr.get(0);
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }
        System.out.println("Минимальное значение: " + min);
    }
    static void Sred (List<Integer> arr) {
        int sum = 0;
        double sr;
        for (int i=0; i < arr.size()-1; i++) {
            sum += arr.get(i);
        }
        sr = sum / arr.size();
        System.out.println("Среднее значение: " + sr);
    }

    static void minus2num (List<Integer> arr) {
        for (int i=0; i < arr.size()-1; i++) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
            }
        }
        System.out.println("Массив после удаления четных: " + arr);

    }
}
