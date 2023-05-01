import java.util.Date;

public class AlarmClock {

    private Date currentDate;
    private Time currentTime;
    private Time alarmTime;
    private boolean alarmModeOn;

    public AlarmClock() {
        this.currentTime.setTime(0,0,0);
        this.alarmModeOn = false;
    }

    public AlarmClock(int year, int month, int day, int hour, int minute, int second) {
        currentTime.setTime(hour, minute, second);
        currentDate.setTime(year, month, day);
    }

    public void setAlarmTime(int hour, int minute, int second) {
        currentTime.setTime(hour, minute, second);
    }

    public void setAlarmModeOn(boolean alarmModeOn) {
        this.alarmModeOn = alarmModeOn;
    }

    public String toString() {
        return currentDate.toString() + " " + currentTime.toString();
    }

    public AlarmClock nextSecond() {
        currentTime.nextSecond();
        return this;
    }

    public boolean checkAlarm() {
        return (alarmModeOn || currentTime.equals(alarmTime));
    }
}
