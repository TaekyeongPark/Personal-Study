package app.messages;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//빈을 정의하는 파일임을 알리는 Configuration 어노테이션
@Configuration
//스캔할 기본 패키지를 스프링에 알리는 ComponentScan 어노테이션
@ComponentScan("app.Messages")

public class AppConfig {

    @Bean
    public MessageRepository messageRepository(){
        return new MessageRepository();
    }

    @Bean
    MessageService messageService(){
        return new MessageService(messageRepository());
    }

}
