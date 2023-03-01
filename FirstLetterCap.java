package com.jsp.Stringpack;

public class FirstLetterCap {

	public static void main(String[] args) {
		String s="my name ganesh yelamakuri";
//		String s1=s.toLowerCase();
		String[] ar =s.split(" ");    // space is required 
//		System.out.println(s);
		String temp="";
		for(int i=0;i<ar.length;i++) 
		{
			temp+=ar[i].substring(0,1).toUpperCase() + ar[i].substring(1).toLowerCase()+ " ";
					
	     }
	   System.out.println(temp.trim());
		
	}

}
