package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class Line {
	private Double lengthOfLine;
	private Point point1, point2;
	Scanner s = new Scanner(System.in);

	Line(String name) {

		addPoints();
		this.lengthOfLine=calculateLengthOfLine(point1, point2);

	}

	public void addPoints() {

		System.out.println("Enter value of Start x and y");
		Double xCoordinate = s.nextDouble();
		Double yCoordinate = s.nextDouble();
		point1 = new Point(xCoordinate, yCoordinate);
		System.out.println("Enter value of  x and y");
		xCoordinate = s.nextDouble();
		yCoordinate = s.nextDouble();
		point2 = new Point(xCoordinate, yCoordinate);
	}

	public double calculateLengthOfLine(Point startPoint, Point endPoint) {
		Double lengthOfLine = Math.sqrt(Math.pow(endPoint.getxCoordinate() - startPoint.getxCoordinate(), 2)
				+ Math.pow(endPoint.getyCoordinate() - startPoint.getyCoordinate(), 2));
		return lengthOfLine;

	}

	public Double getLengthOfLine() {
		return lengthOfLine;
	}

	public void setLegthOfLine(Double lenthOfLine) {
		this.lengthOfLine = lengthOfLine;
	}
}
