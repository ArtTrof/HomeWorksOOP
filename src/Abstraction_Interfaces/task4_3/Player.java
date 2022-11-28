package Abstraction_Interfaces.task4_3;

public class  Player implements  Recordable,Playable {
    @Override
    public void play() {
        System.out.println("play");
    }
    @Override
    public void record() {
        System.out.println("record");
    }

    @Override
    public void pause() {
        System.out.println("pause");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }
}
