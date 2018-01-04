package com.designpatterns.factory;

public class FactoryEx {

	// factory method for getting object of required class

	public Shape getShape(String shapeType) {

		if (shapeType.equals("SQUARE")) {
			return new Square();
		}

		else if (shapeType.equals("CIRCLE")) {
			return new Circle();
		}
		return null;
	}

	public static void main(String args[]) {

		FactoryEx factory = new FactoryEx();
		Shape s = factory.getShape("SQUARE");
		s.draw();

		factory.getShape("CIRCLE").draw();

	}

}
