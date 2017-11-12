package com.ashish.springWeb.SpringBootWeb.Controllers.Model;

import java.util.List;

public class Library {

	private List<Book> book;

	public static class Book {
		private Integer id;
		private Price price;

		public Price getPrice() {
			return price;
		}

		public void setPrice(Price price) {
			this.price = price;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		private String name;
		private Author author;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Author getAuthor() {
			return author;
		}

		public void setAuthor(Author author) {
			this.author = author;
		}

		public static class Author {
			private String name;

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			@Override
			public String toString() {
				return "Author [name=" + name + "]";
			}

		}

		public static class Price {
			private Integer costPrice;
			private Integer selligPrice;
			private Integer discount;

			public Integer getCostPrice() {
				return costPrice;
			}

			public void setCostPrice(Integer costPrice) {
				this.costPrice = costPrice;
			}

			public Integer getSelligPrice() {
				return selligPrice;
			}

			public void setSelligPrice(Integer selligPrice) {
				this.selligPrice = selligPrice;
			}

			public Integer getDiscount() {
				return discount;
			}

			public void setDiscount(Integer discount) {
				this.discount = discount;
			}

			@Override
			public String toString() {
				return "Price [costPrice=" + costPrice + ", selligPrice=" + selligPrice + ", discount=" + discount
						+ "]";
			}

		}

	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

}
