package com.jrp.mms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jrp.mms.entity.Employee;
import com.jrp.mms.repository.EmployeesRepository;

@SpringBootApplication
public class MembersManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MembersManagementSystemApplication.class, args);
	}
	
	@Autowired
	private EmployeesRepository employeesRepository;

	@Override
	public void run(String... args) throws Exception {
		
//		Employee em1 = new Employee("Athar", "Panahi", "ath.pnh@gmail.com");
//		employeesRepository.save(em1);
//		
//		Employee em2 = new Employee("Bahador", "Soleimani", "bh.slm@gmail.com");
//		employeesRepository.save(em2);
//		
//		Employee em3 = new Employee("Taha", "Panahi", "th.pnh@gmail.com");
//		employeesRepository.save(em3);
		
	}
	
	

}
