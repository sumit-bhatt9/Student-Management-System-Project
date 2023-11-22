package com.springboot.sms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.sms.model.User;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername (String username);

}
