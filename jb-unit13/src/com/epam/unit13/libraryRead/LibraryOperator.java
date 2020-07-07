package com.epam.unit12.libraryRead;

import java.io.BufferedReader;
import java.io.FileReader;

// задание модуля зачтено
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
	            reader.close();// close вызывает только в finally
	        }
	        catch (Exception ex) {
	            ex.printStackTrace();// и не гасим просто так исключения, а то судя по твоему коду, что было исключение, что не было - все равно, гоу дальше выполнять код)
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
