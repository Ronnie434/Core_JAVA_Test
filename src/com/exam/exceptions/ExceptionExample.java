package com.exam.exceptions;
import java.util.Scanner;

public class ExceptionExample {
	public static void get_number_from_keyboard() throws NumberTooSmallException, ZeroNumberException, NumberTooLargeException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int input = sc.nextInt();
		if(input<0) {
			throw new NumberTooSmallException("Number is too small");
		}
		else if(input>1000) {
			throw new NumberTooLargeException("Number is too Large");
		}
		else {
			throw new ZeroNumberException("Number is Zero");
		}
	}

	public static void main(String[] args) throws NumberTooSmallException, NumberTooLargeException, ZeroNumberException {
		get_number_from_keyboard();
	}

}
