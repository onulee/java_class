package p1011;

import java.util.Scanner;

public class J1011_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 1개 입력을 받아서 소문자인지 아닌지 확인해서
		// 소문자입니다. 소문자가 아닙니다. 출력하시오.
		
		while(true) {
			System.out.println("문자를 입력하세요.");
			String str = scan.nextLine();  
			char ch = str.charAt(0);  
			
			//1개인지 확인
			if(str.length()==1) {
				
				// 소문자인지 확인
				if('a'<=ch && ch<='z') {
					System.out.println("소문자입니다.");
				}else {
					System.out.println("소문자 아닙니다.");
					
				}
				System.out.println("입력한 문자 : "+ch);
				
				
			}else {
				
			    System.out.println("1개의 문자만 입력이 가능합니다.");
			    
			}
			
			
			
			
		
		}//while
		
//		for(;;) {
//			
//		}
		
		
		
		
		
		
		
		
		
		
//		System.out.println("문자를 입력하세요.");
//		String str = scan.nextLine();  //문자열next()   nextInt()-정수   nextDouble()-실수
//		char ch = str.charAt(1);  // abcde
//		System.out.println("입력한 문자열 : "+str);
//		System.out.println("입력한 문자열 길이 : "+str.length());
//		System.out.println("입력한 문자 : "+ch);
		
		
//		char ch='0';  //48
//		char ch2 = '2'; // 1-49, 2-50, 3-51
//		System.out.println(ch2-ch);
		
//		String str = "7";
//		int num = 7;
//		int num2 = 7;
//		char ch = 'A';
//		System.out.println("숫자 : "+num);        //7
//		System.out.println("숫자 : 7" +num2);   //77
//		System.out.println((int)(ch));

	}

}
