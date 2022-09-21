package intro;

public class Döngüler2 {

	public static void main(String[] args) {
		int i=1;
		while(i<20) {
			System.out.println(i);
			i+=3;
		}
		System.out.println("While döngüsü bitti");
        //do-while
		int j=1;
		do {
			System.out.println(j);
			j+=4;
		}while(j<20); 
		System.out.println("do-while döngüsü bitti");
	}

}
