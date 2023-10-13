package com.cloud.vandana.java;

import java.util.Random;

//Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.
public class ArrayShuffle {

	public static void main(String[] args) {

		int [] arr= {1,2,3,4,5,6,7};
		
		Random randNum=new Random();
		
		for(int i=0;i<arr.length;i++) {
			int randNumToSwap=randNum.nextInt(arr.length);
			int temp=arr[randNumToSwap];
			arr[randNumToSwap]=arr[i];
			arr[i]=temp;
			
		}
		
		
		
		for(int num:arr) {
			System.out.print(num+" ");
		}
		
	}
}
