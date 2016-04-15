package id.go.bkn.app.controller;

import id.go.bkn.app.entities.Instansi;
import id.go.bkn.app.entities.User;
import id.go.bkn.app.service.InstansiService;
import id.go.bkn.app.service.UserService;
import id.go.bkn.app.util.RestUtil;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private InstansiService instansiService;

	@RequestMapping(value = "/api/v1/users", method = RequestMethod.GET)
	public List<User> list() {
		return userService.findAll();
	}

	@RequestMapping(value = "/api/v1/instansis", method = RequestMethod.GET)
	public ResponseEntity<List<Instansi>> listInstansi() {
		List<Instansi> result = instansiService.findAll();
		return RestUtil.getJsonResponse(result, HttpStatus.OK);
	}
}
