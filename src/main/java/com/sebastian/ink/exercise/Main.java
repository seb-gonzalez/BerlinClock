package com.sebastian.ink.exercise;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String lines = "";
		String result = "";
		
		Scanner keyboard = new Scanner(System.in);
		
		for(int i=0; i<6; i++) lines+= keyboard.nextLine()+"\n";
		
		BerlinClock clock = new BerlinClock();
		result = clock.getTime(lines);
		
		System.out.println(result);
	}	
}
