package p1019;

public class J1019_03 {

	public static void main(String[] args) {
		int[][] score = new int[5][3];
		int[] num = new int[15];
		int random_num=0;
		int temp = 0;
		
		// num배열 번호 생성
		for(int i=0;i<15;i++) {
			num[i]=i+1;   
		}
		
		// num배열 번호섞기
		for(int i=0;i<500;i++) {
			random_num = (int)(Math.random()*15); //0-44
			// 교환
			temp = num[0];
			num[0]=num[random_num];
			num[random_num]=temp;
			
		}
		
		// score배열 입력부분
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				score[i][j] = num[3*i+j];   //0,1,2,3,4,5,6,7,8,9,10,11,12,13,14
//				score[i][j] = 3*i+j+1;  //1,2,3,4,5,6,7,8,9,10,11,12,13,14,15
			}//for
		}//for
		
		// score배열 출력부분
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				System.out.printf("%d\t",score[i][j]);
			}//for
			System.out.println();
		}//for

	}//main

}//class
