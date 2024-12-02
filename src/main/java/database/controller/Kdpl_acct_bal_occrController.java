package database.controller;
import database.Bulk;
import database.model.Kdpl_acct_bal_occr;
import database.service.Kdpl_acct_bal_occrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Kdpl_acct_bal_occrController {
    @Autowired
    private Kdpl_acct_bal_occrService userService;
    private static final AtomicLong counter = new AtomicLong(0);

    @PostMapping("/addBulk")
    public void addUser1() {
        for(int i=1;i<=20;i++){
            Kdpl_acct_bal_occr kabo = new Kdpl_acct_bal_occr();
            initKabo(kabo);
            Bulk bulk = new Bulk(userService,kabo,"14",5000*(i-1),(5000*i)-1);
            new Thread(bulk).start();
        }
    }
    public void initKabo(Kdpl_acct_bal_occr kabo){
        Random random = new Random();
        kabo.setCardNum(String.format("%030d", Math.abs(random.nextLong())));
        kabo.setAcqFinclOrgCode(String.valueOf((long)(random.nextDouble() * Math.pow(10, 20)))); //20位的随机数
        kabo.setAcctRercNum(String.format("%030d", Math.abs(random.nextLong()))); //30位的随机数
        kabo.setBtchGrpNum(String.valueOf(ThreadLocalRandom.current().nextInt(10, 100)));
        kabo.setTxnSte("1");
        kabo.setFileProcId(String.format("%030d", Math.abs(random.nextLong())));
        String date = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        kabo.setExteDt(date);
        kabo.setTxnDt8(date);
        kabo.setHostDt(date);
    }
}

