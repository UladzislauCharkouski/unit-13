package com.epam.unit12.libraryRead;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> library = new ArrayList<Book>();
	
    public Library() {
    }
    
    public List<Book> getLibrary() {
    	return library;
    }
    
    public void add(Book book){
        library.add(book);
    }
    
    public boolean delete(Book book){
        return library.remove(book);
    }
    
    public Book findByTitle (String title){
        for (Book book : library){
            if (book.getTitle().equals(title))
                return book;
        }
        return null;
    }
    
    public Book findByAuthor (String author){
        for (Book book : library){
            if (book.getAuthor().equals(author))
                return book;
        }
        return null;
    }
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((library == null) ? 0 : library.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Library other = (Library) obj;
		if (library == null) {
			if (other.library != null)
				return false;
		} else if (!library.equals(other.library))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Library [library=" + library + "]";
	}
}
