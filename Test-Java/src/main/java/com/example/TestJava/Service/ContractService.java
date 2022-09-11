package com.example.TestJava.Service;

import com.example.TestJava.DTO.ContractDTO;
import com.example.TestJava.Repository.ContractRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContractService {

    private final ContractRepositoryImpl contractRepository;

    private final ContractUtils contractUtils;

    public ContractService(ContractRepositoryImpl contractRepository, ContractUtils contractUtils) {
        this.contractRepository = contractRepository;
        this.contractUtils = contractUtils;
    }

    public List<ContractDTO> getContracts(int page){
        List<ContractDTO> contractDTOS = new ArrayList<>();
        contractRepository.getContracts(page).forEach(c -> {
                    contractDTOS.add(contractUtils.contractToDTO(c));
                });
        return contractDTOS;
    }
}
