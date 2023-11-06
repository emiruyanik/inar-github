package week_10.assignments;

public class Time {
    private int seconds;
    private int minutes;
    private int hour;
    private long totalMilliSeconds;

    public Time() {
        totalMilliSeconds = System.currentTimeMillis();
        this.seconds = getCurrentSeconds();
        this.minutes = getCurrentMinutes();
        this.hour = getCurrentHour();

    }

    public Time(long elapseTime) {
        setTime(elapseTime);
        this.seconds = getCurrentSeconds();
        this.minutes = getCurrentMinutes();
        this.hour = getCurrentHour();
    }

    public Time(int seconds, int minutes, int hour) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hour = hour;
    }


    private long getTotalSeconds() {
        return totalMilliSeconds / 1000;
    }

    private int getCurrentSeconds() {
        return (int) getTotalSeconds() % 60;
    }

    private long getTotalMinutes() {
        return getTotalSeconds() / 60;
    }

    private int getCurrentMinutes() {
        return (int) getTotalMinutes() % 60;
    }

    private int getTotalHours() {
        return (int) getTotalMinutes() / 60;
    }

    private int getCurrentHour() {
        return getTotalHours() % 24;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setTime(long elapseTime) {
        totalMilliSeconds = elapseTime;
    }
}
