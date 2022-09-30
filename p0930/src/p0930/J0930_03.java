package p0930;

import java.util.Scanner;

public class J0930_03 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("1-10번 사이의 숫자를 입력하세요.");
		int num = scan.nextInt();
		int temp = (int)(Math.random()*45)+1; //1-10
		if(num==temp) {
			System.out.println("당첨되었습니다. 10억을 쏩니다!");
		}else {
			System.out.println("탈락입니다. 1억을 지불하셔야 합니다.");
		}
		
		System.out.println("입력한 숫자 : "+num);
		System.out.println("랜덤 숫자 : "+temp);
		
		
		//0.0 <= x < 1.0    0+1 <= x+1 < 10+1
//		System.out.println((int)(Math.random()*10)+1);
		

	}

}
