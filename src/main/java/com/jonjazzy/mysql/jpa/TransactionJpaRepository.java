package com.jonjazzy.mysql.jpa;

import com.jonjazzy.mysql.entity.Transactions;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class TransactionJpaRepository
{
    /*
        Connect to Database
        All d operations performed in a specific session are stored inside @PersistenceContext.
        EntityManager is the Interface to the @PersistenceContext
    */
    @PersistenceContext
    EntityManager entityManager;

    public List<Transactions> findAll() {
        TypedQuery<Transactions> namedQuery = entityManager.createNamedQuery("find_all_transactions", Transactions.class);
        return namedQuery.getResultList();
    }

    public Transactions update(Transactions person) {
        return entityManager.merge(person);
    }
}
