package com.example.TestJava;

import com.example.TestJava.Repository.ContractRepositoryImpl;
import com.example.TestJava.Service.ContractService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestJavaApplicationTests {
	@Autowired
	private ContractRepositoryImpl contractRepository;
	@Autowired
	private ContractService contractService;

	@Test
	void contextLoads() {
	}

}
