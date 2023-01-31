package com.basics;

import com.murali.Basics;

public class BasicsProgram extends Basics {

	   public static  void add() {
		   int a=10;
		   int b=30;
		   int c=a+b;
		   System.out.println(c);
	   }
	   
	   public  static void sub() {
		   int x=30;
		   int y=50;
		   int z=x-y;
		   System.out.println(z);
	   }
	   
	   public  static void mul() {
		   
		   
		   int c=40;
		   int d=70;
		   int e=c*d;
		   System.out.println(e);
	   }
	   public  static void div() {
		   
		    int j=30;
		    int k=40;
		    int l=j/k;
		    System.out.println(l);
	   }  
	   public static void main(String[] args) {
		
		add();
		mul();
		sub();
		div();
		   

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
