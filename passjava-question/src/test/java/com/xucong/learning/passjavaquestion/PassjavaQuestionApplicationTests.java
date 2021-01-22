package com.xucong.learning.passjavaquestion;

import com.xucong.learning.passjavaquestion.entity.TypeEntity;
import com.xucong.learning.passjavaquestion.service.TypeService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@SpringBootTest
class PassjavaQuestionApplicationTests {

	@Autowired
	private TypeService typeService;

	@Test
	void contextLoads() {
	}

	@Test
	void insertType(){
		typeService.removeById(1L);
	}

}
