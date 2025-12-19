package ict301.solid.dip;

// Module de bas niveau
class Light {
    public void turnOn() {
        System.out.println("Light ON");
    }

    public void turnOff() {
        System.out.println("Light OFF");
    }
}

// Module de haut niveau dépend directement du bas niveau
public class Switch_Avant {

    private Light light;

    public Switch_Avant() {
        this.light = new Light();
    }

    public void operate() {
        light.turnOn();
    }
}
