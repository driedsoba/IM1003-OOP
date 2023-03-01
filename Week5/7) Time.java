public class Time {

    // private instance variables declaration
    private int hour, minute, second;

    // Constructor declaration with 3 parameters
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // IDE generate
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    // Method to set 3 variables
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Method to advance one second and return instance of type Time
    // Take note to not use else if, as there are cases where more than one variable incremented
    // Post or pre increment does not matter here
    public Time nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;    // returns "this" instance to the caller
    }

    // Method to rewind one second and return instance of type time
    // Negative time means rewind to previous second/minute/hour
    // Post or pre decrement does not matter here
    public Time previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            minute--;
            if (minute < 0) {
                minute = 59;
                hour--;
                if (hour < 0) {
                    hour = 23;
                }
            }
        }
        return this;    // returns "this" instance to the caller
    }

    // toString method
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
