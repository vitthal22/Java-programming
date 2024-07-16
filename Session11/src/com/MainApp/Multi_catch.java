package com.MainApp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multi_catch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("first line");

		int n1, n2;

		try {
			System.out.println("enter first number ");
			n1 = sc.nextInt();

			System.out.println("enter second number ");
			n2 = sc.nextInt();

			System.out.println("div: " + (n1 / n2));
			
			String s = "vitthal";
			System.out.println(s.toLowerCase());
			
			int arr[] = {10,20};
			System.out.println(arr[5]);
		} 
		catch (ArithmeticException e) {
			System.out.println("de must be non zero");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch (InputMismatchException e) {
			System.out.println("number must be in digit format");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("error");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		System.out.println("last line");
	}

}
//we use multi catch is use to display coustom error messege.