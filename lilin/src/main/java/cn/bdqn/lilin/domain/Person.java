package cn.bdqn.lilin.domain;

import java.util.Collection;
import java.util.LinkedHashSet;

import cn.bdqn.lilin.util.AutoIncKey;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document //1
public class Person {
	@Id
	@AutoIncKey
	private Long id;
	private String name;
	private Integer age;
	private String address;
	@Field("locs")
	private Collection<Location> locations =  new LinkedHashSet<Location>();
	

	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Collection<Location> getLocations() {
		return locations;
	}

	public void setLocations(Collection<Location> locations) {
		this.locations = locations;
	}
	

}
