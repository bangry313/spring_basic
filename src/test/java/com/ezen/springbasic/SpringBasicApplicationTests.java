package com.ezen.springbasic;

import com.ezen.springbasic.domain.cookbook.dto.CookbookDto;
import com.ezen.springbasic.domain.cookbook.service.CookbookService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Arrays;
import java.util.List;

// 스프링 컨테이너 생성 및 빈 등록을 위한 에노테이션
@SpringBootTest
@Slf4j
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SpringBasicApplicationTests {
	@Autowired
	private ApplicationContext applicationContext;
	@Autowired
	private CookbookService cookbookService;

	@Test
	@Order(1)
	void contextLoads() {
		// 스프링 컨테이너에 등록된 모든 빈 조회
		String[] beanNames = applicationContext.getBeanDefinitionNames();
		log.info("---------- 스프링 컨테이너에 등록된 빈 목록 ----------");
		Arrays.asList(beanNames).forEach(beanName ->{
			log.info("빈 이름 : {}", beanName);
		});
	}

	@Test
	@Order(2)
	void cookbookRegisterTest() {
		cookbookService.regiterCookbook(new CookbookDto(1, "한식 요리책", "김기정", null));
		cookbookService.regiterCookbook(new CookbookDto(2, "중식 요리책", "김짱개", null));
		cookbookService.regiterCookbook(new CookbookDto(3, "양식 요리책", "김버터", null));
		log.info("요리책 등록 완료.");
	}

	@Test
	@Order(3)
	void CookbooksTest() {
		log.info("요리책 목록");
		List<CookbookDto> list = cookbookService.getCookbooks();
		list.forEach((cookbookDto) -> log.info("{}", cookbookDto));
	}
}
