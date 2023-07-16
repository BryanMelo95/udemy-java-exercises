package br.com.udemy.section5;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2;
        System.out.print("digite os valores: ");

        n1 = sc.nextInt();
        n2 = sc.nextInt();
        if (n1 % 2 == 0 && n2 % 2 == 0){
            System.out.println("Sao multiplos");
        } else {
            System.out.println("Nao sao multiplos");
        }
    }
}

