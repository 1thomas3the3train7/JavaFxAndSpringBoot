package com.example.TestJava.Controller;

import com.example.TestJava.DTO.ContractDTO;
import com.example.TestJava.Service.ContractService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContractController {
    private final ContractService contractService;

    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    @PostMapping(value = "/getcontract")
    public ResponseEntity<List<ContractDTO>> getContracts(@RequestParam(name = "page", required = false) int page){
        return ResponseEntity.ok(contractService.getContracts(page));
    }
}
