package p1006;

import java.util.Scanner;

public class J1006_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = "a";
		do {
			System.out.println("문장을 입력하면 출력하는 프로그램입니다.");
			System.out.println("프로그램을 종료하려면 x를 입력하세요.");
			str = scan.next();
			System.out.println("입력한 문자 : " + str);
		} while (str.charAt(0) != 'x' && str.charAt(0) != 'X');
		
//		while(str.charAt(0) !='x' && str.charAt(0) !='X') {
//			System.out.println("문장을 입력하면 출력하는 프로그램입니다.");
//			System.out.println("프로그램을 종료하려면 x를 입력하세요.");
//			str = scan.next();
//			System.out.println("입력한 문자 : "+str);
//		}

		System.out.println("프로그램을 종료합니다.");

//		while(true) {
//			while(true){
//				break;
//			}
//			break;
//			
//		}

//		// 1-100까지 합을 구하시오.
//		// while
//		int sum=0;
//		int i=1;
//		while(i<=100) {
//			sum +=i;
//			i++;
//		}
//		System.out.println(sum);
//		
//		
//		sum=0;
//		for(i=1;i<=100;i++) {
//			sum += i;
//		}
//		System.out.println(sum);

	}

}
