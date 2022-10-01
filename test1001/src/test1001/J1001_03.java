package test1001;

import java.util.Scanner;

public class J1001_03 {

	public static void main(String[] args) {
		// 1-100숫자가 있어요. 10번에 맞춰야 합니다. 맞추면 1억을 드립니다.
		// 1. 1-100까지 숫자를 랜덤으로 1개를 생성
		// 2. 숫자를 입력
		// 3. 맞는지 틀린지 확인
		// 4. 횟수가 몇번인지 확인
		// 0.0 <= Math.random() < 1.0
		int input=0; //입력받을 숫자 변수
		int count=0; // 횟수를 저장하는 변수
		int[] save_num = new int[10]; 
		Scanner scan = new Scanner(System.in);
		int random = (int)(Math.random()*100)+1;
		//무한반복
		for(int i=0;i<10;i++) {
			count++;
			System.out.println("숫자를 입력하세요.");
			input = scan.nextInt();
			save_num[i] = input;
			System.out.println("입력한 숫자 : "+input);
			
			if(random==input) {
				System.out.println("정답입니다.");
				break;
			}else if(random>input) {
				System.out.println("오답입니다.");
				System.out.println(input+ "보다 큰수를 입력하세요.");
			}else if(random<input) {
				System.out.println("오답입니다.");
				System.out.println(input+ "보다 작은 수를 입력하세요.");
			}//if
			
		}//for
		
		System.out.println("랜덤 숫자 : "+random);
		System.out.println("도전 횟수 :"+count);
		System.out.print("도전 숫자 : ");
		for(int i=0;i<count;i++) {
			System.out.print(save_num[i]+",");
		}
		System.out.println();
		System.out.println("프로그램 종료");
		
		
		
		
//		for(;;) {
//			System.out.println("숫자를 입력해주세요.(0:종료됨)");
//			int num = scan.nextInt();
//			if(num==1) {
//				System.out.println("SK입니다.");
//			}else if(num==6) {
//				System.out.println("KTF입니다.");
//			}else if(num==9) {
//				System.out.println("LG입니다.");
//			}else if(num==0) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}else {
//				System.out.println("해당되는 통신사는 없습니다.");
//			}
//		}
		

	}

}
