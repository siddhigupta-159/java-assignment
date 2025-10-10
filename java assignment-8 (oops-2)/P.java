// ADD TWO TIME CLASS OBJECT.

class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time() {
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public Time add(Time t) {
        Time temp = new Time();
        temp.hour = this.hour + t.hour;
        temp.minute = this.minute + t.minute;
        temp.second = this.second + t.second;

        if (temp.minute >= 60) {
            temp.hour++;
            temp.minute = temp.minute % 60;
        }
        if (temp.second >= 60) {
            temp.minute++;
            temp.second = temp.second % 60;
        }
        return temp;
    }

    public void display() {
        System.out.println("hour : " + hour);
        System.out.println("minute: " + minute);
        System.out.println("second: " + second);

    }
}

class P {
    public static void main(String args[]) {
        Time t1 = new Time(4, 6, 18);
        Time t2 = new Time(3, 15, 20);
        t1.setHour(6);
        t1.setMinute(45);
        t1.setSecond(23);
        t2.setHour(4);
        t2.setMinute(34);
        t2.setSecond(12);
        Time result = t1.add(t2);
        result.display();

    }
}
