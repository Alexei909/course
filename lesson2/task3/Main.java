package lesson2.task3;

import lesson2.task3.Computer.Processor;
import lesson2.task3.Computer.Ram;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer("Model 1", 500);
        Processor processor = new Processor("Model 2");
        Ram ram = computer.new Ram(1000);

        System.out.println(processor);
        System.out.println(ram);
        System.out.println(computer);
    }
}
