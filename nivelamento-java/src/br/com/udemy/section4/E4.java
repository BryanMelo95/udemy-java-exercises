package br.com.udemy.section4;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int funcNumber, horaTrabalhadas;
        float valorHora;

        System.out.print("Numero do funcionario: ");
        funcNumber = sc.nextInt();
        System.out.print("Horas trabalhadas: ");
        horaTrabalhadas = sc.nextInt();
        System.out.print("valor hora: ");
        valorHora = sc.nextFloat();
        
        float salary = valorHora * horaTrabalhadas;

        System.out.println("Number = " + funcNumber);
        System.out.printf("Salary = U$ %.2f %n", salary);
    }
}
