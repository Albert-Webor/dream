package database.service;


import database.mapper.Kdpl_acct_bal_occrMapper;
import database.model.Kdpl_acct_bal_occr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Kdpl_acct_bal_occrService {

    @Autowired
    private Kdpl_acct_bal_occrMapper kaboMapper;

    //单条插入
    public void addUser(Kdpl_acct_bal_occr kabo) {
        kaboMapper.insertKABO(kabo); // 调用 MyBatis 插入方法
    }
}
