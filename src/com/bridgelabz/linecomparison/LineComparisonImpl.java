package com.bridgelabz.linecomparison;

public class LineComparisonImpl implements LineComparisonIf {
	
	
	 LineComparisonImpl() {
		
		Line line1 = new Line("line1");
		Line line2 = new Line("line2");
		equalityOfLines(line1, line2);
		compareLengthOfLines(line1, line2);
	}
	 
	@Override
	public void equalityOfLines(Line line1,Line line2) {
		System.out.println(line1.getLengthOfLine());
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
