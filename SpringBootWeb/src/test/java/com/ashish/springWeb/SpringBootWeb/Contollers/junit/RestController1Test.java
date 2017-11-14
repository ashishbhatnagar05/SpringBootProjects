package com.ashish.springWeb.SpringBootWeb.Contollers.junit;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyObject;

import javax.validation.constraints.AssertTrue;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import com.ashish.springWeb.SpringBootWeb.Controllers.RestController1;
import com.ashish.springWeb.SpringBootWeb.Controllers.Model.Quote;
import com.ashish.springWeb.SpringBootWeb.Service.QuoteListService;

public class RestController1Test {

	private RestController1 sut;

	@Before
	public void setup() {
		sut = new RestController1();
		mockQuoteListService();
	}

	private void mockQuoteListService() {
		QuoteListService quoteListService = EasyMock.createMock(QuoteListService.class);
		Quote quote = new Quote();
		quote.setId(1);
		quote.setQuote("quote");
		EasyMock.expect(quoteListService.getQuoteById(1)).andReturn(quote);
		EasyMock.expect(quoteListService.getQuotes()).andReturn(anyObject());
		EasyMock.replay(quoteListService);
		sut.setQuoteListService(quoteListService);
	}

	@Test
	public void testGetQuoteById() {
		Quote quote = sut.getQuoteById(1);
		assertEquals(quote.getQuote(), "quote");
	}
}
