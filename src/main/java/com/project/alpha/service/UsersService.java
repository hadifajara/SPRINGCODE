package com.project.alpha.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.alpha.models.UsersModel;
import com.project.alpha.repository.UsersRepository;

@Service
@Transactional
public class UsersService {
	
	@Autowired
	UsersRepository usersRepo;
	
	public UsersModel saveData(UsersModel usersModel) {
		return usersRepo.save(usersModel);
	}

	public List<UsersModel> showAll() {
		return usersRepo.findAll();
	}

	public Optional<UsersModel> findData(Integer id) {
		return usersRepo.findById(id);
	}
	
}
