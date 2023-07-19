package br.com.udemy.section10.soma_vetor;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
            for (int i=0; i<n; i++) {
                sum += vect[i];
            }

        double avg = sum / n;

        System.out.print("VALORES = ");

        for (int i=0; i<n; i++) {
            System.out.printf("%.1f  ", vect[i]);
        }

        System.out.println();
        System.out.printf("SOMA: %.2f%n", sum);
        System.out.printf("MEDIA: %.2f%n", avg);

        sc.close();
    }
}
