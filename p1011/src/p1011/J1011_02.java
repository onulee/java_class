package p1011;

import java.util.Scanner;

public class J1011_02 {

	public static void main(String[] args) {
		// 소문자 1개를 입력하면 대문자로 출력하시오.
		Scanner scan = new Scanner(System.in);
		char result = ' ';

		while (true) {
			System.out.println("문자를 입력하세요.");
			String str = scan.nextLine();
			char ch = str.charAt(0);

			// 1개인지 확인
			if (str.length() == 1) {
				// 소문자인지 확인
				if ('a' <= ch && ch <= 'z') {
					result = (char) (ch - 32);
					System.out.println("대문자 : " + result);
				} else {
					System.out.println("소문자 아닙니다.");

				}
			} else {

				System.out.println("1개의 문자만 입력이 가능합니다.");

			}
		}

	}//main
}//class
