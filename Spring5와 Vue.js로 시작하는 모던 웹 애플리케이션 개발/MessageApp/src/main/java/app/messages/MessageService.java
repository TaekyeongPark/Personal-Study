package app.messages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class MessageService {
    // 필드 기반의 주입은 사용하지 말자
    private MessageRepository repository;

    // 생성자 기반의 의존성 주입 : 현재 예제에서는 MessageRepository 빈이 MessageService 빈을 통해 의존성이 주입된다.
    @Autowired
    public MessageService(MessageRepository repository){
        this.repository = repository;
    }

    /*
    세터, 메소드 기반 의존성 주입
    @Required
    public void setRepository(MessageRepository repository){
        this.repository = repository;
    }
    */
    public void save(String text){
        this.repository.saveMessage(new Message(text));
    }

}
