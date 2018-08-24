package eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Main {
    public static void main(String[] args) {
        System.out.println(1);
        SpringApplication.run(Main.class, args);
        System.out.println(2);
    }
}

