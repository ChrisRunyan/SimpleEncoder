package com.chris;

/**
 * Simple encoder that uses a modified version of a Ceasar Cipher.
 * 
 * @author Christopher Runyan
 *
 */
public class Protector {
	private static final char[] ASCII={'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '+', '~', '`', '1', '2', '3',
			'4', '5', '6', '7', '8', '9', '0', '-', '=', ' ', 'q', 'w', 'e', 'r', 't', 'y', 'u',
			'i', 'o', 'p', '{', '}', '[', ']', '|', '\\', 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I',
			'O', 'P', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', ':', ';', '"', '\'', 'A', 'S',
			'D', 'F', 'G', 'H', 'J', 'K', 'L', 'z', 'x', 'c', 'v', 'b', 'n', 'm', '<', '>', '?',
			',', '.', '/', 'Z', 'X', 'C', 'V', 'B', 'N', 'M'};
	
	public String encode(String input) {
		StringBuilder sb=new StringBuilder();
			
		for(int i=0; i<input.length(); i++) {
			for(int j=0; j<Protector.ASCII.length; j++) {
				if(input.charAt(i)==Protector.ASCII[j]) {
					if(input.charAt(i)=='B'){
						sb.append('!');
					}
					else if(input.charAt(i)=='N') {
						sb.append('@');
					}
					else if(input.charAt(i)=='M') {
						sb.append('#');
					}
					else {
						sb.append(Protector.ASCII[j+3]);
					}
				}
			}
		}
			
		return sb.toString();
	}
	
	public String decode(String input) {
		StringBuilder sb=new StringBuilder();
			
		for(int i=0; i<input.length(); i++) {
			for(int j=0; j<Protector.ASCII.length; j++) {
				if(input.charAt(i)==Protector.ASCII[j]) {
					if(input.charAt(i)=='!') {
						sb.append('B');
					}
					else if(input.charAt(i)=='@') {
						sb.append('N');
					}
					else if(input.charAt(i)=='#') {
						sb.append('M');
					}
					else {
						sb.append(Protector.ASCII[j-3]);
					}
				}
			}
		}
		
		return sb.toString();
	}
}
