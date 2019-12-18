package com.amway.dms.part_three_trial.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;

import java.util.Arrays;
import java.util.function.Consumer;

@Slf4j
@Configuration
public class ConsumerConfig {

  @Bean
  public Consumer<Message<byte[]>> eventConsumer() {

    return input -> System.out.println(Arrays.toString(input.getPayload()));
  }
}
