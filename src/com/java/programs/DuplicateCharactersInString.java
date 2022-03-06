package com.java.programs;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		String str="Joker";
		boolean flag=false;
		char []ch=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]==ch[j]) 
				{
					System.out.println("Duplicate Character Found is : "+ch[i]);
					//count++;
					flag=true;
					
				}
				
			}
		}
		if(flag==false)
			System.out.println("No Duplicate Elements Found");
		
		
		

	}

}
