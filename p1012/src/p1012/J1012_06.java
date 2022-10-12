package p1012;

import java.util.Scanner;

public class J1012_06 {

	public static void main(String[] args) {
		// 랜덤숫자 1-100까지 숫자를 1개 출력하시오.
		int random = (int)(Math.random()*100)+1;
		int[] num = new int[100];
		Scanner scan = new Scanner(System.in);
		int choice=0;
		while(true) {
			System.out.println("랜덤숫자를 맞추는 게임입니다. 숫자를 입력하세요.>>");
			choice = scan.nextInt();
			
			// 입력한 숫자를 배열에 저장을 해야 합니다.
			
			if(choice==random) {
				System.out.println("정답입니다.");
				break;
			}else if(choice>random) {
				System.out.println("입력한 숫자보다 작습니다. 다시 도전하세요.!!");
			}else {
				System.out.println("입력한 숫자보다 큽니다. 다시 도전하세요.!!");
			}
		}//while
		
		//for 배열을 출력해야 합니다.

	}

}
