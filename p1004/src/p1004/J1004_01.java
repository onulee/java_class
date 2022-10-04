package p1004;

import java.util.Scanner;

public class J1004_01 {

	public static void main(String[] args) {
//		int i=0;
//		
//		for(i=1;i<=10;i++){
//			
//			
//		}
//		System.out.println(i);

		int i = 0;
		int sum = 0;

		for (i = 1; i <= 10; i++) {
			sum = sum + i;
			if (sum > 20) {
				break;
			}

		}

		System.out.println("순번 : " + i);
		System.out.println("합계 : " + sum);

		// 1-100까지의 숫자와 합계를 출력하시오.
		// 합계 100 넘는 순간의 번호를 출력하시오.

		// 1+2+3+4+5 = 15

//		int sum=0;
//		for (int i=1;i<=100;i++) {
//			System.out.println(i);
//			sum = sum + i;
//		}
//		
//		System.out.println("합계 : "+ sum);

		// 1-100까지 중 3의 배수 또는 5의 배수를 찾는 프로그램을 구성하시오.
		// 3,5,6,9,10,12,15,18,20,21,24,25......

//		int i = 0;
//		int sum = 0;
//		
//		
//		
//		for(i=1;i<=100;i++) {
//			if((i%3)==0 && (i%5)==0) {  // || 2개중 1개, && 2개모두
//				System.out.println(i);
//				sum = sum + i;  //sum += i;
//			}
//		}
//		System.out.println("합계 : "+sum);

//		// 입력받은 소수 2자리에서 반올림 프로그램을 구성하시오.
//		// 3.19785 -> 3.2
//		// Math.floor, Math.ceil
//		Scanner scan = new Scanner(System.in);
//		System.out.println("실수를 입력하세요.");
//		double input = scan.nextDouble();
//		double result = Math.round(input*10)/10.0;
//		System.out.println("소수점 2자리 반올림 : "+result);

	}

}
