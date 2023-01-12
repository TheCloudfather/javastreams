package net.nickg.customer;

import java.time.Month;

public record PurchaseRecord(long customerId, Month purchaseMonth, int total) {
}
