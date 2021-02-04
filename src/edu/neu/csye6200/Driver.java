package edu.neu.csye6200;

import java.util.*;

public class Driver {
	public static void printName(String fn, String mn, String ln) {
		System.out.println(fn + " " + mn + ln);
	}

	/*
	 * Type 1
	 * This function prints your full name.
	 * @param fn = firstName
	 * @param ln = lastName
	 * @m optional parameter HashMap because you can accept multiple paramaters
	 */
	public static void printFullName1(
			String fn, String ln, String...m) {
		String mn = "";
		if (m.length > 0) {
			mn = (String)m[0] + " ";
		}
		printName(fn, mn, ln);
	}
		
	/*
	 * Type 2
	 * This function prints your full name.
	 * @param fn = firstName
	 * @param ln = lastName
	 * @m optional parameter HashMap because you can accept multiple paramaters
	 */
	public static void printFullName2(
			String fn, String ln, HashMap<String, String>... m) {
		
		String mn = "";
		if (m.length > 0) {
			if (m[0].containsKey("middleName")) {
				mn = (String)(m[0].get("middleName")) + " ";
			}
		}
		printName(fn, mn, ln);
	}

	public static void main(String[] args) {
		
		printFullName1("Ginny", "Molly", "Weasley");
		
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("middleName", "Marvolo");

		printFullName2("Tom", "Riddle", m);
		
		printFullName1("Remus", "Lupin");
		printFullName2("Neville", "Longbottom");
	}
}

