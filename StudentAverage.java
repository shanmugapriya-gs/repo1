package com.day1;

public class StudentAverage {
	public static void main(String[]args) {
		String name = "SHANMU";
		int rollNumber = 1124;
		int tamilMark = 88;
		int englishMark = 79;
		int mathsMark = 92;
		int scienceMark = 85;
		int socialMark = 76;
		int totalMark = tamilMark+englishMark+mathsMark+scienceMark+socialMark;
		float average = totalMark/5;
		System.out.println("NAME="+name + " ROLL NUMBER="+ rollNumber + " Average="+ average + " Total Mark=" + totalMark);
			
		
		
	}

}
