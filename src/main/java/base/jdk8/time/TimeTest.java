package base.jdk8.time;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.*;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeTest {
    public static void main(String[] args)   {
        BigInteger custAcctNum = new BigInteger("1124036786");
        BigInteger  btchMaxGrpQty = new BigInteger("20");
        System.out.println(custAcctNum.divideAndRemainder(btchMaxGrpQty)[1]);

    }
}
