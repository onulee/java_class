package p0928;

import java.util.Scanner;

public class J0928_04 {

	public static void main(String[] args) {
		// A-65,B,C -> 일반좌석입니다.  
		// D-68,E-69,F-70 -> VIP좌석입니다. 나쵸를 무료로 제공합니다.
		Scanner scan = new Scanner(System.in);
		System.out.println("영화관 좌석을 입력하세요.예)A3");
		String str = scan.nextLine();
		int x = (int)(str.charAt(0));
		
		// 68 <= x <= 70   68 <= x && x <= 70
		if(x >= 68 && x <= 70 )
			System.out.println("VIP좌석입니다. 음료수를 무료로 제공합니다.");
		else
			System.out.println("일반좌석입니다. 재미있는 관람하세요.");

	}

}
