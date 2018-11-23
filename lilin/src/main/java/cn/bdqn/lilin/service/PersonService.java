package cn.bdqn.lilin.service;


import cn.bdqn.lilin.domain.Person;

public interface PersonService {
	public Person save(Person person);
	
	public void remove(Long id);
	
	public Person findOne(Person person);

}
