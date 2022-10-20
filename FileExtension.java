package com.exercise.bll;

public class FileExtension {

	public static void main(String[] args) {
		String []names = {"Prahash", "Chaithanya", "Ramesh"};  //array of student's name
		String []files = {"Circle.java", "notes.txt", ""};    //array of their files
		
		int i=0;
		
		for(String file:files) {  //using for loop for string values
		System.out.println(i);   
		
			try {
			
			//Calling of method in main method to check file extensions
			int r = checkFileExtension(file);
	       
			if(r==1)//condition check
				System.out.println("Hello " + names[i] +". Your " + file + " is a java file. And your score is 1");
			else
				System.out.println("Hello " + names[i] +". Your " + file + " is not a java file. And your score is 0");
			 
		}	
			
			
		catch(NullException ex) {//null string
			System.out.println("Hello " + names[i] +". You have send a null. Your score is -1");
			System.out.println(ex.getMessage());
		}
				
		catch(EmptyException ex) {//empty string
			System.out.println("Hello " + names[i] +". You have send an empty string. Your score is -1");
			System.out.println(ex.getMessage());
		}
		
		catch(Exception ex) {//other exception
			System.out.println("Your score is -1");
			System.out.println(ex.getMessage());
		}
				
			i++;	//increment
		}    
	}

	//Method to check file extensions
	public static int checkFileExtension(String fileName) throws NullException, EmptyException {
		
		if(fileName == null)
			throw new NullException("You have send the null string.");
		
		
		if(fileName.isEmpty())
			throw new EmptyException("You have send the empty string.");
		
		if(fileName.endsWith(".java"))
			return 1;
		else 
			return 0;

	}

}
