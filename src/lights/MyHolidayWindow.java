package lights;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.awt.Color;
public class MyHolidayWindow extends RunningHolidayLights {
	ColoredLight onelight;
	public MyHolidayWindow(int length) {
		super(length);
	}
	public List<Light> next() {
		// TODO
		/*ArrayList<Light>*/ lights = new ArrayList<Light>();
		for(int i=0;i<length;i++) {
			onelight = new ColoredLight(true,Color.gray);
			lights.add(onelight);
		}
		if(ct==length) ct=ct-length;
		Random rand = new Random();
		int magic = rand.nextInt(5);
		for(int i=0;i<magic;i++) {
			int temp=rand.nextInt(length);
			lights.get(temp).randomChange();
		}
		//lights.get(ct).randomChange();
		ct++;
		return lights;
//		throw new RuntimeException("RunningHolidayLights.next() not yet implemented!");
	}
}
