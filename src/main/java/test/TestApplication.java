package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        String x = null;
        x.length();
        SpringApplication.run(TestApplication.class, args);
    }
}
