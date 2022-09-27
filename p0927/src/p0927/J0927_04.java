package p0927;

public class J0927_04 {

	public static void main(String[] args) {
		int x=10;
		int result = -x + 3;
		System.out.println(result);
		
		int y=5;
		result = x + (3 * y);
		System.out.println(result);
		
		// 1달러 = 1426.16원
		// 100달러 원화 환산하시오.
		// 100만원 엔화 환산 (9.88원) 하시오.
		
		double d = 100*1426.16;
		System.out.printf("100달러 원화환산 : %.2f 원 \n",d);
		
		double j = 1000000/9.88;
		System.out.printf("100만원 엔화 환산 : %.2f 엔 ",j);
		
		

	}

}
