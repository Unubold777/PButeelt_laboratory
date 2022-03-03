package Laboratory_1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyList pck = new MyList(7);
		Scanner sc = new Scanner(System.in);
		int i;
		String tempo;
		pck.inserto((Object) "Random");
		pck.inserto((Object) "Things");
		pck.inserto((Object) "123456");
		pck.inserto((Object) "Never");
		pck.inserto((Object) "goNNA");
		
		do {
			System.out.println("1 бол элемент оруулах");
			System.out.println("2 бол элементийн утга солих");
			//System.out.println("3 бол оруулсан индекс дэх утгыг хэвлэх");
			System.out.println("3 бол жагсаалтыг хэвлэх");
			System.out.println("4 бол элементийг устгах");
			System.out.println("0 бол зогсоох");
			System.out.println("");
			i=sc.nextInt();
			switch(i) {
			case 1:
				tempo =sc.next();
				pck.inserto((Object)tempo);
				System.out.println("Added!");
				break;
			case 2:
				tempo = sc.next();
				int ind = sc.nextInt();
				pck.set(ind, tempo);
				System.out.println("Element value changed");
				break;
			case 3:
				System.out.println(pck.toString());
				break;
			case 4:
				int del = sc.nextInt();
				del--;
				pck.remove(del);
				System.out.println("Deleted");
				break;
			}
			}
		while(i!=0);
	}

}
