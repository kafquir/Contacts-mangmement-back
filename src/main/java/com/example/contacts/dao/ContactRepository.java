package com.example.contacts.dao;
import com.example.contacts.entities.Contacts;



//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.query.Param;


 public interface ContactRepository extends JpaRepository<Contacts, Long> {
	//@Query("select c from Contacts c where c.nom like :x")
	//public Page<Contacts> search(@Param("x")String mc, Pageable page);

}
