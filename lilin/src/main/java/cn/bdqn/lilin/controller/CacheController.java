package cn.bdqn.lilin.controller;

import cn.bdqn.lilin.domain.Person;
import cn.bdqn.lilin.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CacheController {
	
	@Autowired
	PersonService personService;

	@RequestMapping("/put")
	public Person put(Person person){
		return personService.save(person);
		
	}

	
	@RequestMapping("/able")
	public Person cacheable(Person person){
		
		
		return personService.findOne(person);
		
	}
	
	@RequestMapping("/evit")
	public String  evit(Long id){
		personService.remove(id);
		 return "ok";
		
	}
	

}
