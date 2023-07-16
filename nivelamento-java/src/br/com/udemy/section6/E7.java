package br.com.udemy.section6;

import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        float firstN, secondN;

        for (int i=0; i<n; i++){
            firstN = sc.nextFloat();
            secondN = sc.nextFloat();
            if(secondN == 0){
                System.out.println("divisao invalida");
            } else {
                float saida = firstN / secondN;
                System.out.println("saida: " + saida);
            }
        }
    }
}
