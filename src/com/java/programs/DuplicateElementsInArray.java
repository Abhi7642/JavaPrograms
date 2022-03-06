package com.java.programs;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,2,6};
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate Elements Present Is : "+arr[i]);
					flag=true;
				}
			}
		}
		if(flag==false)
		{
			System.out.println("Duplicate Elements Not Present");
		}

	}

}
