package com.murali;

import com.basics.BasicsPrograms;

public class Basics extends BasicsPrograms {
	

	   public static  void add() {
		   int a=200;
		   int b=300;
		   int c=a+b;
		   System.out.println(c);
	   }
	   
	   public  static void sub() {
		   int x=40;
		   int y=5;
		   int z=x-y;
		   System.out.println(z);
	   }
	   
	   public  static void mul() {
		   
		   
		   int c=4;
		   int d=7;
		   int e=c*d;
		   System.out.println(e);
	   }
	   public  static void div() {
		   
		   int j=9;
		   int k=8;
		   int l=j/k;
		   System.out.println(l);
	   }
	   public static void main(String[] args) {
		
		   Basics obj=new Basics();
		   
		   obj.add();
		   obj.mul();
		   obj.sub();
		   obj.div();
		 
		      add();
			  mul();
			  sub();
			  div();
		   
		   
		   
		   
		   
	   }
       }
	

