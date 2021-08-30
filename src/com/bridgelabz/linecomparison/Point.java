package com.bridgelabz.linecomparison;

public class Point {
	private  Float xCoordinate;
	private  Float yCoordinate;
	

	Point(Float xCoordinate,Float yCoordinate) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}

	public double getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(Float xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public double getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(Float yCoordinate) {
		this.yCoordinate = yCoordinate;
	}	

}
