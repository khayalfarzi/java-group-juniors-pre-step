package az.iktlab.juniors.model;

public enum DayOfWeek {
    MONDAY("Bazar ertəsi"),
    TUESDAY("Çərşənbə axşamı"),
    WEDNESDAY("Çərşənbə"),
    THURSDAY("Cümə axşamı"),
    FRIDAY("Cümə"),
    SATURDAY("Şənbə"),
    SUNDAY("Bazar");

    private final String name;


    DayOfWeek(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
