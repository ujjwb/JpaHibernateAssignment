package com.assignment.org.inheritance3;

import com.assignment.org.inheritance3.entity.DieselCar3;
import com.assignment.org.inheritance3.entity.PetrolCar3;
import com.assignment.org.inheritance3.repository.JoinedRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InheritanceMapping3ApplicationTests {
	@Autowired
	JoinedRepository joinedRepository;

	@Test
	void testMapping() {
		DieselCar3 diesel=new DieselCar3("Ujjwal",80d);
		PetrolCar3 petrol=new PetrolCar3("Yash",100d);

		System.out.println("Saving Diesel");
		joinedRepository.save(diesel);
		System.out.println("Saving Petrol");
		joinedRepository.save(petrol);
	}
}
