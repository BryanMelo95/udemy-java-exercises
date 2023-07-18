package br.com.udemy.section8.currency_converter.application;

import br.com.udemy.section8.currency_converter.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CurrencyConverter currencyConverter = new CurrencyConverter();

        System.out.print("What is the dollar price? ");
        currencyConverter.dollarPrice = sc.nextDouble();
        System.out.println();
        System.out.print("How many dollars will be bought? ");
        currencyConverter.dollarsBought = sc.nextDouble();
        System.out.println();

        System.out.println(currencyConverter);
    }
}
