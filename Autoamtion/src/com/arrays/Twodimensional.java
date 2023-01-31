package com.arrays;

public class Twodimensional {
          public static void main(String[] args) {
			//DataType arr[][]=new datatype[][]; 
        	  String str[][]=new String[2][2];
        	  str[0][0]="Manuval Testing";
        	  str[0][1]="LiveTech";
        	  str[1][0]="selenium";
        	  str[1][1]="LoadRunner";

        	  //System.out.println(str[1][1]);
        	  
        	  
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