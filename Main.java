package com.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int a = 10000000;
        int b = 1000000000;
        long sum;

        sum = IntStream.range(a, b).mapToLong(Long::valueOf).sum();
        System.out.println("a = " + a + ", b = " + b + ". Ответ: " + sum);

        System.out.println("Вывести все слагаемые?(Может занять большое количество времени) Y/n?");

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String userInput = reader.readLine();

            if (userInput.equalsIgnoreCase("Y")) {
                System.out.print("(");

                for (int x = a; x < b; x++) {
                    System.out.print(x);
                    if (x < b - 1) {
                        System.out.print(" + ");
                    }
                }

                System.out.print(")");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
