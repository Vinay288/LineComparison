package com.bridgelabz.linecomparison;

public class LineComparisonMain {

	public static void main(String[] args) {
		LineComparisonImpl lineComparison= new LineComparisonImpl();
		Line line1 = new Line();
		Line line2 = new Line();
		line1.addPoints(4.5f, 5.2f, 2.2f, 6f);
		line2.addPoints(4.2f, 5.6f, 3.2f, 7.3f);
		lineComparison.comapreLengthOfLines(line1, line2);
		lineComparison.equalityOfLines(line1, line2);
	}

}
