/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Ben Phung
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        double taxrate = .055;

        // Prompt inputs
        System.out.print( "Enter the price of item 1: " );
        String Item1 = scan.nextLine();

        System.out.print( "Enter the quantity of item 1: " );
        String Quant1 = scan.nextLine();

        System.out.print( "Enter the price of item 2: " );
        String Item2 = scan.nextLine();

        System.out.print( "Enter the quantity of item 2: " );
        String Quant2 = scan.nextLine();

        System.out.print( "Enter the price of item 3: " );
        String Item3 = scan.nextLine();

        System.out.print( "Enter the quantity of item 3: " );
        String Quant3 = scan.nextLine();

        // Convert strings to double for decimals
        double dItem1 = Double.parseDouble(Item1);
        double dQuant1 = Double.parseDouble(Quant1);
        double dItem2 = Double.parseDouble(Item2);
        double dQuant2 = Double.parseDouble(Quant2);
        double dItem3 = Double.parseDouble(Item3);
        double dQuant3 = Double.parseDouble(Quant3);

        // Calculations
        double dTotal1 = dItem1 * dQuant1;
        double dTotal2 = dItem2 * dQuant2;
        double dTotal3 = dItem3 * dQuant3;

        double subtotal = dTotal1 + dTotal2 + dTotal3;
        double tax = subtotal * taxrate;
        double TotalAll = subtotal + tax;

        // Output using decimal formatting for 2 decimal places
        System.out.println("Subtotal: $"+String.format("%.2f", subtotal));
        System.out.println("Tax: $"+String.format("%.2f", tax));
        System.out.println("Total: $"+String.format("%.2f", TotalAll));
    }
}
