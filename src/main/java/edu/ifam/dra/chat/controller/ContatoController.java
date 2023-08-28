package edu.ifam.dra.chat.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ifam.dra.chat.model.Contato;
@RequestMapping("/contato")
@RestController



public class ContatoController {

	@GetMapping
	List<Contato> getAll(){
		return null;
	}
	
	@PostMapping
	Contato setContato(@RequestBody Contato contato) {
		return null;
			
	}
	
	@PutMapping ("/id")
	Contato setContato(@RequestBody Contato contato, @PathVariable Long id) {
		return null;
	}
	
	@DeleteMapping("/id")
	void deleteContato(@PathVariable Long id) {
		
	}
}
