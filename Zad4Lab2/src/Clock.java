public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    public Clock() {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Clock(int hours, int minutes, int seconds) {
        this.setHours(hours);
        this.setMinutes(minutes);
        this.setSeconds(seconds);
    }

    public Clock(int seconds) {
        int h = seconds / 3600;
        int m = (seconds % 3600) / 60;
        int s = seconds % 60;
        this.setHours(h);
        this.setMinutes(m);
        this.setSeconds(s);
    }

    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 23) {
            this.hours = hours;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
        }
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds <= 59) {
            this.seconds = seconds;
        }
    }

    public void tick() {
        if (this.seconds == 59) {
            this.seconds = 0;
            if (this.minutes == 59) {
                this.minutes = 0;
                if (this.hours == 23) {
                    this.hours = 0;
                } else {
                    this.hours++;
                }
            } else {
                this.minutes++;
            }
        } else {
            this.seconds++;
        }
    }

    public void tickDown() {
        if (this.seconds == 0) {
            if (this.minutes == 0) {
                if (this.hours == 0) {
                    this.hours = 23;
                } else {
                    this.hours--;
                }
                this.minutes = 59;
                this.seconds = 59;
            } else {
                this.minutes--;
                this.seconds = 59;
            }
        } else {
            this.seconds--;
        }
    }

    @Override
    public String toString() {
        return String.format("[%02d:%02d:%02d]", this.hours, this.minutes, this.seconds);
    }
}