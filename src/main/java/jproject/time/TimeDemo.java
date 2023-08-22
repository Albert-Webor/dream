package jproject.time;

import java.time.LocalTime;

public class TimeDemo {

    public static void main(String[] args) {
        //本地时间
        LocalTime toTime = LocalTime.now();
        System.out.println(toTime);
    }
}
