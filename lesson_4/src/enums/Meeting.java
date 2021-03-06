package enums;

public class Meeting {

    private Days day;
    private int participants;

    public Meeting(Days day, int participants) {
        this.day = day;
        this.participants = participants;
    }

    public Days getDay() {
        return day;
    }

    public void setDay(Days day) {
        this.day = day;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "day=" + day +
                ", participants=" + participants +
                '}';
    }
}
