/* 
 * All code from the book Design Patterns in Java Tutorial
 */

package com.pattern.factory;

public class FactoryShapeDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape1 = shapeFactory.getShape("circle");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("rectangle");
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("square");
		shape3.draw();
		
		Shape shape4 = shapeFactory.getShape("oval");
		shape4.draw();
	}

}
