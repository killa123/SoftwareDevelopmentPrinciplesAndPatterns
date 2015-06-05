package com.lianlianDesign.SRP;

import com.lianlianDesign.SRP.DrawRectangle;

public class RectanglePure{

private int width;
private int height;

private int area(){
	return width * height;
}

public static void main(String[] args) {
	RectanglePure retangle = new RectanglePure();
	if(args.length == 2){
		retangle.width = Integer.parseInt(args[0]);
		retangle.height = Integer.parseInt(args[1]);
		System.out.println("retangle.area = " + retangle.area());
		DrawRectangle.draw(retangle.width,retangle.height);
	}
  }

}