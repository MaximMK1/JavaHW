package HW.HW1;

//2. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
//заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
//Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
//то есть [0][0], [1][1], [2][2], …, [n][n];

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[][] XXArray = new int[5][5];
//        System.out.println(Arrays.deepToString(XXArray));
        for (int i = 0; i < XXArray.length; i++) {
            XXArray[i][i] = 1;
            XXArray[i][XXArray.length - i - 1] = 1;
        }
        for (int i = 0; i < XXArray.length; i++) {
            for (int j = 0; j < XXArray.length; j++) {
                System.out.print(XXArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

