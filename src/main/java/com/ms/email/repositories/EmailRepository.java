package com.ms.email.repositories;

import javax.validation.constraints.Email;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email, Long> {
	
}
