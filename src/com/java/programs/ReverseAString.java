package com.java.programs;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		String str;
		System.out.println("Enter the String : ");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb=sb.reverse();
		System.out.println(sb);
	}

}
