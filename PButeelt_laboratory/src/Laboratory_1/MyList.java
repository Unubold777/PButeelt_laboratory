package Laboratory_1;

public class MyList {
	protected Object[] mass;
	protected int size;
	
	public MyList(int cap) {
		if(cap > 0) {
			mass = new Object[cap];
		}
		else System.out.println("capacity must be higher than zero");
	}
	
}
