package Laboratory_1;


public class GList<G>{
	protected G[] mass;
	protected int size=0;
	public GList(int cap) {
		if(cap > 0) {
			mass = (G[])new Object[cap];
		}
		else System.out.println("capacity must be higher than zero");
	}
	void checkIndex(int index)
	   {
	      if (index < 0 || index >= size)
	         throw new IndexOutOfBoundsException
	               ("index = " + index + "  size = " + size);
	   }
	public G remove(int index)
	   {
	      checkIndex(index);
	      G removed = mass[index];
	      for (int i = index + 1; i < size; i++)	mass[i-1] = mass[i];
	      mass[--size] = null;
	      return removed;
	   }
	public boolean isEmpty() {
		return size ==0; 
	}
	public boolean isFull() {
		return size == mass.length;
	}
	public G[] changeArrayLength() {
		int temp = mass.length * 2;
		G[] bigA = (G[])new Object[temp];
		for(int i=0;i<mass.length;i++) 	bigA[i]=mass[i];
		mass = bigA;
		return mass;
	}
	public String toString(){
		String s = "{";
	//	checkIndex(size);
		for(int i=0;i<size;i++) {
			if(mass[i]==null) s=s+"null";
			else s=s+mass[i];
			s=s+" ,";
		}
		s=s.substring(0,s.length() -2);
		s=s+'}';
		return s;
	}
	public G get(int index)
	{
		checkIndex(index);
		return mass[index];
	}
	public void set(int index,G elemento) {
		checkIndex(index);
		mass[index]=elemento;
	}
	public void inserto(G smth) {
		if(isFull()) mass = changeArrayLength();
		mass[size] = smth;
		size++;
	}
}
