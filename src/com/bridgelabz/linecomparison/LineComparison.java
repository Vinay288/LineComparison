package com.bridgelabz.linecomparison;

public class LineComparison {

	public static void main(String[] args) {
		System.out.println("********welcome to line comparison computation*********");
		Line line1 = new Line(2, 3, 4, 5);
		Line line2 = new Line(4, 6, 7, 8);
		System.out.println("Length of line1 is " + line1.length);
		System.out.println("Length of line2 is " + line2.length);
		line1.equalityOfLines(line2);
		line2.equalityOfLines(line1);
	}

}
