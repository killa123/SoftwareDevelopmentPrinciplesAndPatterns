package com.lianlianDesign.OCP;

import com.lianlianDesign.OCP.Shape;

public class Triangle extends Shape{

private int height;

public void draw(){
	for (int i = 0; i < height; i++) {
		for (int j = 0; j < i + 1; j++) {
			System.out.print("*");
		}
		System.out.print("\n");
	}
}

public Triangle(){
	type = 2;
}

public static void main(String[] args) {
	Triangle triangle = new Triangle();
	triangle.height = 20;
	triangle.draw();
}

}
