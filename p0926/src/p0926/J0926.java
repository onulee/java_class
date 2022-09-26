package p0926;
import java.util.Scanner;

public class J0926 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// nextLine,next - 문자열
		// nextInt,nextLong - 정수만 입력가능
		// nextDouble,nextFloat - 실수만 가능
		
		
		System.out.println("첫번째 숫자를 입력해주세요.");
		int input = scan.nextInt();
		System.out.println("출력값 : "+input);
		
		System.out.println("두번째 숫자를 입력해주세요.");
		input = scan.nextInt();
		System.out.println("출력값 : "+input);

	}

}
