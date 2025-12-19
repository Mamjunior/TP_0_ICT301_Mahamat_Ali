package ict301.solid.dip;

// Module de haut niveau dépend d'une abstraction
public class Switch {

    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate() {
        device.turnOn();
    }
}
