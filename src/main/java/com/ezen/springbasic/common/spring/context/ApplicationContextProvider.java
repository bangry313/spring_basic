package com.ezen.springbasic.common.spring.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

// Spring Boot 테스트 환경에서 스프링 ApplicationContext 접근을 위한 공통 클래스
// 스프링 컨테이너에 빈으로 등록
@Component
public class ApplicationContextProvider implements ApplicationContextAware {
    private ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
