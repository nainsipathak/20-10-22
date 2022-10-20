package com.exercise.bll;

import java.util.Scanner;

public class Dividecheck {
	public class DivideCheck {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			//Take inputs from user
			System.out.println("Enter numbers for division : ");
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			try {
				int div = divide(x , y);   //call of divide method
				System.out.println("Result : " + div);
			}
			
			catch(ArithmeticException ex) {
				System.out.println("Exception Caught !");
				System.out.println(ex.getMessage());
			}
			
			sc.close();
		}

		
		//Method to perform division
		public static int divide(int i, int j) throws ArithmeticException{
			if(j == 0) {
				throw new ArithmeticException("Denominator can't be zero.");   //exception will be thrown
			}
			return i/j;
		}

	}
}
