package com.ashish.springWeb.SpringBootWeb.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ashish.springWeb.SpringBootWeb.Controllers.Model.Quote;

@Service
public class QuoteListService {
	public List<Quote> getQuotes() {
		List<Quote> listOfQuotes = new ArrayList<Quote>();
		Quote quote1 = new Quote();
		quote1.setId(1);
		quote1.setQuote("Love yourself");
		Quote quote2 = new Quote();
		quote2.setId(2);
		quote2.setQuote("Love others");
		Quote quote3 = new Quote();
		quote3.setId(3);
		quote3.setQuote("Be healthy");
		listOfQuotes.add(quote1);
		listOfQuotes.add(quote2);
		listOfQuotes.add(quote3);
		return listOfQuotes;
	}
}
