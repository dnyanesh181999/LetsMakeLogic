package com.C;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number here");
	int number=sc.nextInt();
	if(number%2==0) {
		System.out.println("Even Number");
	}
	else {
		System.out.println("This Is Odd number");
	}
}
}
