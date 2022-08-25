package com.techment.pattern;

public class Pattern {
	int i,j,input;
	void makePattern(){
		for(i=1;i<=input;i++){
			for(j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Pattern pattern = new Pattern();
		pattern.input = 5;
		pattern.makePattern();
	}
}
