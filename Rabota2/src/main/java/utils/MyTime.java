package utils;

public class MyTime {

    public static String getTimeInHoursMinutesSeconds(int timeSeconds) {

        int st = timeSeconds - timeSeconds % 60;
        int s = timeSeconds % 60;
        int st1 = st / 60;
        int st2 = (st1 - st1 % 60);
        int ch = st2 / 60;
        int min = st1 - (st1 - st1 % 60);
        String zn1 = "";
        if (ch % 10 == 0) {
            zn1 = ch + " часов";
        } else if (ch % 10 == 1) {
            if (ch % 100 == 11) {
                zn1 = ch + " часов";
            } else {
                zn1 = ch + " час";
            }
        } else if ((ch % 10) > 1 && (ch % 10) < 5) {
            zn1 = ch + " часа";
        } else if ((ch % 10) > 4 && (ch % 10) < 9) {
            zn1 = ch + " часов";
        }


        String zn = zn1 + " " + min + " минут " + s + " секунд";

        return zn;

    }

    public static void main(String[] args) {
//        System.out.println(11 % 10);
        System.out.println(getTimeInHoursMinutesSeconds(39600));
    }
}
