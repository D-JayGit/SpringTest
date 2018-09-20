package model;

public class Triangle implements Shape {
	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Triangle() {

	}

	public Triangle(Point pointA) {
		this.pointA = pointA;
	}

	public Triangle(Point pointA, model.Point pointB) {
		this.pointA = pointA;
		this.pointB = pointB;
	}

	public Triangle(model.Point pointA, model.Point pointB, model.Point pointC) {
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}

	public model.Point getPointA() {
		return pointA;
	}

	public void setPointA(model.Point pointA) {
		this.pointA = pointA;
	}

	public model.Point getPointB() {
		return pointB;
	}

	public void setPointB(model.Point pointB) {
		this.pointB = pointB;
	}

	public model.Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	@Override public void draw() {
		System.out.println("Drawing triangle at points" + pointA + pointB + pointC);
	}
}
