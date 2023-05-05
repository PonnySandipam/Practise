package sdetPrograms;

import java.util.*;
import java.util.HashMap;
public class PrintDuplicateCharacters {

	
	private static void PrintDup(String str) {
		// TODO Auto-generated method stub
		if(str.isEmpty()) {
			System.out.println("Empty String");
				}
		if(str.length()==1) {
			System.out.println("Single Character String");
				}
		if(str=="NULL") {
			System.out.println("NULL String");
				}
	char[] string=str.toCharArray();
	HashMap<Character, Integer> CharMap= new HashMap<Character,Integer>();
	
	for(Character ch : string) {
		
		if(CharMap.containsKey(ch)) {
			CharMap.put(ch,CharMap.get(ch)+1);
		}
		else {
			CharMap.put(ch, 1);
		}
	}
	
Set<Map.Entry<Character,Integer>> entryset=CharMap.entrySet();
int max=0;
char MaxChar=str.charAt(0);
for(Map.Entry<Character,Integer> entry : entryset) {
	
	if(entry.getValue()==1)
		System.out.println("The Duplicate Character is"+entry.getKey()+" and its count is"+entry.getValue());

if(entry.getValue()>max) {
	max=entry.getValue();
	MaxChar=entry.getKey();
}
}

System.out.println("maximum Occured character is"+MaxChar);
	
	
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String Str="aabbccddfeheeeef";
 PrintDup(Str);
	}


}
