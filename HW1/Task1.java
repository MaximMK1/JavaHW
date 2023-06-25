package HW.HW1;

//1. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] Array01 = new int[]{3, 1, 8, 4, 0, 10, 2, 7, 4, 9};
        System.out.println(Arrays.toString(Array01));
        int max = Array01[0];
        for (int i : Array01) {
            if (i > max)
                max = i;
        }
        System.out.println("Максимальное число массива: " + max);

        int min = Array01[0];
        for (int i : Array01) {
            if (i < min)
                min = i;
        }
        System.out.println("Минимальное число массива: " + min);
    }
}
