package ysw.study.cicdtest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CiCdTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CiCdTestApplication.class, args);
    }

//    @Bean
//    ApplicationRunner applicationRunner(@Value("${my-first-secret}") String myFirstSecret) {
//        return args -> {
//            System.out.println("ASM inject test: " + myFirstSecret);
//        };
//    }

}
