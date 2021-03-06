package enums;

public class MeetingsRunner {

    public static void main(String[] args) {

//        Meeting m1 = new Meeting(Days.MONDAY, 10);
//        Meeting m2 = new Meeting(Days.TUESDAY, 5);
//        Meeting m3 = new Meeting(Days.SUNDAY, 7);
//        Meeting m4 = new Meeting(Days.THURSDAY, 9);
//        Meeting m5 = new Meeting(Days.SATURDAY, 11);
//        Meeting m6 = new Meeting(Days.SATURDAY, 12);
//        Meeting m7 = new Meeting(Days.MONDAY, 10);
//        Meeting m8 = new Meeting(Days.MONDAY, 10);
//
//        Meeting [] meetings = {m1, m2, m3, m4, m5, m6, m7, m8};
//
//        int count = 0;
//
//        for (int i = 0; i < meetings.length; i++) {
//            if(meetings[i].getDay().equals(Days.MONDAY)) {
//                count++;
//                System.out.println(count + " of Monday");
//            }
//        }

        Meeting freeItSatMeeting = new Meeting(Days.SATURDAY, 18);

        System.out.println(freeItSatMeeting);
    }
}
