package com.prjmng.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.prjmng.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);

}
