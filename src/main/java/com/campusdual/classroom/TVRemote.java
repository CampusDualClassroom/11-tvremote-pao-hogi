package com.campusdual.classroom;

public class TVRemote {

    int channel;
    int volume;
    boolean on;
    String color;

    public TVRemote(String color) {
        this.channel = 0;
        this.volume = 20;
        this.color = color;
        this.on = false;
    }

    public boolean turnOn() {
        if (!on) {
            on = true;
            System.out.println("TV encendida.");
            return true;
        } else {
            System.out.println("La TV ya está encendida.");
            return false;
        }
    }

    public boolean turnOff() {
        if (on) {
            on = false;
            System.out.println("TV apagada.");
            return  true;
        } else {
            System.out.println("La TV ya está apagada.");
            return false;
        }
    }

    public void channelUp() {
            channel++;
            System.out.println("Canal subido a: " + channel);
            }

    public void channelDown() {
        if (channel > 0) {
            channel--;
            System.out.println("Canal bajado a: " + channel);
        }else {
            System.out.println("No se puede bajar el canal mas. ya está en 0. ");
        }
    }

    public void volumeUp() {
             volume++;
            System.out.println("Volumen subido a: " + volume);
           }

    public void volumeDown() {
             if (volume > 0) {
                volume--;
                System.out.println("Volumen bajado a : " + volume);
            } else {
                System.out.println("No se puede bajar más el volumen. ya está en 0.");
            }
        }

    public String getColor() {
        return color;
    }

    private boolean checkMinValue(int value) {
        if (value == 0) {
            return false;
        } else {
            return true;
        }
    }

}
