package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'A';
		 if(harf=='A' || harf=='a' || harf=='I' || harf=='O'|| harf=='U') {
			 System.out.println("Harf kalın seslidir");
		 }
		 else if(harf=='e' || harf=='i' || harf=='ö' || harf=='ü') {
			 System.out.println("Harf ince seslidir");
		 }
		 else {
			 System.out.println("Harf sesli harf değildir");
		 }

	}

}
