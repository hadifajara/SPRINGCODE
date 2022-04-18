package com.project.alpha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.alpha.models.UsersModel;

@Repository
public interface UsersRepository extends JpaRepository<UsersModel, Integer> {
	
	

}
