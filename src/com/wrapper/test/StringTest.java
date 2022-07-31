package com.wrapper.test;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        String a = "Hello World";
        String b = new String("Ukraine forever");
        char c[] = {'a', 'd', 'c', 'h'};
        String c1 = new String(c);
        byte[] b1 = {11, 22, 12, 46, 01};
        String d = new String(b1);
        StringBuilder builder = new StringBuilder();
        builder.append("Hello")
                .append("world")
                .append("forever");
        String v = builder.toString();

        String fruit = "Апельсин,Яблоко,Гранат,Груша";
        String[] fruit1 = fruit.split(",");

        int max_len_index = 0;
        for (int i = 0; i < fruit1.length; i++) {
            if (fruit1[i].length() > fruit1[max_len_index].length()) {
                max_len_index = i;
            }
        }
        System.out.println(fruit1[max_len_index].toLowerCase());
        System.out.println(fruit1[max_len_index].toLowerCase().substring(0, 3));

        String f = "   Я_новая_строка      ";
        f = f.trim();
        f = f.replace("_", " ");
        System.out.println(f);

        Scanner scan = new Scanner(" Запуск +текст ");
        String vv = scan.nextLine();
        System.out.println("Вы ввели:" + vv);

        vv = vv.toLowerCase();
        String[] vvv = vv.split(" ");

        if (vvv[1].contains("запуск")) {
            System.out.println("Start process");
        }
        for (int i = 0; i < vvv.length; i++) {
            if (vvv[i].contains("ошибка")) {
                System.out.println("Sorry Problem ");
            }
        }
        int ii = vvv.length - 1;
        if (vvv[ii].contains("завершен")) {
            System.out.println("Game over");
        }
        StringBuilder builder1 = new StringBuilder();
        builder1.append(a)
                .append(b)
                .append(fruit)
                .append("\n")
                .append(v)
                .append(vv);
        System.out.println(builder1);
        builder1 = builder1.reverse();
        String str = builder1.toString();
        System.out.println(str);
    }
}









