package com.cg.app;

public class Demo01 {

	public static void main(String[] args) {
		System.out.println("Welcome");
		for(int c = 0 ; c < 10 ; c++) {
			if(c % 2 == 0) {
				System.out.println("Even number");
			}
			else {
				System.out.println("Odd Number");
			}
		}
		System.out.println("End of the program.");
	}

}
