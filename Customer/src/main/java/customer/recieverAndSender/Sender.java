package customer.recieverAndSender;


import customer.domain.Tab;
import customer.events.ParentEvent;
import customer.events.TabCreated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Sender {

    @Value("java_in_use_topic")
    private String jsonTopic;

    @Autowired
    private KafkaTemplate<String,ParentEvent> kafkaTemplate;

    public void send(ParentEvent event) {
        kafkaTemplate.send(jsonTopic, event);
    }
}