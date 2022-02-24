package Laboratory_1;

public class MyList {
	protected Object[] mass;
	protected int size;
	
	//element = ChangeArrayLength.changeLength1D(element, 2 * size);
	public MyList(int cap) {
		if(cap > 0) {
			mass = new Object[cap];
		}
		else System.out.println("capacity must be higher than zero");
	}
	void checkIndex(int index)
	   {
	      if (index < 0 || index >= size)
	         throw new IndexOutOfBoundsException
	               ("index = " + index + "  size = " + size);
	   }
	public Object remove(int index)
	   {
	      checkIndex(index);
	      Object removed = mass[index];
	      for (int i = index + 1; i < size; i++)	mass[i-1] = mass[i];
	      mass[--size] = null;
	      return removed;
	   }
	public boolean isEmpty() {
		return size ==0; 
	}
	public String toString(){
		String s = "{";
		checkIndex(size);
		for(int i=0;i<size;i++) {
			if(mass[i]==null) s=s+"null";
			else s=s+mass[i];
			s=s+" ,";
		}
		s=s.substring(0,s.length() -2);
		s=s+'}';
		return s;
	}
	
	
	
	
}
