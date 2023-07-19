package br.com.udemy.section10.pensionato.application;

import br.com.udemy.section10.pensionato.entities.Client;
import br.com.udemy.section10.pensionato.entities.Quartos;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Quartos quartos = new Quartos();
        Client[] vect = new Client[quartos.numbRooms];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vect[room] = new Client(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i=0; i<10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();
    }
}
