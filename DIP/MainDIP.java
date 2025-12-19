package ict301.solid.dip;

public class MainDIP {

    public static void main(String[] args) {

        Switchable light = new Light();
        Switch lightSwitch = new Switch(light);

        lightSwitch.operate();
    }
}
