package com.example.TestJava;

import com.example.TestJava.Model.Contract;
import com.example.TestJava.Repository.ContractRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class TestJavaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TestJavaApplication.class, args);
	}
	@Autowired
	private ContractRepositoryImpl contractRepository;

	@Override
	public void run(String... args) throws Exception {
		for(int i = 0;i < 100;i++){
			Contract contract = new Contract();
			contract.setNumber(i*100);
			contractRepository.saveContract(contract);
		}
	}
}
