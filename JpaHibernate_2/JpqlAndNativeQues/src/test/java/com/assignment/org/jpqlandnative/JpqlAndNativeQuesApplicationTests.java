package com.assignment.org.jpqlandnative;

import com.assignment.org.jpqlandnative.entity.Employee;
import com.assignment.org.jpqlandnative.repository.EmpRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import javax.transaction.Transactional;

@SpringBootTest
class JpqlAndNativeQuesApplicationTests {

	@Autowired
	EmpRepository empRepository;
	@Test
	@Transactional
	public void testJplQuesries() {
		Double minSalary =empRepository.findMinSalary();
		Double avgSalary= empRepository.findAvgSalary();

		System.out.println("JPQL Question 1:");
		System.out.println(empRepository.jpqlQues1(avgSalary, Sort.by(new Sort.Order(Sort.Direction.ASC,"age"),new Sort.Order(Sort.Direction.DESC,"salary"))));
		System.out.println("JPQL Question 2: ");
		empRepository.jpqlQues2(35000d,avgSalary);
		System.out.println("JPQL Question 3:");
		System.out.println(empRepository.jpqlQues3(minSalary));
		System.out.println("Native Question 1:");
		empRepository.nativeQueryQues1().stream().map(e->e[0]+" "+e[1]+" "+e[3]).forEach(System.out::println);
		System.out.println("Native Question 2:");
		empRepository.nativeQueryQues2(28);
	}


}
