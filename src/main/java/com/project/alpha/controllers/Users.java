package com.project.alpha.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.alpha.models.UsersModel;
import com.project.alpha.repository.UsersRepository;
import com.project.alpha.service.UsersService;

@Controller
public class Users {
	
	@Autowired
	UsersService usersService;
	
	@Autowired
	UsersRepository usersRepo;
	
	@PostMapping("/user")
	@ResponseBody
	public UsersModel createNewUsers(@RequestBody UsersModel usersModel) {
		return usersRepo.save(usersModel);
	}
	
	@GetMapping("/users")
	@ResponseBody
	public List<UsersModel> findAllUsers() {
		return usersRepo.findAll();
	}
	
	@GetMapping("/user/{id}")
	@ResponseBody
	public UsersModel findUser(@PathVariable Integer id) {
		return usersRepo.findById(id).get();
	}
	
	@PostMapping("/user/edit/{id}")
	@ResponseBody
	public UsersModel createNewUsers(@PathVariable Integer id, @RequestBody UsersModel usersModel) {
		UsersModel getUsersModel = usersRepo.findById(id).get();
		
		getUsersModel.setNip(usersModel.getNip());
		getUsersModel.setNama(usersModel.getNama());
		getUsersModel.setJabatan(usersModel.getJabatan());
		
		UsersModel updateUser = usersRepo.save(getUsersModel);
		return updateUser;
	}
	
}