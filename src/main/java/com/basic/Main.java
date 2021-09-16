package com.basic;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = in.nextLine();
		System.out.println("\nHello Mr. " + name);
	}
}
