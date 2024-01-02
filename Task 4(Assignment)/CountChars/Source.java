package com.edu;

import java.util.HashMap;
import java.util.Map;


public class Source {
	public Map<Character,Integer> countChars(char[]arr){
		Map<Character,Integer>charCount=new HashMap<>();
		
		for(char c:arr) {
			charCount.put(c, charCount.getOrDefault(c,0)+1);		
			}
	
	return charCount;
}
	
	public static void main(String[] args) {
		char[]arr= {'a','f','c','d','a','c'};
		
		Source source=new Source();
		
		Map<Character,Integer>result=source.countChars(arr);
		
		for(Map.Entry<Character, Integer>entry:result.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		

	}

}	
	


