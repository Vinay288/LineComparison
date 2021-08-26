package com.bridgelabz.linecomparison;

public class LineComparisonImpl implements LineComparisonIf {
	
	@Override
	public void equalityOfLines(Line line1,Line line2) {
		
		if ((line1.getLengthOfLine()).equals(line2.getLengthOfLine())) {
			System.out.println("given lines are equal");
			return;
		}
		System.out.println("given lines are not equal");	
	}

	@Override
	public void compareLengthOfLines(Line line1,Line line2) {
		int compare = line1.getLengthOfLine().compareTo(line2.getLengthOfLine());
		if (compare > 0)
			System.out.println("line1 is greater then line2");
		else if (compare < 0)
			System.out.println("line 2 is greater then line 1");
		else
			System.out.println("both lines are equal");
		
	}


}
