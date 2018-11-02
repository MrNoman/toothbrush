package com.company;

public class Main {

    public static void main(String[] args) {
        EToothBrush brush = new EToothBrush();
        brush.getAllProperties();

        brush.setIsElectric(new SolarToothBrush());
        brush.getAllProperties();
   }
}
