package com.newsparser.newsparserspringbootjsoup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class NewsParserSpringbootJsoupApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsParserSpringbootJsoupApplication.class, args);
    }

}
