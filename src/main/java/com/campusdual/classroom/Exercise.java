package com.campusdual.classroom;

public class Exercise {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());
        redRemote.turnOn();
        redRemote.channelUp();
        System.out.println(redRemote.channel);
        redRemote.volumeUp();
        System.out.println(redRemote.volume);
        redRemote.volumeDown();
        redRemote.volume = 0;
        redRemote.volumeDown();
    }
}