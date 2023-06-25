package HW.HW4;

//Реализовать консольное приложение, которое:
//        1. Принимает от пользователя и “запоминает” строки.
//        2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//        3. Если введено revert, удаляет предыдущую введенную строку из памяти.
//        4. Если введено exit, то программа завершается
//
//        > - ввод в консоль (stdin), < - вывод на консоль (stdout)
//        > java
//        > python
//        > c#
//        > print
//< [c#, python, java]
//        > revert
//        > print
//< [python, java]
//        > revert
//        > revert
//        > print
//< []
//        > revert -> throw new NoSuchElementException


import java.util.LinkedList;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        while (true) {
            System.out.println("Введите строку:");
            String userInput = scanner.nextLine();

            if (userInput.equals("print")) {
                System.out.println("В обратном порядке:");
                while (!list.isEmpty()) {
                    System.out.println(list.removeLast());
                }
            } else if (userInput.equals("revert")) {
                if (!list.isEmpty()) {
                    list.removeLast();
                    System.out.println("Последняя строка удалена");
                } else {
                    System.out.println("Нет сохраненных строк для удаления.");
                }
            } else {
                list.addLast(userInput);
            }
        }
    }
}