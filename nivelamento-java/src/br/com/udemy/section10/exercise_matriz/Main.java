package br.com.udemy.section10.exercise_matriz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas e colunas da matriz: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];


        for (int i=0; i<mat.length; i++) {
            System.out.println("Digite os numeros da " + (i+1) + "a linha:");
            for (int j=0; j<mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite um numero de dentro da matriz: ");
        int x = sc.nextInt();

        for (int i=0; i<mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if (j < mat[i].length - 1) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if (i < mat.length - 1) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                }
            }

        }

        sc.close();
    }
}
