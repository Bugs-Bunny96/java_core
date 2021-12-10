package com.Univer.laba_2;


import java.util.Scanner;

public class NR_3_12_Invoice {
    public static void main(String[] args) {

        InvoiceTest invoice = new InvoiceTest();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter part number:");
        invoice.setPartNumber(scanner.next());
        System.out.println("Enter part description:");
        invoice.setDescription(scanner.next());
        System.out.println("Enter quantity of goods:");
        invoice.setQuantityOfGoods(scanner.nextInt());
        System.out.println("Enter product price:");
        invoice.setPriceParts(scanner.nextDouble());

        System.out.printf(" Part number: %s%n Description: %s%n Quantity: %s%n Price: %s%n%n",
                invoice.getPartNumber(), invoice.getDescription(), invoice.getQuantityOfGoods(),
                invoice.getPriceParts());

        System.out.printf(" Сумма счета %f%n",invoice.getInvoiceQuantity());

    }
}
