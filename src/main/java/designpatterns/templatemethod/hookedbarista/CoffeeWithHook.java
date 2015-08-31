package designpatterns.templatemethod.hookedbarista;

import java.io.*;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

	public void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}

	/**
	 * Override the default behavior of the template hook method in the base
	 * class.
	 */
	public boolean customerWantsCondiments() {

		String answer = getUserInput();

		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}

	private String getUserInput() {
		String answer = null;

		System.out.print("Would you like milk and sugar with your coffee (y/n)? ");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException ioe) {
			System.err.println("IO error trying to read your answer");
		}
		if (answer == null) {
			return "no";
		}
		return answer;
	}
	
}