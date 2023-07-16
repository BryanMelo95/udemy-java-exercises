package br.com.udemy.section5;

import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float x, y;
        System.out.print("digite os valores X e Y: ");

        x = sc.nextFloat();
        y = sc.nextFloat();

        if (x >= 0.1 && y >= 0.1) {
            System.out.println("Q1");
        } else if (x >= 0.1 && y <= -0.1) {
            System.out.println("Q4");
        } else if (x <= -0.1 && y >= 0.1) {
            System.out.println("Q2");
        } else if (x <= -0.1 && y <= -0.1) {
            System.out.println("Q3");
        } else {
            System.out.println("Origem");
        }

        sc.close();
    }
}
