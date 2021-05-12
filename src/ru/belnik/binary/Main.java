package ru.belnik.binary;

import java.io.IOException;

public class Main {
    public static boolean isSuccessfully = false;
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Загадайте число от 1 до 100.");
        Thread.sleep(3000);
        System.out.println("Компьютер с помощью бинарного поиска будет выдавать по очереди возможный результат.");
        System.out.println("Если число в консоли больше загаданного, то введите \"+\".");
        System.out.println("Если число меньше загаданного, то введите \"-\".");
        System.out.println("Если компьютер угадал ваше число, то введите \"=\".\n");
        System.out.println("Чтобы начать, нажмите \"ENTER\"");

        WorkWithConsole workWithConsole = new WorkWithConsole();
        BinarySearchAlgorithm binarySearchAlgorithm = new BinarySearchAlgorithm();

        while (!isSuccessfully) {
            String guest = null;
                try {
                    guest = workWithConsole.getUserNumber();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            String result = binarySearchAlgorithm.search(guest);
            if (guest.equals("=")) {
                System.out.println(BinarySearchAlgorithm.END);
                isSuccessfully = true;
            } else {
                System.out.println(result);
            }
        }
    }
}
