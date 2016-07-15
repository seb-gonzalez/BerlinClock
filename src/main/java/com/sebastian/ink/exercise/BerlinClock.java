package com.sebastian.ink.exercise;

public class BerlinClock {

	public static String getTime(String commandLine) {
		String result = "";
		int hours = 0;
		int minutes = 0;
		
		if(!commandLine.isEmpty()) {
			if(commandLine.split("(\r|\n)").length != 6) {
				throw new RuntimeException("Wrong format, only 6 lines allow!");
			}
			else {
				String lines[] = commandLine.split("(\r|\n)");
				for(int i=0; i<lines.length; i++) {
					if(i == 1) hours += LineParser.parseHoursX5(lines[i]);
					if(i == 2) hours += LineParser.parseHoursX1(lines[i]);
					if(i == 4) minutes += LineParser.parseMinutesX5(lines[i]);
					if(i == 5) minutes += LineParser.parseMinutesX4(lines[i]);
				}
			}
		}
			
		return result;
	}

}
