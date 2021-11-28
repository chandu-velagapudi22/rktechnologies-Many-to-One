package com.example.demo.runner;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.RkTech_Department;
import com.example.demo.entity.RkTech_Employee;
import com.example.demo.repository.RkTech_Department_Repository;
import com.example.demo.repository.RkTech_EmployeeInterface;

@Component
public class ManyToOneRunner implements CommandLineRunner {

	@Autowired
	private RkTech_EmployeeInterface repository;
	@Autowired
	private RkTech_Department_Repository deptRepository;

	@Override
	public void run(String... args) throws Exception {
		RkTech_Department rkTech_Department = new RkTech_Department("Developer", "chandu");
		RkTech_Department rkTech_Department1 = new RkTech_Department("Operation", "chandu");
		RkTech_Department rkTech_Department2 = new RkTech_Department("Tester", "chandu");
		deptRepository.save(rkTech_Department);
		deptRepository.save(rkTech_Department1);
		deptRepository.save(rkTech_Department2);
		ArrayList<RkTech_Employee> arrayList = new ArrayList<>();
		arrayList.add(new RkTech_Employee(24, "approva", 7852.25, rkTech_Department));
		arrayList.add(new RkTech_Employee(25, "bhavana", 741.25, rkTech_Department));
		arrayList.add(new RkTech_Employee(26, "chandrika", 258.36, rkTech_Department1));
		arrayList.add(new RkTech_Employee(27, "rashma", 951.369, rkTech_Department2));
		arrayList.add(new RkTech_Employee(28, "megana", 65412.2, rkTech_Department2));
		repository.saveAll(arrayList);
	}

}
