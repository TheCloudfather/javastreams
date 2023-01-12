package net.nickg;

import net.nickg.customer.PurchaseRecord;

import java.time.Month;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }

    public void summarizePoints() {
        long customerId1 = 100;
        long cust1 = 100;
        long cust2 = 200;
        long cust3 = 300;
        var jan = Month.JANUARY;
        var feb = Month.FEBRUARY;
        var march = Month.MARCH;
        var total1 = 80;
        var purchases = List.of(
                new PurchaseRecord(cust1, jan, 10),
                new PurchaseRecord(cust1, jan, 5),
                new PurchaseRecord(cust1, jan, 1),
                new PurchaseRecord(cust1, jan, 100),
                new PurchaseRecord(cust1, jan, 35),
                new PurchaseRecord(cust1, feb, 10),
                new PurchaseRecord(cust1, feb, 5),
                new PurchaseRecord(cust1, feb, 2),
                new PurchaseRecord(cust1, feb, 100),
                new PurchaseRecord(cust1, feb, 35),
                new PurchaseRecord(cust1, march, 10),
                new PurchaseRecord(cust1, march, 5),
                new PurchaseRecord(cust1, march, 3),
                new PurchaseRecord(cust1, march, 100),
                new PurchaseRecord(cust1, march, 35),
                new PurchaseRecord(cust2, jan, 10),
                new PurchaseRecord(cust2, jan, 5),
                new PurchaseRecord(cust2, jan, 4),
                new PurchaseRecord(cust2, jan, 100),
                new PurchaseRecord(cust2, jan, 35),
                new PurchaseRecord(cust2, feb, 10),
                new PurchaseRecord(cust2, feb, 5),
                new PurchaseRecord(cust2, feb, 5),
                new PurchaseRecord(cust2, feb, 100),
                new PurchaseRecord(cust2, feb, 35),
                new PurchaseRecord(cust2, march, 10),
                new PurchaseRecord(cust2, march, 5),
                new PurchaseRecord(cust2, march, 6),
                new PurchaseRecord(cust2, march, 100),
                new PurchaseRecord(cust2, march, 35),
                new PurchaseRecord(cust3, jan, 10),
                new PurchaseRecord(cust3, jan, 5),
                new PurchaseRecord(cust3, jan, 5),
                new PurchaseRecord(cust3, jan, 100),
                new PurchaseRecord(cust3, jan, 35),
                new PurchaseRecord(cust3, feb, 10),
                new PurchaseRecord(cust3, feb, 5),
                new PurchaseRecord(cust3, feb, 6),
                new PurchaseRecord(cust3, feb, 100),
                new PurchaseRecord(cust3, feb, 35),
                new PurchaseRecord(cust3, march, 10),
                new PurchaseRecord(cust3, march, 5),
                new PurchaseRecord(cust3, march, 7),
                new PurchaseRecord(cust3, march, 100),
                new PurchaseRecord(cust3, march, 35)
        );

        // Result to get to:
        // Map<Long, Map<Month, Integer>> customerTotals
        //     key: customerId -> val: (key: Month -> val: sum of customerId for Month)
    }
}