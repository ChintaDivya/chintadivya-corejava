package com.tns.exception;


import java.util.scanner;


public class UserDefine {
	private static int age;
	   static void validate() throws Age{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		age=sc.nextInt();
		if (age<18)
	       throw new Age("invalid age");
		else
			System.out.println("valid age");
		   
	   }
	
}
