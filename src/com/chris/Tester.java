package com.chris;

public class Tester {
	public static void main(String[] args) {
		Protector driver=new Protector();
		
		System.out.println("Input: 'A'");
		System.out.println("Expected Output: 'F'");
		System.out.println("Actual Output: "+driver.encode("A")+"\n");
		
		System.out.println("Input: 'Chris':");
		System.out.println("Expected Output: 'Nlu{g'");
		System.out.println("Actual Output: "+driver.encode("Chris")+"\n");
		
		System.out.println("Input: 'F'");
		System.out.println("Expected Output: 'A'");
		System.out.println("Actual Output: "+driver.decode("F")+"\n");
		
		System.out.println("Input: 'Nlu{g'");
		System.out.println("Expected Output: 'Chris'");
		System.out.println("Actual Output: "+driver.decode("Nlu{g")+"\n");
		
		System.out.println("Input: 'Application Data File - DO NOT DELETE'");
		System.out.println("Expected Output: 'F[[\"{nfi{}>eHfifeJ{\"yeqeHse@sIeHYcYIY'");
		System.out.println("Actual Output: "+driver.encode("Application Data File - DO NOT DELETE")+"\n");
	}
}
