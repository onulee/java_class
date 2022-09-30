package p0930;

import java.util.Scanner;

public class J0930_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num=0;
		int random=0;
		random = (int)(Math.random()*100)+1; //1-10까지 랜덤숫자 발생
		
		for(int i=0;i<10;i++) {
			// 10번 자동으로 반복됨
			System.out.println("1-100까지의 숫자를 입력하세요.");
			num = scan.nextInt();
			if (num==random) {
				System.out.println("당첨입니다. 10억을 받습니다.");
				break;
			}else if(num>random) {
				System.out.println("입력한 숫자보다 작은수를 입력하세요.");
			}else {
				System.out.println("입력한 숫자보다 큰수를 입력하세요.");
			}
			System.out.println("입력한 숫자 : "+num);
		}
		System.out.println("랜덤 숫자 : "+random);
		
		
//		for(int i=0;i<10;i=i+1) {  //i=i+2
//			System.out.println(i+1);
//		}
		
		
		
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
//		System.out.println(7);
//		System.out.println(8);
//		System.out.println(9);
//		System.out.println(10);
//		
//		System.out.println("----------------------------");
//		
//		for(int i=1;i<=10;i++) {
//			System.out.println(i);
//		}

	}

}
