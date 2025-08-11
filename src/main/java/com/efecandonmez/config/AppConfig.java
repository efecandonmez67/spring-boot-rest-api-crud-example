package com.efecandonmez.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.efecandonmez.model.Employee;

@Configuration
public class AppConfig {

	//instead of using a database, i created data here.
	@Bean
	public List<Employee> employeeList() {
		List<Employee> employeeList= new ArrayList<>();
		employeeList.add(new Employee("1", "Efecan", "Donmez"));
		employeeList.add(new Employee("2", "Zeynep", "Yılmaz"));
		employeeList.add(new Employee("3", "Ahmet", "Kaya"));
		employeeList.add(new Employee("4", "Elif", "Demir"));
		employeeList.add(new Employee("5", "Mert", "Şahin"));
		employeeList.add(new Employee("6", "Ayşe", "Koç"));
		employeeList.add(new Employee("7", "Emre", "Aslan"));
		employeeList.add(new Employee("8", "Nazlı", "Aydın"));
		employeeList.add(new Employee("9", "Burak", "Yıldız"));
		employeeList.add(new Employee("10", "Derya", "Polat"));
		employeeList.add(new Employee("11", "Can", "Türkmen"));

		return employeeList;



	}
}
