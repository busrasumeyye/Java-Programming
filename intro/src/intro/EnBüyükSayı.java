package intro;

public class EnBüyükSayı {
	public static void main(String[] args) {
		int sayi1=20,sayi2,sayi3;
		sayi2=25;
		sayi3=2;
		if(sayi1>sayi2 && sayi1>sayi3) {
			System.out.println("En büyük sayı:"+sayi1);
		}else if(sayi2>sayi3 && sayi2>sayi1) {
			System.out.println("En büyük sayı:"+sayi2);
		}else {
			System.out.println("En büyük sayı:"+sayi3);
		}
	}
}
