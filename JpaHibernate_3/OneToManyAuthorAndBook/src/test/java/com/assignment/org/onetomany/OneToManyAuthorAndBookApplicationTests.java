package com.assignment.org.onetomany;


import com.assignment.org.onetomany.entity.Author3;
import com.assignment.org.onetomany.entity.Book3;
import com.assignment.org.onetomany.repository.AuthorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;
import java.util.*;

@SpringBootTest
class OneToManyAuthorAndBookApplicationTests {

	@Autowired
	AuthorRepository authorRepository;
	@Test
	void testOneToManySave() {
//		book_list.add(new Book3("Good Book","Ram Silaj Publishing"));
//		book_list.add(new Book3("Very Good Book","Best Publishing"));
//		book_list.add(new Book3("Very Very Good Book","Bad Publishing"));

		Author3 author3 =new Author3();
		author3.setAuthor_name("New Author");

		Book3 book1 = new Book3();
		book1.setBook_name("k");
		book1.setBook_publisher("kam");


		author3.addBook(book1);

		Book3 book2 = new Book3();
		book2.setBook_name("J");
		book2.setBook_publisher("Jam");
		author3.addBook(book2);

		Book3 book3 = new Book3();
		book3.setBook_name("L");
		book3.setBook_publisher("Lam");
		author3.addBook(book3);



		authorRepository.save(author3);
	}

	@Test
	void testOnetoManyRead() {
		Iterable<Author3> resultList=authorRepository.findAll();
		for(Author3 a:resultList){
			System.out.println(a.toString());
			a.getBook_list().forEach(System.out::println);
		}

	}

}
