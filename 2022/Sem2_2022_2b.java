import java.util.Date;

public class AlarmClock {

    private Date currentDate;
    private Time currentTime;
    private Time alarmTime;
    private boolean alarmModeOn;

    public AlarmClock() {
        currentTime = new Time(0,0,0);
        this.setAlarmModeOn(false);
    }

    public AlarmClock(int year, int month, int day, int hour, int minute, int second) {
        currentTime = new Time(hour,minute,second);
        currentDate = new Date(year, month, day);
        this.setAlarmModeOn(false);
    }

    public void setAlarmTime(int hour, int minute, int second) {
        alarmTime = new Time(hour, minute, second);
        this.setAlarmModeOn(true);
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

