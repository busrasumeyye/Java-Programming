package mükemmelSayilar;

public class Main {

	public static void main(String[] args) {
		int number = 28;
		int total = 1;
		for(int i=2;i<number;i++) {
			if(number % i == 0) {
				total=total + i;
			}
		}
		if(total==number) {
			System.out.println(number + " sayısı mükemmel sayıdır");
		}
		else {
			System.out.println("Mükemmel sayı değildir");
		}
		
	}

}
