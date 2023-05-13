package com.mf.adapter;

public class ShapeAdapter implements Shape {
	private Triangle triangle;

	public ShapeAdapter(Triangle triangle) {
		this.triangle = triangle;
	}

	public void draw() {
		triangle.drawTriangle();
	}
}