package br.com.sacramental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.sacramental.dto.JwtUserDto;
import br.com.sacramental.dto.factory.UserFactory;
import br.com.sacramental.service.impl.UserServiceImpl;

@RestController
public class UsuarioController {

	@Autowired
	private UserServiceImpl userService; 
	
	@RequestMapping({ "/hello" })
	public String firstPage() {
		return "Hello there!";
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ResponseEntity<?> createUser(@RequestBody JwtUserDto userDto) {
		userService.saveUser(UserFactory.create(userDto));
		return ResponseEntity.ok("created");
	}
}
