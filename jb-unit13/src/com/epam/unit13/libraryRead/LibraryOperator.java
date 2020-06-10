package com.epam.unit12.libraryRead;

import java.io.BufferedReader;
import java.io.FileReader;

public class LibraryOperator {
		public static void main(String[] args){
			Library myLibrary = new Library();
			String file = "src\\com\\epam\\unit12\\libraryRead\\Books.txt";	
		    String line = null;
		    try {
	            BufferedReader reader = new BufferedReader(new FileReader(file));
	            while ((line = reader.readLine()) != null) {
	                String[] items = line.split(" ");
	                myLibrary.add(new Book(items[0], items[1], Integer.parseInt(items[2]), Integer.parseInt(items[3])));
	            }
	            reader.close();
	        }
	        catch (Exception ex) {
	            ex.printStackTrace();
	        }
		    
			Book findBookbyTitle = myLibrary.findByTitle("ValeraBook");
			if(findBookbyTitle != null){
				System.out.println(findBookbyTitle.toString());
				System.out.println();
			}
			
			Book findBookbyAuthor = myLibrary.findByAuthor("Vasya");
			if(findBookbyAuthor != null){
				System.out.println(findBookbyAuthor.toString());
				System.out.println();
			}
			
			System.out.println(myLibrary.toString());
		}
}
