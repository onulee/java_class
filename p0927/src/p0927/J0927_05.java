package p0927;

import java.util.Scanner;

public class J0927_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("달러를 입력하세요.");
		double input = scan.nextDouble();
		double result = input * 1427.98;
		System.out.printf("입력한 달러 : %.2f \n",input);
		System.out.printf("원화 환산 :%.2f \n",result);
		
		

	}

}
