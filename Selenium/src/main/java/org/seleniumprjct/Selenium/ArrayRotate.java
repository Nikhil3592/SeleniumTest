package org.seleniumprjct.Selenium;

import java.util.Arrays;

public class ArrayRotate {

	public static int[] m1(int a1[])
	{
		int b[]=new int[a1.length];
		for(int i=0;i<a1.length;i++)
		{
			b[i]=a1[i];
		}
		return b;
	}
	public static void main(String[] args) {

		int k=0;
		int a[]= {1,2,3,4,5,6,7};

		for(int j=0;j<k;j++)
		{
			int b[]=m1(a);
			int num=a[a.length-1];
			for(int i=1;i<a.length;i++)
			{
				a[i]=b[i-1];
			}
			a[0]=num;
		}
			
		
		System.out.println(Arrays.toString(a));
	}

}
