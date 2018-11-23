package cn.bdqn.lilin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableCaching
//@EnableMongoRepositories(basePackages = {"cn.bdqn.lilin.dao.mongo"})
public class LilinApplication {

    public static void main(String[] args) {
        SpringApplication.run(LilinApplication.class, args);
    }
}
