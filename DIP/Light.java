package ict301.solid.dip;

// Implémentation concrète
public class Light implements Switchable {

    @Override
    public void turnOn() {
        System.out.println("Light ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Light OFF");
    }
}
