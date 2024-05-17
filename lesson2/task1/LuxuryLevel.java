package lesson2.task1;

public enum LuxuryLevel {
    A ("mini car"),
    B ("small city car"),
    C ("golf class"),
    D ("full middle class"),
    E ("executive or business class"),
    F ("luxury car"),
    J ("SUV"),
    M ("minivan");

    private String title;

    private LuxuryLevel(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}
