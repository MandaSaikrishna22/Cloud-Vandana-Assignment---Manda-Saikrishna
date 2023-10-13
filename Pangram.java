package com.cloud.vandana.java;

public class Pangram {

	
	public static boolean  AtoZ(char alphabet) {
		
		char[] alphabetChar = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		for(char c:alphabetChar) {
			if(alphabet==c) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		String pangramStr="The quick brown fox jumps over lazy dog".toUpperCase().replace(" ", "");
		
		boolean flag=true;
		
		outerLoop:
		for(char alphabet:pangramStr.toCharArray()) {
			if(AtoZ(alphabet)==false) {
				flag=false;
				break outerLoop;
			}
			
			
		}
		
		if(flag) {
			System.out.println("It is a pangram");
		}
		else {
			System.out.println("It is not a pangram");
		}
		
		
	}
}
