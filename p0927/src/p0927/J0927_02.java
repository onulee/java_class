package p0927;

public class J0927_02 {

	public static void main(String[] args) {
		int i=5;
//		int result = ++i;  // 1을 먼저 더해서 대입을 시킴.
		++i;
		int result = i;
		System.out.println("i의 결과값 :"+i); //6
		System.out.println("result의 결과값 : "+result);  //6
		
		
//		result = i++;      // 대입을 먼저하고 1을 더해 줌.
		i++;
		result = i;
		System.out.println("i의 결과값 : "+i);           // 7
		System.out.println("result의 결과값 : "+result); // 6

	}

}
