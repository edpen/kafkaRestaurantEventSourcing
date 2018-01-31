package customer.recieverAndSender;

import java.util.ArrayList;
import java.util.List;

import customer.domain.Tab;
import customer.events.ParentEvent;
import customer.events.TabCreated;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    public static List<ParentEvent> list =new ArrayList();
    @KafkaListener(topics = "java_in_use_topic")
    public void receive(ParentEvent event) {
        list.add(event);
    }
}