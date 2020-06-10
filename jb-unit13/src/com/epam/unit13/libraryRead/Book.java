package com.epam.unit12.libraryRead;

import java.util.Objects;

public class Book {
	private String title;
    private String author;
    private int price;
    private int yearPublished;
    
    public Book() {}
    
    public Book(String title, String author, int yearPublished, int price) {
    	this.title = title;
    	this.author = author;
    	this.yearPublished = yearPublished;
    	this.price = price;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public int getPrice() {
        return price;
    }
    
    public int getYearPublished() {
        return yearPublished;
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book book = (Book) obj;
		if (title != book.title) {
			return false;
		}
		if (author != book.author) {
			return false;
		}
		if (price != book.price) {
			return false;
		}
		if (yearPublished != book.yearPublished) {
			return false;
		}
		
		return true;
	}
    
	@Override
	public int hashCode() {
		return Objects.hash(title, author, price, yearPublished);
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", yearPublished=" + yearPublished + "]";
	}
	
}