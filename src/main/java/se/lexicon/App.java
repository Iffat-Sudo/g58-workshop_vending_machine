package se.lexicon;


import se.lexicon.model.*;

import java.util.Arrays;

public class App
{
    public static void main( String[] args ) {
        Product soda = new Soda(30,"Fanta");
        Product chocolate = new Chocolate( 20,"Kitkat");
        Product chips = new Chips(25,"Crackers");

        Product[] products = new Product[] {soda,chocolate,chips};
        VendingMachineImpl vendingMachine = new VendingMachineImpl(products);

        System.out.println(Arrays.toString(vendingMachine.getProducts()));

        System.out.println(vendingMachine.getDescription(0));

        vendingMachine.addCurrency(Currency.FIVE);
        vendingMachine.addCurrency(Currency.ONE);
        vendingMachine.addCurrency(Currency.TWO);
        vendingMachine.addCurrency(Currency.TWO);
        vendingMachine.addCurrency(Currency.TEN);

        System.out.println(vendingMachine.getBalance());

        int change = vendingMachine.endSession();
        System.out.println("change:"+change);

        System.out.println(vendingMachine.getBalance());
    }
}
