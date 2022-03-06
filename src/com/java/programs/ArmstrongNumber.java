package com.java.programs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int r=0,temp,sum=0;
		System.out.println("Enter the number :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		temp=num;
		while(num!=0)
		{
			r=num%10;
			sum=sum+r*r*r;
			num=num/10;
		}
		System.out.println(sum);
		if(temp==sum)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");
		

	}

}
