package ru.gb.vending;

import ru.gb.vending.product.Bottle;
import ru.gb.vending.product.Product;
import ru.gb.vending.vending.VendingMachine;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        Product product1 = new Product("twix", 100);
        Product product2 = new Bottle("coca-cola", 110, 2);
        Product product3 = new Product("chips", 80);

        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);
        vendingMachine.addProduct(product3);

       //System.out.println(product1.getName());
        // System.out.println(product1.getPrice());

//        System.out.println(product1);
//        System.out.println(product2);
//        System.out.println(product3);
        System.out.println(vendingMachine);

    }
}