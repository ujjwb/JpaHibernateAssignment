package com.assignment.org.inheritance1;

import com.assignment.org.inheritance1.entity.DieselCar1;
import com.assignment.org.inheritance1.entity.PetrolCar1;
import com.assignment.org.inheritance1.repository.SingleTableRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InheritanceMapping1ApplicationTests {

	@Autowired
	SingleTableRepository singleTableRepository;

	@Test
	void testMapping() {
		DieselCar1 diesel=new DieselCar1("Ujjwal",80d);
		PetrolCar1 petrol=new PetrolCar1("Yash",100d);

		System.out.println("Saving Diesel");
		singleTableRepository.save(diesel);
		System.out.println("Saving Petrol");
		singleTableRepository.save(petrol);
	}

}
