package org.moyu.blog.config;

import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author fuhaixin
 * @date 2022/6/30
 */
@Configuration
public class JacksonConfig {
  @Bean
  public Hibernate5Module hibernate5Module() {
    return new Hibernate5Module();
  }
}
