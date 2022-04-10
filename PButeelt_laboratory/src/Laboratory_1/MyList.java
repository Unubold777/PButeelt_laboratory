package Laboratory_1;

public class MyList {
	protected Object[] mass;
	protected int size=0;
	public MyList(int cap) {
		if(cap > 0) {
			mass = new Object[cap];
		}
		else System.out.println("capacity must be higher than zero");
	}
	void checkIndex(int index)
	   {
	      if (index < 0 || index > size) 
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
	public boolean isFull() {
		return size == mass.length;
	}
	public Object[] changeArrayLength() {
		int temp = mass.length * 2;
		Object[] bigA = new Object[temp];
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
	public Object get(int index)
	{
		checkIndex(index);
		return mass[index];
	}
	public void set(int index,Object elemento) {
		checkIndex(index);
		mass[index]=elemento;
	}
	public void inserto(Object smth) {
		if(isFull()) mass = changeArrayLength();
		mass[size] = smth;
		size++;
	}
	/*public void insertAfter(Node prev_node, int new_data)
	{
		if (prev_node == null)
	    {
	        System.out.println("The given previous node cannot be null");
	        return;
	    }
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}*/
	}


