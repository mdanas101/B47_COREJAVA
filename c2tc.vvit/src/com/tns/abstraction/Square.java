package com.tns.abstraction;

public class Square extends Shape {
	float side;
	public Square() {
		side=2.0f;
	}
	public Square(float side) {
		this.side=side;
	}
	@Override
	void calArea() {
		// TODO Auto-generated method stub
		area=side*side;
		
	}

}