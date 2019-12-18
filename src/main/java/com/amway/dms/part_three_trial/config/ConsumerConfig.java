package com.amway.dms.part_three_trial.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Slf4j
@Configuration
public class ConsumerConfig {

  @Bean
  public Consumer<String> eventConsumer() {
    return System.out::println;
  }
}
