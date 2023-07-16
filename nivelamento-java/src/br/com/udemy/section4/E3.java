package br.com.udemy.section4;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor 'A': ");
        int a = sc.nextInt();
        System.out.print("Digite o valor 'B': ");
        int b = sc.nextInt();
        System.out.print("Digite o valor 'C': ");
        int c = sc.nextInt();
        System.out.print("Digite o valor 'D': ");
        int d = sc.nextInt();

        System.out.println("A diferença é: " + (a * b - c * d));
    }
}
