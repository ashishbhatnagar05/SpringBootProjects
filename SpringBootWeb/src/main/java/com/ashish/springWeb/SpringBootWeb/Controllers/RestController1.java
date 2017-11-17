package com.ashish.springWeb.SpringBootWeb.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ashish.springWeb.SpringBootWeb.Controllers.Model.Library;
import com.ashish.springWeb.SpringBootWeb.Controllers.Model.Quote;
import com.ashish.springWeb.SpringBootWeb.DTO.QuoteDTO;
import com.ashish.springWeb.SpringBootWeb.Persistant.service.QuotePersistentService;
import com.ashish.springWeb.SpringBootWeb.Service.LibraryService;
import com.ashish.springWeb.SpringBootWeb.Service.QuoteListService;

@RestController
@RequestMapping("/home")
public class RestController1 {
	@Autowired
	private QuoteListService quoteListService;
	@Autowired
	private LibraryService libraryService;
	@Autowired
	private QuotePersistentService quotePersistentService;

	public void setQuotePersistentService(QuotePersistentService quotePersistentService) {
		this.quotePersistentService = quotePersistentService;
	}

	public void setBookListService(LibraryService libraryService) {
		this.libraryService = libraryService;
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

	@GetMapping("/library")
	public Library getLibrary() {
		return libraryService.getLibrary();
	}

	@RequestMapping(value = "/saveQuote/{quote}", method = RequestMethod.POST)
	public String saveQuote(@PathVariable("quote") String quote) {
		QuoteDTO quoteDTO = new QuoteDTO();
		quoteDTO.setQuote(quote);
		quotePersistentService.saveQuote(quoteDTO);
		return "The Quote has been persisted to the database";
	}
}
