package app.messages;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//빈을 정의하는 파일임을 알리는 Configuration 어노테이션
@Configuration
//스캔할 기본 패키지를 스프링에 알리는 ComponentScan 어노테이션
@ComponentScan("app.messages")

public class AppConfig {
    // 빈이란 무엇인가
    // 스프링 IoC 컨테이너가 관리하는 자바 객체(인스턴스) : ApplicationContext.getBean()으로 얻을수 있는 객체

    /*
    //클래스 레벨에서 빈을 선언했으므로 필요가 없어진 빈 선언
    @Bean
    public MessageRepository messageRepository(){
        return new MessageRepository();
    }

    @Bean
    MessageService messageService(){
        return new MessageService(messageRepository());
    }
*/
}
