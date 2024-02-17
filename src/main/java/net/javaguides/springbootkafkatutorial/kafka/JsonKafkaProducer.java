package net.javaguides.springbootkafkatutorial.kafka;

import net.javaguides.springbootkafkatutorial.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);

    private final KafkaTemplate<String, User> kafkaTemplate;

    public JsonKafkaProducer(KafkaTemplate<String, User> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(User user) {

        Message<User> message = MessageBuilder
                .withPayload(user)
                .setHeader(KafkaHeaders.TOPIC, "javaguides_json")
                .build();

        kafkaTemplate.send(message);

        LOGGER.info(String.format("Json message sent -> %s", user.toString()));
    }
}
