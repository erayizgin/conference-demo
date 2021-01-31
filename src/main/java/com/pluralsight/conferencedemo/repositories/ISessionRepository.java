package com.pluralsight.conferencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pluralsight.conferencedemo.models.Session;

public interface ISessionRepository extends JpaRepository<Session, Long>{
	
	
}
