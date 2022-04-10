package lights;
//import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class testRunningHolidaylights {
	@Test public void gettingLength() {
		int testLength = 10;
		RunningHolidayLights hl = new RunningHolidayLights(testLength);
		Assert.assertEquals(testLength, hl.getLength());
	}
	@Test public void testingNext() {
		RunningHolidayLights hl = new RunningHolidayLights(15);
		hl.next();
		
		for(int i=0;i<100;i++) {
			int hlCt= hl.getCounter();
			boolean bhl,bhlclone;
			bhl=hl.getLightIsOn(hlCt-1);
			if(hlCt<2) {int temp=hlCt+hl.getLength();
			bhlclone=hl.getLightIsOn(temp-2);}
			else bhlclone = hl.getLightIsOn(hlCt-2);
			Assert.assertTrue(bhl);
			Assert.assertFalse(bhlclone);
			hl.next();
		}
	}
	@Test public void counterChecker() {
		boolean result=true;
		int temp1=0,temp2;
		RunningHolidayLights hl = new RunningHolidayLights(15);
		for(int i=0;i<100;i++) {
			hl.next();
			temp2=hl.getCounter();
			if(temp2==temp1 || temp2>hl.getLength()) result =false;
			Assert.assertTrue(result);
			temp1=temp2;
		}
	}
}
