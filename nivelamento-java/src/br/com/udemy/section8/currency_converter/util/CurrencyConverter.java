package br.com.udemy.section8.currency_converter.util;

public class CurrencyConverter {

    public double dollarPrice;
    public double dollarsBought;
    public double iof = 0.06;


    public double paidInReais() {
        return dollarsBought * dollarPrice;
    }
    public double totalImposto() {
       return (paidInReais() * iof) + paidInReais();
    }

    public String toString() {
        return "Amount to be paid in reais: "
                + "R$ "
                + String.format("%.2f", totalImposto());
    }
}
