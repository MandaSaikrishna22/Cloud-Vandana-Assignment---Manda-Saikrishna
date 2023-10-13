package com.cloud.vandana.java;

import java.util.HashMap;
import java.util.Map;


//Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)
public class RomanNumToInteger {

	public static void main(String[] args) {
		String romanStr="IX";
		
		Map<Character, Integer> hashMap=new HashMap<Character, Integer>();
		hashMap.put('I', 1);
		hashMap.put('V', 5);
		hashMap.put('X', 10);
		hashMap.put('L', 50);
		hashMap.put('C', 100);
		hashMap.put('D', 500);
		hashMap.put('M', 1000);
		
		int res=0;
		int prevValue=0;
		
		for (int i = 0; i < romanStr.length(); i++) {
            int currentValue = hashMap.get(romanStr.charAt(i));
            
            //CVX
            if (currentValue > prevValue) {
                res =res+ currentValue - 2 * prevValue; // Subtract twice the previous value to account for the previous subtraction
            } else {
                res =res+ currentValue;
            }

            prevValue = currentValue;
        }
        System.out.println(res);
	}
	
	
}
