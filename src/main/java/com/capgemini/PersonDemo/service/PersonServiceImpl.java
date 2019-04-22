package com.capgemini.PersonDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.PersonDemo.dao.PersonDao;
import com.capgemini.PersonDemo.person.Person;

@Service
public class PersonServiceImpl implements PersonService
{
	@Autowired
	PersonDao dao;

	@Override
	public Person addNew() 
	{
		Person person = new Person(101 , "Shraddha",new Profile(11,"soe"));
		dao.save(person);
		return person;
	}

	@Override
	public Person getPerson() 
	{
		 Person person = dao.findById(101).get();
		 return person;
	}

}
