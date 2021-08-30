package com.bridgelabz.linecomparison;

public class Line implements LineIf{
	private Float length;
	private Point point1,point2;
	
	public void addPoints(Float startX,Float startY,Float endX,Float endY) {
		Point point1=new Point(startX,startY);
		Point point2=new Point(endX,endY);
		setLength(point1,point2);
	}
	public float lengthOfLine(Point point1,Point point2) {
		return (float) Math.sqrt(Math.pow((point1.getxCoordinate() - point2.getxCoordinate()), 2) + Math.pow((point2.getyCoordinate() - point1.getyCoordinate()), 2));
	}
	public void setLength(Point point1,Point point2) {
		this.length=lengthOfLine(point1,point2);
	}
	public Float getLength() {
		return length;
	}	
}
