package com.soundsystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/com/soundsystem/app.properties")
public class EnvironmentConfig {

  @Autowired
  Environment env;
  
  @Bean
  public BlankDisc blankDisc() {
    return new BlankDisc(
        env.getProperty("disc.title"),
        env.getProperty("disc.artist"));
  }

  public static void main(String[] args)  throws Exception{

    Properties properties=new Properties();
    BufferedReader reader=new BufferedReader(new FileReader("/Users/elephant/dev/github_codes/springinaction4th/chapter3/external/src/main/resources/com/soundsystem/app.properties"));
    properties.load(reader);
    System.out.println(properties.getProperty("disc.title"));
    System.out.println(properties.getProperty("disc.artist"));
  }
  
}
