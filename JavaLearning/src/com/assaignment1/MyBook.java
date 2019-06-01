package com.assaignment1;

import java.util.Scanner;

class MyBook extends Book {
	 @Override
		void setTitle(String s ){	 
       Scanner in =new Scanner(System.in);
		System.out.println("Input title: ");
			title = in.nextLine();
	}
	 void getTitle() {
		 System.out.println ("The title is:" + title);
	 }
	
	
	 
}
