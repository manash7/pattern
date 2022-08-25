package com.techment.pattern;

public class Pattern3 {
	int i,j,input;
	void makePattern(){
		for(i=1;i<=input;i++){
			for(j=1;j<=input;j++){
				if(i==1 || i==input|| j==1||j==input){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Pattern3 pattern = new Pattern3();
		pattern.input = 5;
		pattern.makePattern();
	}
}
