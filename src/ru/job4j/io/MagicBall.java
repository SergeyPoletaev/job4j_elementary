package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        Scanner input = new Scanner(System.in);
        input.nextLine();
        int temp = new Random().nextInt(3);

        String answer = temp == 0
                ? "ДА" : temp == 1
                ? "НЕТ" : "МОЖЕТ БЫТЬ";
        System.out.println("Ответ на твой вопрос - " + answer);
    }
}
