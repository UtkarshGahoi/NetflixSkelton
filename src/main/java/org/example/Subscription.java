package org.example;

import java.util.Date;

public class Subscription {
    Plan plan;
    Double price;
    Date startingDate;
    Date endDate;

    public Subscription(Plan plan, Double price, Date startingDate, Date endDate) {
        this.plan = plan;
        this.price = price;
        this.startingDate = startingDate;
        this.endDate = endDate;
    }
}
