package com.kafka.demo.producer;

import com.kafka.demo.proto.RequestOuterClass;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import java.util.function.Supplier;

@Configuration
@RequiredArgsConstructor
public class ProducerConfig {

  @Bean
  public Supplier<Message> randomProducer () {
    return () -> MessageBuilder.withPayload(
        RequestOuterClass.Request.newBuilder()
            .setAmount(333)
            .build())
        .build();
  }

}
