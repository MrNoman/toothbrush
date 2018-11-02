package com.example.strategy.toothbrush;

public class EToothBrush {
    private final boolean engine = true;
    private boolean bristle = true;
    private Chargeble chargeble = new BatteryToothBrush();

    public void getAllProperties(){
        System.out.println(" Двигатель: " + this.engine
                            + "\n Щетина: " + this.bristle
                            + "\n Батарея: " + chargeble.getBattery()
                            +"\n************************");
    }

    public void setChargeble(Chargeble chargeble){
        this.chargeble = chargeble;
    }

}
