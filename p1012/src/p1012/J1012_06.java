package p1012;

import java.util.Scanner;

public class J1012_06 {

	public static void main(String[] args) {
		// 랜덤숫자 1-100까지 숫자를 1개 출력하시오.
		int count=0;
		int random = (int)(Math.random()*100)+1;
		int[] num = new int[10];
		Scanner scan = new Scanner(System.in);
		int choice=0;
		
		while(true) {
			count++;
			System.out.println("랜덤정답 : "+random);
			System.out.println("랜덤숫자를 맞추는 게임입니다. "+count+"번째 숫자를 입력하세요.>>");
			choice = scan.nextInt();
			
			// 입력한 숫자를 배열에 저장.
			num[count-1] = choice;
			
			if(choice==random) {
				System.out.println("정답입니다.");
				break;
			}else if(choice>random) {
				System.out.println("입력한 숫자보다 작습니다. 다시 도전하세요.!!");
			}else {
				System.out.println("입력한 숫자보다 큽니다. 다시 도전하세요.!!");
			}
			// 10번까지 도전
			if (count>=10) {
				break;
			}
			
		}//while
		
		System.out.println("정답 맞추기 게임이 끝났습니다.!!");
	    System.out.println("당신이 입력한 숫자 : ");
	    for(int i=0;i<count;i++) {
	    	if(i==0) {
	    		System.out.print(num[i]);
	    	}else {
	    		System.out.print(","+num[i]);
	    	}
	    }
	    System.out.println();
	    System.out.println("정답숫자 : "+random);
		
		

	}

}
