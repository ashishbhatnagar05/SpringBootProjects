package com.ashish.springWeb.SpringBootWeb.Contollers;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;
import com.ashish.springWeb.SpringBootWeb.Controllers.Model.Library;
import com.ashish.springWeb.SpringBootWeb.Controllers.Model.Quote;

public class RestController1Test {

	private static final String TEST_URL = "http://localhost:8080/home/";
	private RestTemplate restTemplate;
	private ObjectMapper mapper;

	@Test
	public void displayWelcomeMessage() {
		restTemplate = new RestTemplate();
		String message = restTemplate.getForObject(TEST_URL + "welcome", String.class);
		System.out.println(message);
	}

	@Test
	public void testGetQuoteById() {
		restTemplate = new RestTemplate();
		for (int i = 1; i <= 3; i++) {
			Quote quote = restTemplate.getForObject(TEST_URL + "quote/" + i, Quote.class);
			System.out.println(quote.toString());
		}
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testGetQuotes() {
		restTemplate = new RestTemplate();
		List<Quote> listOfQuotes = restTemplate.getForObject(TEST_URL + "quotes", List.class);
		System.out.println(listOfQuotes);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testGetLibrary() throws Exception {
		restTemplate = new RestTemplate();
		Library library = restTemplate.getForObject(TEST_URL + "library", Library.class);
		mapper = new ObjectMapper();
		String json = mapper.defaultPrettyPrintingWriter().writeValueAsString(library);
		System.out.println(json);
	}
}