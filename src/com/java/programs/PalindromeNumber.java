package com.java.programs;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int r=0,temp;
		System.out.println("Enter the number :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		temp=num;
		while(num!=0)
		{
			r=r*10+num%10;
			num=num/10;
		}
		if(temp==r)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not Palindrome Number");

	}

}
