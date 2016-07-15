package com.sebastian.ink.exercise;

public class BerlinClock {

	public static String getTime(String commandLine) {
		String result = "";
		
		if(!commandLine.isEmpty()) {
			if(commandLine.split("(\r|\n)").length != 6) {
				throw new RuntimeException("Wrong format, only 6 lines allow!");
			}
		}
			
		return result;
	}

}
