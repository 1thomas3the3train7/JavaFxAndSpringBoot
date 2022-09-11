package com.example.TestJava.Repository;

import com.example.TestJava.Model.Contract;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ContractRepositoryImpl implements ContractRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void saveContract(Contract contract) {
        em.persist(contract);
    }

    @Override
    @Transactional
    public List<Contract> getContracts(int page) {
        List<Contract> contracts = em.createQuery("select c from Contract c",Contract.class)
                .setFirstResult(15 * (page - 1))
                .setMaxResults(15)
                .getResultList();
        return contracts;
    }
}
