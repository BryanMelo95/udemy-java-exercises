package br.com.udemy.section4;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor do raio: ");
        float raio = sc.nextFloat();
        float pi = 3.14159f;
        float a = pi * (raio * raio);

        System.out.printf("A = %.4f %n", a);
    }
}
