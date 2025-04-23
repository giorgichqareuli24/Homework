public class Time {

    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void displayTimeInfo() {
        System.out.println(String.format("15h:24m:55s", hour, minute, second));
    }
}
