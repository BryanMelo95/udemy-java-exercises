package br.com.udemy.section5;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.print("Digite o valor: ");
        x = sc.nextInt();

        if (x <= -1){
            System.out.println("negativo");
        } else {
            System.out.println("nao negativo");
        }
    }
}
