package com.bridgelabz.linecomparison;

public class Line {
	Float x1, x2, y1, y2, length;
	private String name = "line";

	Line(float x1, float x2, float y1, float y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		length = lengthOfLine();
	}

	Line(float x1, float x2, float y1, float y2, String name) {
		this(x1, x2, y1, y2);
		this.name = name;
	}

	public float lengthOfLine() {
		return (float) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}

	public void equalityOfLines(Line line) {
		if (this.length.equals(line.length)) {
			System.out.println("given lines are equal");
			return;
		}
		System.out.println("given lines are not equal");
	}

	public void comapreLengthOfLines(Line line) {
		int compare = this.length.compareTo(line.length);
		if (compare > 0)
			System.out.println(this.name + " is greater then " + line.name);
		else if (compare < 0)
			System.out.println(line.name + " is greater then " + this.name);
		else
			System.out.println("both lines are equal");
	}

}
