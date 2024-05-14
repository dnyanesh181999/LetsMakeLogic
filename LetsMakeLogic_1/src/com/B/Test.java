package com.B;

public class Test {
	
	public static void main(String[] args) {
		
		String s="A repository contains all of your project's files, revision history, and collaborator discussion";
		
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
