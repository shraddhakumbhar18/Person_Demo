package com.capgemini.PersonDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.PersonDemo.person.Person;
import com.capgemini.PersonDemo.service.PersonService;

@RestController
public class PersonController 
{
	@Autowired
	private PersonService service;
	
	@RequestMapping("/")
	public Person addPerson()
	{
		Person person = new Person(101 , "Shraddha");
		service.addNew();
		return person;
		
	}
	
	
	  @RequestMapping("/get") 
	  public Person getPerson() 
	  { 
		  Person person = service.getPerson();
		  return person;
	  }
	 
}
