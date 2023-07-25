package br.com.udemy.section15.exercicio_fixacao.application;

import br.com.udemy.section15.exercicio_fixacao.model.entities.Account;
import br.com.udemy.section15.exercicio_fixacao.model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("Enter Account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();
            Account acc1 = new Account(number, holder, balance, withdrawLimit);
            System.out.println(acc1);

            System.out.println("Enter amount for withdraw: ");
            Double withdrawValue = sc.nextDouble();
            acc1.withdraw(withdrawValue);
            System.out.println(acc1);
        }
        catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }

        sc.close();
    }
}
