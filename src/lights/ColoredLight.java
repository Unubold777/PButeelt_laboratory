package lights;
import java.util.Random;
import java.util.Random.*;
import java.awt.Color;

public class ColoredLight extends Light{
	
	/**
	 * Creates a new colored light.
	 * @param color - color of this light.
	 */
	protected /*static*/ Color color;
	//public static boolean isOn;
	public ColoredLight(Color col) {
		// TODO
		super();
		color = col;
		//throw new RuntimeException("ColoredLight(Color) not yet implemented!");
	}
	public ColoredLight(boolean is, Color cl) {
		super(is);
		color=cl;
	}
	
	/**
	 * Returns the color of this light.
	 * @return color of this light.
	 */
	public boolean isOn() {
		return super.isOn();
		//return isOn;
	}
	public Color getColor() {
		// TODO
		if(isOn==true) return color;
		throw new RuntimeException("ColoredLight.getColor() not yet implemented!");
	}
	
	/**
	 * Changes the color of this light to be c.
	 */
	public void setColor(Color c) {
		// TODO
		color=c;
		//throw new RuntimeException("ColoredLight.setColor() not yet implemented!");
	}
	
	/**
	 * Randomly changes this light to be on or off and its color.
	 */
	@Override
		public  void randomChange() {
		// TODO.
		int upperbound = 25;
		Random rand = new Random();
		int temp= rand.nextInt(upperbound);
		temp=temp%5;
		switch(temp) {
		case 0: setColor(Color.red); break;
		case 1: setColor(Color.green); break;
		case 2: setColor(Color.yellow); break;
		case 3: setColor(Color.blue); break;
		case 4: setColor(Color.cyan); break;
}
		// Take advantage of Light.randomChange
		//throw new RuntimeException("ColoredLight.randomChange() not yet implemented!");
	}
	
}