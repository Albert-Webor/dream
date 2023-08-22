package jproject.time;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

/*
* 时间戳类
* */
public class TimeStampDemo {
    public static void main(String[] args) {
        //当前系统时间戳
        Long stamp = System.currentTimeMillis();
        System.out.println(Instant.now());
    }
}
