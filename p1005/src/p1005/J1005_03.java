package p1005;

import java.util.Scanner;

public class J1005_03 {

	public static void main(String[] args) {
		// 1. 2~9단에서 5를 입력받으면 5~9단 출력될수 있도록 해보세요.
		Scanner scan = new Scanner(System.in);
		System.out.println("구구단 시작번호를 입력하세요.");
		int start = scan.nextInt();
		System.out.println("구구단 끝번호를 입력하세요.");
		int end = scan.nextInt();
		
		// if
//		if(start>end) {
//			int temp = start;
//			start = end;
//			end = temp;
//		}
		
		// 3항식
//		int temp = (start>end)?end:start;  // 작은값 비교
//		int temp2 = (start>end)?start:end; // 큰값 비교
		
		// 메소드 사용
		int temp = Math.min(start, end);
		int temp2 = Math.max(start, end);
		
		
		for(int i=temp;i<=temp2;i++) {
			System.out.printf("[ %d 단 ]\n",i);
			for(int j=1;j<=9;j++) {
				System.out.printf("%d * %d = %d \n",i,j,i*j);
			}
			System.out.println("---------");
		}

	}

}
