package com.company;

public class EToothBrush {
    private final boolean engine = true;
    private boolean bristle = true;
    private IsElectric isElectric = new BatteryToothBrush();

    public void getAllProperties(){
        System.out.println(" Двигатель: " + this.engine
                            + "\n Щетина: " + this.bristle
                            + "\n Батарея: " + isElectric.getBattery()
                            +"\n************************");
    }

    public void setIsElectric (IsElectric isElectric){
        this.isElectric = isElectric;
    }

}
