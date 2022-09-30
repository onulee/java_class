package test0930;

import java.util.Scanner;

public class J0930_01 {

	public static void main(String[] args) {

		//당첨번호 만들기 3자리 - 100 ~ 999
		// 0.0 <= Math.random() < 1.0
		// 0.0*1000+100 <= Math.random()*1000+100 < 1.0 * 1000 + 100
//		System.out.println((int)(Math.random()*900)+100);
		// 1. 마지막 번호가 맞으면 1000원
		// 2. 마지막과 중간번호 2개의 숫자가 맞으면 100000원
		// 3. 3개의 숫자가 맞으면 1억원
		
		
		int result = (int)(Math.random()*900)+100; //당첨번호
		String result2 = result+"";
		Scanner scan = new Scanner(System.in);
		System.out.println("복권번호를 입력하세요.");
		String num = scan.nextLine();
		System.out.println("입력한 복권번호 : "+num);
		System.out.println("당첨 복권번호 : "+ result);
		
		System.out.println("당첨 처음자리 번호 : "+ result2.charAt(0));
		System.out.println("당첨 중간자리 번호 : "+ result2.charAt(1));
		System.out.println("당첨 끝자리 번호 : "+ result2.charAt(2));
		
		System.out.println("입력한 처음자리 번호 : "+ num.charAt(0));
		System.out.println("입력한 중간자리 번호 : "+ num.charAt(1));
		System.out.println("입력한 끝자리 번호 : "+ num.charAt(2));
		
		if (result2.charAt(2)==num.charAt(2)) {
			System.out.println("당첨 1000원 획득");
		}else {
			System.out.println("탈락입니다.");
		}
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("소문자 1개를 입력해주세요.");
//		String str = scan.nextLine();
//		//대문자로 출력하는 방법   a -> A     a:97,A:65   97-65=32
//		char ch = str.charAt(0);
//		System.out.println("대문자 : "+(char)(ch-32));
		
		
//		String str ="120";
//		// 120+2
//		// 122
//		int num = Integer.parseInt(str); //String -> int 형변환
//		System.out.println("합계 : "+(num+2)); //122
		

	}

}
