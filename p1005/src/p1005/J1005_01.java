package p1005;

import java.util.Scanner;

public class J1005_01 {

	public static void main(String[] args) {
		
		for(int i=2;i<=9;i++) {
			System.out.printf("[ %d 단 ]\n",i);
			for(int j=1;j<=9;j++) {
				System.out.printf("%d * %d = %d \n",i,j,i*j);
			}
			System.out.println("---------");
		}
		
		
		
		
		
//		int sum=0;
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		int input = scan.nextInt();
//		int i=0;
//		for(i=1;i<=input;i++) {
//			sum = sum + i;
//		}
//		
//		System.out.printf("1-%d까지의 합: %d\n",i-1,sum);
		
		
		//for문 1~100까지 합, 순번:1,합계:1  순번:2,합계:3  3,6..
//		int sum=0;
//		for(int i=1;i<=100;i++) {
//			sum = sum + i;
//			System.out.printf("순번:%d,합계:%d\n",i,sum);
//		}
		
		 

	}

}
