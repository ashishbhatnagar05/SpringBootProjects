package com.ashish.springWeb.SpringBootWeb.Persistant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashish.springWeb.SpringBootWeb.DTO.QuoteDTO;
import com.ashish.springWeb.SpringBootWeb.repository.QuoteRepository;

@Service
public class QuotePersistentServiceImpl implements QuotePersistentService {
	@Autowired
	private QuoteRepository quoteRepository;

	@Override
	public void saveQuote(QuoteDTO quoteDTO) {
		quoteRepository.addQuote(quoteDTO);
	}

}
