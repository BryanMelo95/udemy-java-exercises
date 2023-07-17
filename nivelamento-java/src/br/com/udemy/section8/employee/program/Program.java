package br.com.udemy.section8.employee.program;

import br.com.udemy.section8.employee.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.println("Preencha os dados do funcionarios: ");
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Salario bruto: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Imposto sobre o salario: ");
        employee.tax = sc.nextDouble();

        System.out.println();
        System.out.println(employee);

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println("Update data: " + employee);

        sc.close();
    }
}
