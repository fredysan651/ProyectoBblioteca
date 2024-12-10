package co.edu.ue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import co.edu.ue.model.Autores;
import co.edu.ue.service.IAutoresService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value="consultar")
public class AutoresController {
	@Autowired 
	IAutoresService service;
	
	@GetMapping(value="autores")
	public List<Autores> getAllAutores(){
		return service.getAllAutores();
	}
	
	

}
