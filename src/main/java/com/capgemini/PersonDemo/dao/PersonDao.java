package com.capgemini.PersonDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.PersonDemo.person.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer>
{
	//public void addNew(Person person);
}
