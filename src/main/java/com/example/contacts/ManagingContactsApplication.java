package com.example.contacts;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.contacts.dao.ContactRepository;
import com.example.contacts.entities.Contacts;

@SpringBootApplication
public class ManagingContactsApplication implements CommandLineRunner {
	
	@Autowired
	private ContactRepository contactRepository;

	public static void main(String[] args) {
		SpringApplication.run(ManagingContactsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		contactRepository.save(new Contacts("afquir", "karim", df.parse("19/11/1992"), "karim@gmail.com", 066666, "karim.png"));
		contactRepository.save(new Contacts("afquir", "yassine", df.parse("10/01/2000"), "yassine@gmail.com", 066666, "karim.png"));
		contactRepository.save(new Contacts("afquir", "med", df.parse("25/08/1980"), "med@gmail.com", 066666, "karim.png"));
		contactRepository.save(new Contacts("afquir", "miloud", df.parse("25/08/1980"), "miloud@gmail.com", 066666, "karim.png"));
		contactRepository.save(new Contacts("afquir", "touria", df.parse("25/08/1980"), "touria@gmail.com", 066666, "karim.png"));
		contactRepository.findAll().forEach(c->{
			System.out.print("\n"+ c.getPrenom());
		});

		
	}

}
