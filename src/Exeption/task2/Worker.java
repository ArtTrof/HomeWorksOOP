package Exeption.task2;

import org.w3c.dom.ls.LSOutput;

import java.time.Year;

public class Worker {

    String fio,position,year;

    public Worker(String fio, String store, String year) {
        this.fio = fio;
        this.position = store;
        this.year = year;
    }

    @Override
    public String toString(){
        return "initials :"+this.fio+" store :"+this.position + "year:" + this.year;
    }
}
