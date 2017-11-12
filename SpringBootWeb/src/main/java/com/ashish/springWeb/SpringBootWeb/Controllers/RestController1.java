package com.ashish.springWeb.SpringBootWeb.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ashish.springWeb.SpringBootWeb.Controllers.Model.Quote;
import com.ashish.springWeb.SpringBootWeb.Service.QuoteListService;

@RestController
@RequestMapping("/home")
public class RestController1 {
	@Autowired
	private QuoteListService quoteListService;

	public QuoteListService getQuoteListService() {
		return quoteListService;
	}

	public void setQuoteListService(QuoteListService quoteListService) {
		this.quoteListService = quoteListService;
	}

	@GetMapping("/welcome")
	public String displayWelcomeMessage() {
		return "Hi, Welcome to Ashish's First Rest Web application";
	}

	@GetMapping("/quotes")
	public List<Quote> getQuotes() {
		return quoteListService.getQuotes();

	}

	@GetMapping("/quote/{id}")
	public Quote getQuoteById(@PathVariable Integer id) {
		return quoteListService.getQuoteById(id);
	}
}
