package p1005;

import java.util.Arrays;
import java.util.Scanner;

public class J1005_04 {

	public static void main(String[] args) {
		// 숫자 3개를 입력받아, 낮은 숫자로 출력하시오.
		// 22 19 5     15 48 7     5 78 5
		// 5 19 22     7  15 48    5  5 78
		
		// 최대값, 최소값
		Scanner scan = new Scanner(System.in);
		int[] num = new int[10]; //3개의 int num 생성
		
		for(int i=0;i<10;i++) {
			System.out.println(i+1+"번째 숫자를 입력해주세요.");
			num[i] = scan.nextInt();
		}
		
		Arrays.sort(num);
		
		for(int i=0;i<10;i++) {
			System.out.print(num[i]+" ");
		}
		
		
//		int max=0;
//		int min=0;
//		int mid=0;
//		min = Math.min(Math.min(in1, in2), in3);
//		mid =(in1+in2+in3)-(max+min);
//		max = Math.max(Math.max(in1, in2),in3);
		
		// if max
//		if(in1>in2) {
//			if(in1>in3) {
//				max=in1;
//			}else {
//				max=in3;
//			}
//		}else {
//			if(in2>in3) {
//				max=in2;
//			}else {
//				max=in3;
//			}
//		}
		

	}

}
