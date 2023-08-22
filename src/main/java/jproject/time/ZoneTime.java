package jproject.time;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneTime {
    public static void main(String[] args) {
        //上海的时区id
        String id = ZoneId.SHORT_IDS.get("CTT");
        System.out.println(id);
        //构造时区时间对象
    }
}
