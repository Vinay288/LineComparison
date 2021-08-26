package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class Point {

	private double xCoordinate;
	private double yCoordinate;
	String name;
	static Scanner s = new Scanner(System.in);

	Point(String name) {
		this.name =name;
		System.out.println("Enter value of "+name+" x and y");
		double xCoordinate = s.nextDouble();
		double yCoordinate = s.nextDouble();

		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}

	public double getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public double getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

	public double getLengthOfLine(Point endPoint) {
		double lengthOfLine = Math.sqrt(Math.pow(endPoint.getxCoordinate() - this.getxCoordinate(), 2)
				+ Math.pow(endPoint.getyCoordinate() - this.getyCoordinate(), 2));
		return lengthOfLine;

	}

}
