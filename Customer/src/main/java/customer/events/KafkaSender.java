package customer.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaSender {
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    String kafkaTopic="java_in_use_topic";
    public void send(String string){
        kafkaTemplate.send(kafkaTopic,string);
    }
}
