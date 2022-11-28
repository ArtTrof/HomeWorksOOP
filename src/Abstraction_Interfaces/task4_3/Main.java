package Abstraction_Interfaces.task4_3;

public class Main {
    public static void main(String[] args) {
        Playable playable = new Player();
        Recordable recordable = new Player();
        playable.play();  //playable
        playable.pause();
        playable.stop();
        System.out.println("");
        recordable.record(); //recordable
        recordable.pause();
        recordable.stop();
    }
}
