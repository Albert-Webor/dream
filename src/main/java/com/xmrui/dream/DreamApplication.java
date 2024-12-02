package com.xmrui.dream;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@MapperScan("database.mapper")
@ComponentScan(basePackages = {"database"})  // 扫描父包和子包
public class DreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(DreamApplication.class, args);
	}

}
