package studio1;

import support.cse131.ArgsProcessor;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int x = ap.nextInt("Value for x?");
		int y = ap.nextInt("Value for y?");
		int z = ap.nextInt("Value for z?");
		boolean isOrdered = (x<y && y<z )||(x>y && y>z);
		System.out.println(isOrdered);


	}

}

	//Define a boolean variable isOrdered whose value is true if the three values are either in
// strictly ascending order (x < y < z) or in strictly descending order (x > y > z),
// and false otherwise. Print out the variable isOrdered using System.out.println(isOrdered).

