package com.lianlianDesign.LSP;

import com.lianlianDesign.LSP.Point;

public abstract class Line {
	private Point p1;
	public Point getP1() {
		return p1;
	}
	public void setP1(Point p1) {
		this.p1 = p1;
	}
	public Point getP2() {
		return p2;
	}
	public void setP2(Point p2) {
		this.p2 = p2;
	}
	private Point p2;
	
	public boolean isOn(Point point){
		return true;
	}
}
