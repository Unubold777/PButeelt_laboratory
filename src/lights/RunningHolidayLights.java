package lights;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
public class RunningHolidayLights implements HolidayLights {
	
	/**
	 * Creates new running holiday lights.
	 * @param length - length of this set of lights.
	 */
	ArrayList<Light> lights;
	protected int length;
	protected Light oneLight;
	protected int ct=0;
	public RunningHolidayLights(int length) {
		// TODO
		this.length=length;
		//throw new RuntimeException("RunningHolidayLights(length) not yet implemented!");
	}
	
	public List<Light> next() {
		// TODO
		/*ArrayList<Light>*/ lights = new ArrayList<Light>();
		for(int i=0;i<length;i++) {
			oneLight = new Light();
			lights.add(oneLight);
		}
		if(ct==length) ct=ct-length;
		lights.get(ct).setOn(true);
		ct++;
		return lights;
//		throw new RuntimeException("RunningHolidayLights.next() not yet implemented!");
	}
	public int getCounter() {
		return ct;
	}
	public boolean getLightIsOn(int i) {
		return lights.get(i).isOn();
	}
	/**
	 * Returns the length of this
	 * @return length of this
	 */
	public int getLength() {
		// TODO
		return length;
//		throw new RuntimeException("RunningHolidayLights.getLength() not yet implemented!");
	}
						
}