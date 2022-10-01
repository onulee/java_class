package test1001;

import java.util.Scanner;

public class J1001_02 {

	public static void main(String[] args) {
		
		int re_money=10000;  //받은금액 변수
		int buy_money=0; //구매금액 변수
		String buy_name = ""; //구매물품 이름
		int ch_money=0;  //거스름돈 변수
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[ KU 무인아이스크림점 ]");
		System.out.println("1.부라보콘:1000원  2.스크류바:500원  3.설레임:1500원");
		System.out.println("구매 아이스크림 번호를 입력하세요.");
		// 콘솔창 입력
		int buy = scan.nextInt();
		
		if(buy==1) {
			buy_money = 1000;
			buy_name ="부라보콘";
		}else if(buy==2) {
			buy_money = 500;
		    buy_name = "스크류바";
		}else if(buy==3) {
			buy_money = 1500;
		    buy_name = "설레임";
		}
			
		System.out.println(buy_name +""+buy_money+"원 구매했습니다.");
		System.out.println("지불금액을 입력하세요.");
		re_money = scan.nextInt();
		
		// 출력
		System.out.println("받은금액 : "+re_money);
		System.out.println("구매금액 : "+buy_money);
		System.out.println("거스름돈 : "+(re_money-buy_money));
		
		
		
		
//		int number = 7;
//		if(number>0) {
//			System.out.println("양수입니다.");
//		}else if(number<0) {
//			System.out.println("음수입니다.");
//		}else {
//			System.out.println("0입니다.");
//		}
		
		

	}

}
