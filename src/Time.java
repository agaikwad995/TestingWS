
public class Time {
    public static void main(String[] args) {
        int sec = 86399;
        int hr = sec / 3600;
        int min = (sec % 3600) / 60;
        int remain = sec % 60;

        System.out.println(hr + " hours " + min + " minutes " + remain +" Seconds");
    }
}