package database;

import database.mapper.Kdpl_acct_bal_occrMapper;
import database.model.Kdpl_acct_bal_occr;
import database.service.Kdpl_acct_bal_occrService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Bulk implements Runnable{

    private Kdpl_acct_bal_occrMapper kaboMapper;

    public Bulk(Kdpl_acct_bal_occrService userService, Kdpl_acct_bal_occr kabo, String bankCode, int beginCustNum, int endCustNum) {
        this.userService = userService;
        this.kabo = kabo;
        this.bankCode = bankCode;
        this.beginCustNum = beginCustNum;
        this.endCustNum = endCustNum;
    }

    Kdpl_acct_bal_occrService userService;
    Kdpl_acct_bal_occr kabo;
    String bankCode;
    int beginCustNum;
    int endCustNum;
    @Override
    public void run() {
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
        String[] lglPenr_code = {"56","84","90","71"};
        String beginAcctNum = "0000000001";
        String beginLblAcctNum = "0000000000000000000001";
        String beginSerlNum = "1";
        kabo.setLglPernCode(bankCode);
        for (int i=beginCustNum;i<endCustNum;i++) {  //10万个客户
            kabo.setCustNum(String.format("%0" + 22 + "d", i));
            for (int x=1;x<10;x++) {  //一个账户10个负债账号
                kabo.setLbltyAcctNum(String.format("%0" + 22 + "d", x));
                for (int m=0;m<50;m++) {  //一个负债账号一天50笔明细
                    kabo.setDetlSerlNum(Long.valueOf(m));
                    kabo.setCustAcctNum(String.format("%010d", (long)(random.nextDouble() * 1_000_000_0000L)));
//                    System.out.print(bankCode+"###"+beginCustNum+"###"+endCustNum+"@@@@");
//                    System.out.println("线程ID："+Thread.currentThread().getId()+"---"+"客户号:"+kabo.getCustNum()+"---"+"负债账号："+kabo.getLbltyAcctNum()+"---"+"明细序号："+kabo.getDetlSerlNum());
                    userService.addUser(kabo);
                }
            }
        }
    }
}
