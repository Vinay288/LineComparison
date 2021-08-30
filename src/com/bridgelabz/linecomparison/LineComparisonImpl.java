package com.bridgelabz.linecomparison;

public class LineComparisonImpl implements LineComparisonIf {

	@Override
	public void equalityOfLines(Line line1, Line line2) {
		if (line1.getLength().equals(line2.getLength())) {
			System.out.println("given lines are equal");
			return;
		}
		System.out.println("given lines are not equal");
	}

	@Override
	public void comapreLengthOfLines(Line line1, Line line2) {
		int compare = line1.getLength().compareTo(line2.getLength());
		if (compare > 0)
			System.out.println("line1 is greater then line2");
		else if (compare < 0)
			System.out.println("line2 is greater then line2");
		else
			System.out.println("both lines are equal");
		
	}

}
