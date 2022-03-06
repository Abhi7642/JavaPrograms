package com.java.programs;

import java.util.HashMap;

public class UsingHashMap {

	public static void main(String[] args) {
		String str ="aeroplane";
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		char []ch=str.toCharArray();
		
		for(char c:ch)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		System.out.println(str +":"+map);
		
	}

}
