package cn.bdqn.lilin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class LilinApplication {

    public static void main(String[] args) {
        SpringApplication.run(LilinApplication.class, args);
    }
}
