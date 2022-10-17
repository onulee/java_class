package p1013;

import java.util.Scanner;

public class J1013_02 {

	public static void main(String[] args) {
		// 숫자 5개를 입력받아, 
		// 입력한 5개 숫자,합계,평균을 출력하시오.
		// 입력한 숫자 : 1,2,3,4,5
		// 1. 배열 5개 선언
		// 2. 배열 값을 넣는다.
		// 3. 배열 값을 출력한다.
		Scanner scan = new Scanner(System.in);
		int sum=0;
		double avg=0;
		int[] num = new int[5];
		for(int i =0;i<5;i++) {
			System.out.println("숫자를 입력하세요.");
			num[i] = scan.nextInt();
			sum = sum + num[i];
		}
		
		avg = (double)sum/num.length;
		System.out.print("당신이 입력한 숫자 : ");
		for(int i =0;i<5;i++) {
			System.out.print(num[i]+",");
		}
		System.out.println();
		System.out.println("합계 : "+sum);
		
		

	}

}
