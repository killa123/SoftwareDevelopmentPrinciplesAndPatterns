package com.lianlianDesign.SRP;

public class DrawRectangle{

public static void draw(int width,int height){
	for(int i = 0 ; i < height; i ++){
		for(int j = 0 ; j < width ; j++){
			System.out.print("-");
		}
		System.out.print("\n");
	}
}
}