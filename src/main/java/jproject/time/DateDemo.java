package jproject.time;

import org.springframework.cglib.core.Local;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/*
* 日期相关实例
* */
public class DateDemo {
    public static void main(String[] args) {
        //伦敦格林威治皇家天文台时间
        System.out.println("伦敦格林威治皇家天文台时间: "+Instant.now());
        //本地时间
        LocalDate Today = LocalDate.now();
        System.out.println("LocalDate默认日期是： "+Today);
        //自定义时间
        LocalDate diyDate = LocalDate.of(2000,1,31);
        System.out.println("自定义的LocalDate日期是： "+diyDate);
        //时间加上指定的年/月/日后的时间
        LocalDate diyDate1 = LocalDate.of(2000,1,31);
        LocalDate dateAddMonth = diyDate1.plusMonths(1);
        System.out.println("2000年1月31日加上一个月后的日期为： "+dateAddMonth);
        //时间减去指定的年/月/日后的时间
        LocalDate diyDate2 = LocalDate.of(2000,3,29);
        LocalDate date1MinusMonth = diyDate2.minusMonths(1);
        System.out.println("2000年3月29减去一个月后的日期为： "+date1MinusMonth);
        //替换年/月/日
        LocalDate diyDate6 = LocalDate.of(2000,3,29);
        LocalDate withParam = diyDate6.withYear(23);
        //日期对应的星期
        LocalDate diyDate3 = LocalDate.of(2023,8,27);
        DayOfWeek todayOfWeek = diyDate3.getDayOfWeek();
        System.out.println("日期对应的星期是：： "+todayOfWeek);
        //查看日期是该月的第几天
        LocalDate diyDate4 = LocalDate.of(2023,8,27);
        int todayOfMonth = diyDate4.getDayOfMonth();
        System.out.println("日期是该月的第： "+todayOfMonth+"天");
        //查看日期是该年的第几天
        LocalDate diyDate5 = LocalDate.of(2023,8,27);
        int todayOfYear = diyDate5.getDayOfYear();
        System.out.println("日期是该年的第： "+todayOfYear+"天");
        //日期调整器,可以计算出某个月的第一个星期2之类的较为复杂的逻辑
        TemporalAdjusters ta;
    }
}
