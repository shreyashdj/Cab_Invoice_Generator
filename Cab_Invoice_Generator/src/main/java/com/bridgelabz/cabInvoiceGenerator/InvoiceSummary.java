package com.bridgelabz.cabInvoiceGenerator;

import java.util.Objects;

/**
 * @author - Shreyash Jadhav
 */
public class InvoiceSummary {
    /*
     *  variable to store data of Invoice Summary
     */
    public final int numberOfRides;
    public final double totalFare;
    public final double averageFare;
    /**
     *  created constructor of class InvoiceSummary
     */
    public InvoiceSummary(int numberOfRides, double totalFare) {
        this.numberOfRides = numberOfRides;
        this.totalFare = totalFare;
        this.averageFare = this.totalFare / this.numberOfRides;
    }
    /**
     *  Override equals method to compare objects
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return numberOfRides == that.numberOfRides &&
                Double.compare(that.totalFare, totalFare) == 0 &&
                Double.compare(that.averageFare, averageFare) == 0;
    }
    /**
     *  Override toString method to get string representation of the object
     */
    @Override
    public String toString() {
        return "InvoiceSummary{" +
                "numberOfRides=" + numberOfRides +
                ", totalFare=" + totalFare +
                ", averageFare=" + averageFare +
                '}';
    }
}