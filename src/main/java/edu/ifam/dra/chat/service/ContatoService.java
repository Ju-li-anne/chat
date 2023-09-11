package edu.ifam.dra.chat.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ifam.dra.chat.model.Contato;
import edu.ifam.dra.chat.repositories.ContatoRepositories;

@Service	
public class ContatoService {	
	
	@Autowired
	ContatoRepositories contatoRepositories;
	
	List<Contato> contatos = new ArrayList<>();
	
	public List<Contato> getContatos(){
		return contatoRepositories.findAll();
	}
	
	public Contato getContato(int id) {
		Optional<Contato> optionalContato = contatoRepositories.findById((long) id);
		if (optionalContato.isPresent())
			return optionalContato.get();
		return contatos.get(id);
	}
	
	public Contato setContato(Contato contato) {
		
		return contatoRepositories.save(contato);
	}
	
	public Contato setContato(Long id, Contato contato) {
		Optional<Contato> optionalContato = contatoRepositories.findById((long) id);
		if (optionalContato.isPresent())
			contato.setId(id);
		return contatoRepositories.save(contato);
		
	}
	
	public void deleteContato(Long id) {
		Optional<Contato> optionalContato = contatoRepositories.findById((long) id);
		if (optionalContato.isPresent())
			contatoRepositories.deleteById(id);
		
	}
	
}