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
                // sortDescending(topSales); // TODO
            }
        }

        // Display the top five salespersons
        for (int i = 0; i < TOP_SALES_COUNT; i++) {
            // display(topSales[i]); // TODO
        }
    }
}
