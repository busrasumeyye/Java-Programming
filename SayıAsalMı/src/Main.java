
public class Main {

	public static void main(String[] args) {
		
		int number = 25;
		int count = 0;
		for(int i=1 ; i<25;i++) {
			if(number%i==0)
			{
				count++;
			}
		}
		
		if(number<1) {
			System.out.println("Geçersiz Sayı");
		}
		if(count != 0 || number==1) {
			System.out.println("Sayı asal değildir");
		}
		else {
			System.out.println("Sayı asaldır");
		}
		

	}

}
