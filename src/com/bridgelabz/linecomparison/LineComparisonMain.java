package com.bridgelabz.linecomparison;

public class LineComparisonMain {

	public static void main(String[] args) {
		Line line1=new Line("line1");
		Line line2=new Line("line2");
		LineComparisonImpl lineCompute=new LineComparisonImpl();
		lineCompute.equalityOfLines(line1, line2);
		lineCompute.compareLengthOfLines(line1, line2);

	}

}
