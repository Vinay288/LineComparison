package com.bridgelabz.linecomparison;

public class Line {
	private Double lengthOfLine;
	String name;

	Line(String name) {
		System.out.println(name);
		Point point1 = new Point("start");
		Point point2 = new Point("end");
		lengthOfLine = point1.getLengthOfLine(point2);
	}

	public Double getLengthOfLine() {
		return lengthOfLine;
	}
}
