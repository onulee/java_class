package p1014;

public class J1014_05 {

	public static void main(String[] args) {
		
		int[] lotto = new int[45];
		int temp=0;
		int random=0;
		
		// 1-45까지 숫자를 배열에 저장
		for(int i=0;i<45;i++) { // 1,2,3,4,5....
			lotto[i] = i+1;
		}
		
		// 배열섞기
		for(int i=0;i<500;i++) {
			random = (int)(Math.random()*45);  //0-44
			temp = lotto[0];
			lotto[0] = lotto[random];  // 23 -> 0
			lotto[random] = temp;
		}
		
		//출력
		for(int i=0;i<6;i++) {
			System.out.print(lotto[i]+" ");
		}
		
		System.out.println();
		
		//배열6개 scan입력
		
		
		
		
		// 1-100까지 랜덤숫자 1개 출력하시오.
//		int num = 0; 
//		int num2 = 50;
//		int temp=0;
//		num = (int) (Math.random() * 100) + 1;
//		
//		System.out.println("바뀌기 전 변수 출력 : ");
//		System.out.println("num : "+num);   //랜덤숫자 -> 50;
//		System.out.println("num2 : "+num2); //50 -> 랜덤숫자
//		
//		// num,num2의 숫자를 바꿔서 저장시켜 출력하시오.
//		// int temp를 사용하여 서로간의 값을 변경해야 함.
//		temp = num;
//		num = num2;
//		num2 = temp;
//		
//		System.out.println("바뀐 변수 출력 : ");
//		System.out.println("num : "+num);   //랜덤숫자 -> 50;
//		System.out.println("num2 : "+num2); //50 -> 랜덤숫자
		
		

	}

}
