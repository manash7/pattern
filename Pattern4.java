package com.techment.pattern;

import java.util.Scanner;

public class Pattern4 {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);    //System.in is a standard input stream  
	System.out.print("Enter TABLE name - ");  
	int a= sc.nextInt();  
	System.out.print("Enter the limit - ");  
	int b= sc.nextInt();
	for(int i =1; i<=b ;i++){
		System.out.println(a+"*"+i+"= "+a*i );
	}
	}
}
