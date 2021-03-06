package enums;

public enum Days {
    MONDAY("Monday", "mon", 1),
    TUESDAY("Tuesday", "tue", 2),
    WEDNESDAY("Wednesday", "wed", 3),
    THURSDAY("Thursday", "thu", 4),
    FRIDAY("Friday", "fri", 5),
    SATURDAY("Saturday", "sat", 6),
    SUNDAY("Sunday", "sun", 7);

    String dayFullName;
    String dayName;
    int dayOrdinal;

    Days(String dayFullName, String dayName, int dayOrdinal) {
        this.dayFullName = dayFullName;
        this.dayName = dayName;
        this.dayOrdinal = dayOrdinal;
    }

    public String getDayFullName() {
        return dayFullName;
    }

    public void setDayFullName(String dayFullName) {
        this.dayFullName = dayFullName;
    }

    public String getDayName() {
        return dayName;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

    public int getDayOrdinal() {
        return dayOrdinal;
    }

    public void setDayOrdinal(int dayOrdinal) {
        this.dayOrdinal = dayOrdinal;
    }

    @Override
    public String toString() {
        return "Days{" +
                "dayFullName='" + dayFullName + '\'' +
                ", dayName='" + dayName + '\'' +
                ", dayOrdinal=" + dayOrdinal +
                '}';
    }
}
