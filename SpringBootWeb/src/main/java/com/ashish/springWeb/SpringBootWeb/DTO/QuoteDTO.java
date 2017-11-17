package com.ashish.springWeb.SpringBootWeb.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class QuoteDTO {
	@Id
	@GeneratedValue
	@Column(name = "Id")
	private Integer id;
	@Column(name = "Quote")
	private String quote;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

}
