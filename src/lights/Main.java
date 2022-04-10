package lights;

public class Main {
	
	public static void main(String[]  args) {

		// Create HolidayLights
		HolidayLights hl = new RunningHolidayLights(12);
		MyHolidayWindow labo3 = new MyHolidayWindow(15);
		// Create and show HolidayLightsWindow
	//	HolidayLightsWindow frame = new HolidayLightsWindow(hl);
		HolidayLightsWindow frame = new HolidayLightsWindow(labo3);
		
		frame.pack();
		frame.setVisible(true);
	}
	
}