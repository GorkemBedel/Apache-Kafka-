package Gorkem.ApacheKafka.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Component
public class KafkaListeners {

    @KafkaListener(topics = "Gorkem",
                   groupId = "groupId"
    )
    void Listener(String data){
        System.out.println("Listener received: " + data + ".");

    }
}
