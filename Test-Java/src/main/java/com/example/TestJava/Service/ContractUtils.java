package com.example.TestJava.Service;

import com.example.TestJava.DTO.ContractDTO;
import com.example.TestJava.Model.Contract;
import org.springframework.stereotype.Service;

@Service
public class ContractUtils {
    public ContractDTO contractToDTO(Contract contract){
        return new ContractDTO(
                contract.getId(),contract.getNumber(),
                contract.getDateCreate(),contract.getDateUpdate());
    }
}
