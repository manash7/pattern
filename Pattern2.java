package com.techment.pattern;

public class Pattern2 {
	int i,j,input,rows;
	void makePattern(){
		for(i=1;i<=rows;i++){
			for(j=1;j<=i;j++){
				System.out.print(input+" ");
				++input;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Pattern2 pattern = new Pattern2();
		pattern.input=1;
		pattern.rows = 5;
		pattern.makePattern();
	}
}
