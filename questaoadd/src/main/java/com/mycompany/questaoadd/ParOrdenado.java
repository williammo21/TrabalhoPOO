package com.mycompany.questaoadd;
public class ParOrdenado{

    private double x;
            private double y ;
	public ParOrdenado(double x, double y) {
		
		x = x;
		y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		y = y;
	}
	@Override
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
	


    
}