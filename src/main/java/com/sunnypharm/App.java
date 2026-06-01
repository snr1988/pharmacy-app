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
        logger.info("Medicine : " + medicine);
        logger.info("Price    : ₹" + price);
        logger.info("Stock    : " + stock);
    }
}
