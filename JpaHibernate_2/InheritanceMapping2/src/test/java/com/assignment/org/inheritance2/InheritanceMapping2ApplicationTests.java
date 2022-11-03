package com.assignment.org.inheritance2;

import com.assignment.org.inheritance2.entity.DieselCar2;
import com.assignment.org.inheritance2.entity.PetrolCar2;
import com.assignment.org.inheritance2.repository.TablePerClassRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InheritanceMapping2ApplicationTests {

	@Autowired
	TablePerClassRepository tablePerClassRepository;
	@Test
	void testMapping() {
		DieselCar2 diesel=new DieselCar2("Ujjwal",80d);
		PetrolCar2 petrol=new PetrolCar2("Yash",100d);

		System.out.println("Saving Diesel");
		tablePerClassRepository.save(diesel);
		System.out.println("Saving Petrol");
		tablePerClassRepository.save(petrol);
	}

}
