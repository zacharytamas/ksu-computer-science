package CS1301.Lab12;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab 12

public class TestTV {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        TV tv3 = new TV();
        tv3.turnOn();
        tv3.channelUp();
        tv3.setChannel(10);
        tv3.channelDown();
        tv3.volumeUp();
        tv3.setVolume(10);
        tv3.volumeDown();
        tv3.turnOff();

        System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
        System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
        System.out.println("tv3's channel is " + tv3.channel + " and volume level is " + tv3.volumeLevel);
    }
}
