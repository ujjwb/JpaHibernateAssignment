package com.assignment.org.onetoone;

import com.assignment.org.onetoone.entity.Address;
import com.assignment.org.onetoone.entity.Author1;
import com.assignment.org.onetoone.entity.Book1;
import com.assignment.org.onetoone.entity.Subject;
import com.assignment.org.onetoone.repository.AuthorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.codec.json.Jackson2JsonEncoder;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class OneToOneAuthorAndBookApplicationTests1 {

	@Autowired
	AuthorRepository authorRepository;
	@Test
	void testOneToOneSave() {
		List<Subject> subjectList=new ArrayList<>(Arrays.asList(new Subject(1,"Horror"),new Subject(2,"Comedy"), new Subject(3,"Romance")));
		Book1 book1 =new Book1("Book1","Ram Silaj Publishing");
		Address address=new Address(24,"Cannaught Place","Delhi");
		Author1 author1 =new Author1(address,subjectList, book1);
		authorRepository.save(author1);
	}

	@Test
	@Transactional
	void testOnetoOneRead(){
		System.out.println(authorRepository.findById(1).get());
	}

}
