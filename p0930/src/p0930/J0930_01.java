package p0930;

import java.util.Scanner;

public class J0930_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("당신의 레벨을 입력하세요.");  
		// 3:최고관리자-삭제권한,쓰기권한,읽기권한, 2:중간관리자-쓰기,읽기 ,1:일반회원-읽기
		int num = scan.nextInt();
		switch(num) {
		case 3:
			System.out.println("삭제권한을 부여!");
		case 2:
			System.out.println("쓰기권한을 부여!");
		case 1:
			System.out.println("읽기권한을 부여!");
			break;
		}
		
		
		
		
//		System.out.println("통신사 끝자리 숫자를 입력하세요.");
//		int num = scan.nextInt();
//		
//		if (num==1 || num==7) { 
//			System.out.println("SK통신사입니다.");
//		} else if (num==6 || num==8) {
//			System.out.println("KT통신사입니다.");
//		} else if (num==9) {
//			System.out.println("LG통신사입니다.");
//		}else {
//			System.out.println("번호를 잘못입력하셨습니다.");
//		}
		
		
//		switch(num) {
//		case 1:
//		case 7:	
//			System.out.println("SK통신사입니다.");
//			break;
////		case 7:
////			System.out.println("SK통신사입니다.");
////			break;
//		case 6: case 8:
//			System.out.println("KT통신사입니다.");
//			break;
//		case 9:
//			System.out.println("LG통신사입니다.");
//			break;
//		default:
//			System.out.println("번호를 잘못입력하셨습니다.");
//		}

	}

}
