package com.xucong.learning.passjavaquestion;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xucong.learning.passjavaquestion.dao")
public class PassjavaQuestionApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassjavaQuestionApplication.class, args);
	}

}
