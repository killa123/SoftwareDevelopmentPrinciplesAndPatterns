package com.lianlianDesign.SRP;

public class Rectangle{

private int width;
private int height;

private int area(){
	return width * height;
}

private void draw(){
	for(int i = 0 ; i < height; i ++){
		for(int j = 0 ; j < width ; j++){
			System.out.print("*");
		}
		System.out.print("\n");
	}
}

public static void main(String[] args) {
	Rectangle rectangle = new Rectangle();
	if(args.length == 2){
		rectangle.width = Integer.parseInt(args[0]);
		rectangle.height = Integer.parseInt(args[1]);
		System.out.println("rectangle.area = " + rectangle.area());
		rectangle.draw();
	}
  }

}