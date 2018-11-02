package com.example.strategy.toothbrush;

public class Main {

    public static void main(String[] args) {
        EToothBrush brush = new EToothBrush();
        brush.getAllProperties();

        brush.setChargeble(new SolarToothBrush());
        brush.getAllProperties();
   }
}
