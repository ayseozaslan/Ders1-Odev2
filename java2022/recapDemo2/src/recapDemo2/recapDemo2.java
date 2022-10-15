package recapDemo2;

public class recapDemo2 {

	public static void main(String[] args) {
		double[] myList = { 1.2, 1.3, 4.3, 5.6 };

		for (double number : myList) {
										
			System.out.println(number);

		}

		System.out.println("****************");
		//SAYILARIN TOPLAMI

		double[] myList2 = { 1.2, 1.3, 4.3, 5.6 };
		double total = 0;
		for (double number1 : myList2) {
			total = total + number1;
			System.out.println(number1);

		}
		System.out.println("Toplam :" + total);
		
		System.out.println("**********");
		//EN BÜYÜK SAYIYI BULMA

		double[] myList3 = { 1.2, 1.3, 4.3, 6.3 };
		double max = myList3[0];
		for (double number2 : myList3) {
			if (max < number2)
				max = number2;

		}

		
		System.out.println("En büyük =" + max);

	}

}
