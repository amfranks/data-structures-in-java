package com.amfranks.datastructuresinjava.ch01_intro_to_dsa;

import java.util.ArrayList;

public class Salesperson {
    public String name;
    public int salesTotal;

    public static void displayTopFiveSalespersons(ArrayList<Salesperson> allSalespersons) {
        final int TOP_SALES_COUNT = 5;
        Salesperson[] topSales = new Salesperson[TOP_SALES_COUNT];

        /*
         * Upon algorithm completion, topSales will be sorted
         * from highest total sales to lowest total sales.
         */

        // Initialize all array elements with a negative sales total
        for (int i = 0; i < TOP_SALES_COUNT; i++) {
            topSales[i] = new Salesperson();
            topSales[i].name = "";
            topSales[i].salesTotal = -1;
        }

        for (Salesperson salesPerson : allSalespersons) {

            // If the salesPerson's total sales is greater than the last
            // topSales element, then salesPerson is one of the top five so far.
            if (salesPerson.salesTotal > topSales[TOP_SALES_COUNT - 1].salesTotal) {

                // Assign the last element in topSales with the current salesperson
                topSales[TOP_SALES_COUNT - 1] = salesPerson;

                // Sort topSales in descending order
                 sortDescending(topSales);
            }
        }

        // Display the top five salespersons
        for (int i = 0; i < TOP_SALES_COUNT; i++) {
             displaySalesPerson(topSales[i]);
        }
    }

    /**
     * Displays the name and sales total of a single salesperson.
     *
     * @param person The Salesperson object whose details will be printed.
     */
    public static void displaySalesPerson(Salesperson person) {
        System.out.println("Name: " + person.name + ", Total Sales: " + person.salesTotal);
    }

    /**
     * Sorts an array of Salesperson objects in descending order based on their total sales.
     *
     * @param topSales The array of Salesperson objects to be sorted.
     */
    public static void sortDescending(Salesperson[] topSales) {
        for (int i = 1; i < topSales.length; i++) {
            Salesperson key = topSales[i];
            int j = i - 1;

            while (j >= 0 && topSales[j].salesTotal < key.salesTotal) {
                topSales[j + 1] = topSales[j];
                j = j - 1;
            }

            topSales[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        ArrayList<Salesperson> team = new ArrayList<>();

        Salesperson p1 = new Salesperson();
        p1.name = "Alice";
        p1.salesTotal = 12000;
        team.add(p1);

        Salesperson p2 = new Salesperson();
        p2.name = "Bob";
        p2.salesTotal = 45000;
        team.add(p2);

        Salesperson p3 = new Salesperson();
        p3.name = "George";
        p3.salesTotal = 61000;
        team.add(p3);

        displayTopFiveSalespersons(team);
    }
}
