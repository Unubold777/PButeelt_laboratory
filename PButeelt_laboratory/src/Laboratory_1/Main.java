package Laboratory_1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GList<String> pck = new GList<String>(7);
		Scanner sc = new Scanner(System.in);
		int i;
		String tempo;
		pck.inserto("Random");
		pck.inserto( "Things");
		pck.inserto( "123456");
		pck.inserto( "Never");
		pck.inserto( "goNNA");
		
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
				System.out.println("Утгыг оруулна уу");
				tempo =sc.next();
				pck.inserto(tempo);
				System.out.println("Added!");
				break;
			case 2:
				System.out.println("индексийн дугаарыг оруулна уу");
				int ind = sc.nextInt();
				System.out.println("Солих утгыг оруулна уу");
				tempo = sc.next();
				pck.set(ind, tempo);
				System.out.println("Element value changed");
				break;
			case 3:
				System.out.println(pck.toString());
				break;
			case 4:
				System.out.println("Устгах элементийн дугаарыг оруулна уу");
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
