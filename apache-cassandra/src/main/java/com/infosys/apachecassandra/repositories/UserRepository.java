package com.infosys.apachecassandra.repositories;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infosys.apachecassandra.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long>{

	//@Query(allowFiltering = true)
	public User findUserByUsername(String username);
	
	//@Query(allowFiltering = true)
	public User findUserByUsernameAndPassword(String username, String password);
}
