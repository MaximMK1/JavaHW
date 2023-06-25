package HW.HW1;

//3. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
//
//        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//        "Доброй ночи, <Имя>!", если время от 23:00 до 4:59


import java.time.LocalTime;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");

        String name = scanner.nextLine();

        LocalTime currentTime = LocalTime.now();

        // Determine the appropriate greeting based on the time of day
        String greeting;
        if (currentTime.isAfter(LocalTime.of(5, 0)) && currentTime.isBefore(LocalTime.of(12, 0))) {
            greeting = "Доброе утро";
        } else if (currentTime.isAfter(LocalTime.of(12, 0)) && currentTime.isBefore(LocalTime.of(18, 0))) {
            greeting = "Добрый день";
        } else if (currentTime.isAfter(LocalTime.of(18, 0)) && currentTime.isBefore(LocalTime.of(23, 0))) {
            greeting = "Добрый вечер";
        } else {
            greeting = "Доброй ночи";
        }

        // Print the greeting message with the user's name
        System.out.println(greeting + ", " + name + "!");

        // Close the scanner to release resources
        scanner.close();
    }
}

