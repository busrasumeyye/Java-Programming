package intro;

public class ReCapDemo2 {

	public static void main(String[] args) {
		double[] myList= {1.2,1.3,4.3,5.6};
		double total=0;
		double max= myList[1];
		for(double list:myList) {
			if(max<list) {
				max=list;
			}
			total=total+list;
			System.out.println(list);
		}
		System.out.println("Toplam ="+total);
		System.out.println("En büyük sayı ="+max);

	}

}
