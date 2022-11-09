package chapter.chapter10.homework.Exercises01;

public class Time {
    private int hour;
    private int minute;
    private int second;
    private long totalMillis;


    public Time() {
        this(System.currentTimeMillis());

    }

    public Time(int hour, int minute, int second) {
        this(((long) hour * 60 * 60 * 1000) + ((long) minute * 60 * 1000) + (second * 1000L));
    }

    public Time(long totalMillis) {
        this.totalMillis = totalMillis;
        this.hour = getCurrentHour();
        this.minute = getCurrentMinute();
        this.second = getCurrentSecond();
    }

    //get total Millis,Second,Minute,Hour
    private long getTotalMillis() {
        return this.totalMillis;
    }

    private int getTotalSecond() {
        return (int) getTotalMillis() / 1000;
    }

    private int getTotalMinute() {
        return getTotalSecond() / 60;
    }

    private int getTotalHour() {
        return getTotalMinute() / 60;
    }

    //Get current Second,Minute,Hour
    private int getCurrentSecond() {
        return getTotalSecond() % 60;
    }

    private int getCurrentMinute() {
        return getTotalMinute() % 60;
    }

    private int getCurrentHour() {
        return getTotalHour() % 24;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }
    public void setTime(long totalMillis){
        this.totalMillis=totalMillis;
        this.hour=getCurrentHour();
        this.minute=getCurrentMinute();
        this.second=getCurrentSecond();


    }
    public void display(){
        System.out.println(getHour()+" : " +getMinute()+" : "+getSecond());

    }
}
