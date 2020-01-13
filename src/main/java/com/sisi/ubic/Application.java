package com.sisi.ubic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

// @SpringBootApplication 으로 인해
// 스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성을
// 모두 자동으로 설정된다.
// 특히나 @SpringBootApplication 이 있는 위치부터
// 설정을 읽어가기 때문에
// 이 클래스는 항상 프로젝트 최상단에 위치해야 한다.
@EnableJpaAuditing // JPA Auditing 활성화
@SpringBootApplication
public class Application {
    // main 메소드에서 실행하는 SpringApplication.run 으로 인해
    // 내장 WAS 를 실행한다.
    // 그래서 항상 서버에 tomcat 을 설치할 필요가 없고,
    // 스프링부트로 만들어진 Jar 파일:실행가능한 Java 패키징 파일로 실행한다.
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}

// 내장 WAS 를 사용하면 언제 어디서나 같은 환경에서 스프링부트를 배포할 수 있다.
// 외장 WAS 를 쓴다고 하면, 모든 서버는 WAS의 종류,버전,설정을 일치시켜야 한다.