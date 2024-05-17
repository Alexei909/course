package lesson2.task3;

public class Computer {

    private Processor processor;
    private Ram ram;

    public Computer(String model, int size) {
        this.processor = new Processor(model);
        this.ram = new Ram(size);
    }

    public static class Processor {

        private String model;

        public Processor(String model) {
            this.model = model;
        }

        public String getDetails() {
            return "Processor{" +
                    " model = " + this.model + " }";
        }

        @Override
        public String toString() {
            return this.getDetails();
        }
    } 

    public class Ram {

        private int size;

        public Ram(int size) {
            this.size = size;
        }

        public String getDetails() {
            return "Ram{" +
                    " size = " + this.size + " }";
        }

        @Override
        public String toString() {
            return this.getDetails();
        }
    }

    @Override
    public String toString() {
        return "Computer{ " +
                this.processor +
                ", " + this.ram + " }";
    }

}
