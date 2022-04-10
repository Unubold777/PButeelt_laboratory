package lights;

import java.awt.Color;

import org.junit.Assert;
import org.junit.Test;

public class colorLightTest {
	@Test public void makeOffLight() {
		ColoredLight light = new ColoredLight(false,Color.black);
		Assert.assertFalse(light.isOn());
	}
	@Test public void gettingColor() {
		ColoredLight light = new ColoredLight(false,Color.blue);
		light.setOn(true);
		Color cl = light.getColor();
		boolean ans= false;
		if(cl == Color.blue ) ans = true;
		Assert.assertTrue(ans);
	}
	@Test public void settingColor() {
		ColoredLight light = new ColoredLight(true,Color.red);
		light.setColor(Color.black);
		boolean colorGray = false;
		if(light.getColor() == Color.black) colorGray=true;
		Assert.assertTrue(colorGray);
	}
	@Test public void randomChangingColor() {
		ColoredLight light = new ColoredLight(Color.gray);
		light.setOn(true);
		for(int i = 0;i<100;i++) {
			light.randomChange();
			if(light.isOn()==true){
				Assert.assertTrue(light.isOn());
				Assert.assertNotEquals(light.getColor(), Color.gray);
			}
			else{	Assert.assertFalse(light.isOn());
			}
			/*Assert.assertTrue(light.isOn());
			Assert.assertNotEquals(light.getColor(), Color.blue);*/
			
		}
		
	}	

}
