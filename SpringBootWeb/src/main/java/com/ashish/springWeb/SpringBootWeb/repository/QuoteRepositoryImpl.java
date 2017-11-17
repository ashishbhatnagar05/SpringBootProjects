package com.ashish.springWeb.SpringBootWeb.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import com.ashish.springWeb.SpringBootWeb.DTO.QuoteDTO;

@Transactional
@Repository
@Scope("singleton")
public class QuoteRepositoryImpl implements QuoteRepository {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void addQuote(QuoteDTO quote) {
		entityManager.persist(quote);
	}
}
