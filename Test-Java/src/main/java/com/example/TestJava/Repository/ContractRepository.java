package com.example.TestJava.Repository;

import com.example.TestJava.Model.Contract;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ContractRepository {
    void saveContract(Contract contract);

    List<Contract> getContracts(int page);
}
