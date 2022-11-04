package com.assignment.org.manytomany;


import com.assignment.org.manytomany.entity.Author2;
import com.assignment.org.manytomany.entity.Book2;

import com.assignment.org.manytomany.repository.AuthorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class ManyToManyAuthorAndBookApplicationTests {

	@Autowired
	AuthorRepository authorRepository;
	@Test
	void testManyToManySave() {
//		book_list.add(new Book3("Good Book","Ram Silaj Publishing"));
//		book_list.add(new Book3("Very Good Book","Best Publishing"));
//		book_list.add(new Book3("Very Very Good Book","Bad Publishing"));

		Author2 author1 =new Author2();
		author1.setAuthor_name("New Author");

		Book2 book1 = new Book2();
		book1.setBook_name("k");
		book1.setBook_publisher("kam");
		author1.addBook(book1);

		Book2 book2 = new Book2();
		book2.setBook_name("J");
		book2.setBook_publisher("Jam");
		author1.addBook(book2);

		Book2 book3 = new Book2();
		book3.setBook_name("L");
		book3.setBook_publisher("Lam");
		author1.addBook(book3);



		authorRepository.save(author1);
	}

	@Test
	void testOnetoManyRead() {
		Iterable<Author2> resultList=authorRepository.findAll();
		for(Author2 a:resultList){
			System.out.println(a.toString());
			a.getBook_list().forEach(System.out::println);
		}

	}

}
