package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 220;
		int sayi2 = 284;
		int count1=0,count2= 0;
		for(int i=1 ;i<sayi1 ;i++) {
			if(sayi1 % i ==0) {
				count1=count1+i;
			}
		}
		for(int i=1 ;i<sayi2 ;i++) {
			if(sayi2 % i ==0) {
				count2=count2+i;
			}
		}
		if(count2==sayi1 && count1==sayi2) {
			System.out.println("Bu sayılar arkadaş sayıdır");
		}
		else {
			System.out.println("Bu sayılar arkadaş sayı değildir");
		}

	}

}
