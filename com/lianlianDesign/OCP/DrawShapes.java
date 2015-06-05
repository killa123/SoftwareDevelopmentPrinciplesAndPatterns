package com.lianlianDesign.OCP;

import com.lianlianDesign.OCP.Shape;
import java.util.List;
import java.util.ArrayList;

public class DrawShapes{
	List<Shape> shapes;

	public void drawShapes(){
		sortShape();
		for(int i = 0 ; i < shapes.size() ;i++){
			Shape shape = shapes.get(i);
			shape.draw();
		}
	}


	public void sortShape(){
		ArrayList<Shape> tempShapes = new ArrayList<Shape>();
		for(int i = 0 ; i < shapes.size() ;i++){
			Shape tempShape = shapes.get(i);
			if(tempShape.type == 1)
				tempShapes.add(tempShape);
		}
		for(int i = 0 ; i < shapes.size() ;i++){
			Shape tempShape = shapes.get(i);
			if(tempShape.type == 2)
				tempShapes.add(tempShape);
		}
		shapes = tempShapes;
	}

}
