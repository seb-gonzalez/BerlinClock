package com.sebastian.ink.exercise;

import java.util.Random;

public class LineParser {
	
	public static int parseSeconds(String line) {
		int seconds = 0;
		
		if(line == "Y") { //EVEN NUMBER
			seconds = new Random().nextInt((60)/2) *2;
		} 
		else {
			seconds = 2*(int)(Math.random()*((60)/2+1))+1;
		}
			
			
		return seconds;
	}
	
	public static int parseHoursX5(String line) {
		int hours = 0;
		for(int i=0; i<line.length(); i++) {
			if(line.charAt(i) == 'R') hours += 5;
			else if(line.charAt(i) != '.') throw new RuntimeException("Wrong format, only dots allow!");
		}
		return hours;
	}

	public static int parseHoursX1(String line) {
		int hours = 0;
		for(int i=0; i<line.length(); i++) {
			if(line.charAt(i) == 'R') hours += 1;
			else if(line.charAt(i) != '.') throw new RuntimeException("Wrong format, only dots allow!");
		}
		return hours;
	}

	public static int parseMinutesX5(String line) {
		int minutes = 0;
		for(int i=0; i<line.length(); i++) {
			if(line.charAt(i) == 'Y' || line.charAt(i) == 'R') minutes += 5;
			else if(line.charAt(i) != '.') throw new RuntimeException("Wrong format, only dots allow!");
		}
		return minutes;
	}

	public static int parseMinutesX4(String line) {
		int minutes = 0;
		for(int i=0; i<line.length(); i++) {
			if(line.charAt(i) == 'Y' || line.charAt(i) == 'R') minutes += 1;
			else if(line.charAt(i) != '.') throw new RuntimeException("Wrong format, only dots allow!");
		}
		return minutes;
	}
}
