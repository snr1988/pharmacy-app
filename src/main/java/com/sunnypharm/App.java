package com.sunnypharm;

import java.util.logging.Logger;

public class App {

    private static final Logger logger =
            Logger.getLogger(App.class.getName());

    public static void main(String[] args) {

        String medicine = "Paracetamol";
        int price = 50;
        int stock = 100;

        logger.info("=== Sunny Pharm ===");
        logger.info(String.format("Medicine : %s", medicine));
        logger.info(String.format("Price    : ₹%d", price));
        logger.info(String.format("Stock    : %d", stock));
    }
}
