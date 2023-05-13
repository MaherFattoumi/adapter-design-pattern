package com.mf.adapter;

public class Client {
	
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();
        Shape triangleAdapter = new ShapeAdapter(new Triangle());
        
        rectangle.draw();
        circle.draw();
        triangleAdapter.draw();
    }
}