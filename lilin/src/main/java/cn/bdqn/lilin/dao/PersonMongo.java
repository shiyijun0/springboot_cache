package cn.bdqn.lilin.dao;

import cn.bdqn.lilin.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface PersonMongo extends MongoRepository<Person,Long> {

    Person findByName(String name);

    @Query("{'age': ?0}")
    List<Person> withQueryFindByAge(Integer age);

}
