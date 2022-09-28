package p0928;

import java.util.Scanner;

public class J0928_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int x = scan.nextInt();
		String str = (x >= 90)?"수":(x >= 80)?"우":"미";
		System.out.println(str);
//		System.out.println("숫자를 입력하세요.");
//		// 홀수면 홀수입니다. 짝수면 짝수입니다. 출력해보세요.
//		int x = scan.nextInt();
//		String str = (x%2 == 0)?"짝수입니다.":"홀수입니다.";
//		System.out.println(str);
		
//		int x = scan.nextInt();
//		int absX = (x >= 0)?x:-x;
//		System.out.println(absX);
		

	}

}
