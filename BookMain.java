package com.exercise.bll;

public class BookMain {

	public static void main(String[] args) {
		Book[] arr = new Book[5];
		arr[1] = new Book(1, "Networking");
		arr[2] = new Book(2, "Panchtantra");
		arr[3] = new Book(3, "Gitanjali");
        arr[4] = new Book(4, "Gk");
        arr[5] = new Book(4, "History");
		//Store all books details in books array
		try {
			boolean isFound = findById(arr, 8);  //Calling method findById 
			if(isFound)
				System.out.println("Found");
		}
		catch(BookNotFoundException ex) {
			
			//System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
}

// Method to match the given id with the  id of array of Book 
	public static boolean findById(Book[] books, int id) throws BookNotFoundException {
		
		for(int i = 0; i< books.length;) {
			
			if(books[i].getId() == id) 
				//System.out.println("Found");
				return true;
			
			else 
				throw new BookNotFoundException("Book not found.");
			
		}
		return false;
		
	}
}