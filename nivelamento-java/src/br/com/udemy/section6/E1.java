package br.com.udemy.section6;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua senha de acesso: ");
        int password = sc.nextInt();

        while (password != 2002){
            System.out.println("Senha invalida");
            password = sc.nextInt();
            System.out.println("Tente novamente");
        }
        System.out.println("Acesso permitido");
        sc.close();
    }
}
