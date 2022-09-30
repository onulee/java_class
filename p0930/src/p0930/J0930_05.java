package p0930;

import java.util.Scanner;

public class J0930_05 {

	public static void main(String[] args) {
		// 1부터 입력한 값까지 합을 구하는 프로그램을 구현하시오.
		// 5를 1~5까지 합을 구하는 프로그램을 만들어 보세요.
		// 1. 숫자 입력을 받음
		// 2. 합계를 구하는 for문을 생성함
		// 3. 합계를 출력함
		// 4. 입력한 값도 출력함.
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int start=0;
		int input=0,i=0,sum=0;
		start = scan.nextInt();
		input = scan.nextInt(); 
		
		
		// (i=1;i<=5;i++
		for(i=start;i<=input;i++) {
			sum = sum + i;
		}
		System.out.printf("%d부터 %d 까지의 합 \n",start,input);
		System.out.println("합계 : "+sum);
		
		
		// 입력을 2개 받아서 3,10 3부터 10까지 구하시오. 
		
		
		
		
		
		
		
		
		
//		int sum = 0;
//		int i=0;
//		for(i=1;i<=10;i++) {
//			sum = sum + i;
//		}
//		
//		System.out.printf("1부터 %d 까지의 합 \n",i-1);
//		System.out.println("합계 : "+sum);
		

	}

}
