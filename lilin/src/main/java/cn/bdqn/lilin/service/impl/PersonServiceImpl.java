package cn.bdqn.lilin.service.impl;

import cn.bdqn.lilin.dao.PersonMapper;
import cn.bdqn.lilin.domain.Person;
import cn.bdqn.lilin.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonMapper personMapper;

    @Override
    @CachePut(value = "people", key = "#person.id")
    public Person save(Person person) {
        int p = personMapper.insertSelective(person);
        System.out.println("为id、key为:"+person.getId()+"数据做了缓存");

        return person;
    }

    @Override
    @CacheEvict(value = "people")//2
    public int remove(Long id) {
        System.out.println("删除了id、key为"+id+"的数据缓存");
        //这里不做实际删除操作
        return 1;
    }

    @Override
    @Cacheable(value = "people", key = "#person.id")//3
    public Person findOne(Person person) {
        Person p = personMapper.selectByPrimaryKey(person.getId());
        System.out.println("为id、key为:"+p.getId()+"数据做了缓存");
        return p;
    }
}
