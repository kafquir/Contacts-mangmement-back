package com.example.contacts.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.querydsl.QPageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.contacts.dao.ContactRepository;
import com.example.contacts.entities.Contacts;



@Controller
@RestController
@CrossOrigin("*")



public class ContactRestWeb {
	
	@Autowired
	private ContactRepository contactRepository;
	
	
	@RequestMapping(value="/contacts",method=RequestMethod.GET)
	public List<Contacts> getContact(){
		return contactRepository.findAll();
	}
	
	@RequestMapping(value="/contacts/{id}",method=RequestMethod.GET)
	public Optional<Contacts> getContactId(@PathVariable Long id){
		return contactRepository.findById(id);
	}
	@RequestMapping(value="/contacts",method=RequestMethod.POST)
	public Contacts saveContact(@RequestBody Contacts c){
		return contactRepository.save(c);
	}
	
	@RequestMapping(value="/contacts/{id}",method=RequestMethod.DELETE)
	public boolean deleteContact(@PathVariable Long id){
		contactRepository.deleteById(id);
		return true;
	}
	
	
	/*
	 * @RequestMapping(value="/cherchercontacts",method=RequestMethod.GET) public
	 * 
	 * Page<Contacts> chercher(
	 * 
	 * @RequestParam(name="mc",defaultValue="") String mc,
	 * 
	 * @RequestParam(name="page",defaultValue="0") int p ,
	 * 
	 * @RequestParam(name="size",defaultValue="3") int s){ return
	 * contactRepository.search("%"+mc+"%", PageRequest.of(p, s)); }
	 */
	 
	 
}
