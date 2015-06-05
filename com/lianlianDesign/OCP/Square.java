package com.lianlianDesign.OCP;

import com.lianlianDesign.OCP.Shape;

public class Square extends Shape{

public int height;

public void draw(){
	for (int i = 0; i < height; i++) {
		for (int j = 0; j < height; j++) {
			System.out.print("*");
		}
		System.out.print("\n");
	}
}

public Square(){
	type = 1;
}

public static void main(String[] args) {
	Square square = new Square();
	square.height = 5;
	square.draw();
}

}
