package Pont;

import interfce.Icolorable;

import java.awt.Color;

public class SzinesPont extends Pont implements Icolorable{
	private Color color;
	
	public SzinesPont(Color color){
		super(0,0);
		this.color = color;
	}
	
	public SzinesPont(int x, int y, Color color){
		super(x,y);
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "A szinespont adata: " + this.color;
	}

	@Override
	public Color getColor() {
		return this.color;
	}

	@Override
	public void setColor(Color ColorIn) {
		this.color = ColorIn;
	}
}
