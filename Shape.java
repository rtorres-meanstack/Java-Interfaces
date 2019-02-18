package com.Lesson8.Interfaces;

public interface Shape {
	float area();
	
	public static void main(String[] args) {
		float squareLength = 3f;
		Square sq = new Square(squareLength);
		
		float area = sq.area();
		System.out.println(area);
		
		float circleRadius = 4f;
		Circle cir = new Circle(circleRadius);
		
		float circleArea = cir.area();
		System.out.println(circleArea);
	}
	
	public class Square {
		float length;
		
		// overloaded constructor
		public Square(float length) {
			this.length = length;
		}
		
		// interface method
		public float area() {
			// area = length * length
			return length * length;
		}
	}
	
	public class Circle implements Shape {
		float radius;
		
		// overloaded constructor
		public Circle(float radius) {
			this.radius = radius;
		}
		
		// interface method
		public float area() {
			return 3.14f * radius * radius;
		}
	}
}

