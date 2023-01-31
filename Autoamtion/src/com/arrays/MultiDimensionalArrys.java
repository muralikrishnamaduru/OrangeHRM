package com.arrays;

public class MultiDimensionalArrys {
	public static void main(String[] args) {
		
		// dataType ArrName[][]=new dataType[][]
		
		String str[][]=new String[2][2];
		
		str[0][0]="selenium";
		str[0][1]="Testing";
		str[1][0]="LiveTech";
		str[1][1]="AutomationTesting";
		/*
		 * System.out.println(str[0][0]); System.out.println(str[0][1]);
		 * System.out.println(str[1][0]); System.out.println(str[1][1]);
		 * 
		 */
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println(str[i][j]+"");
			}
		System.out.println();
		
	}

	}
}

