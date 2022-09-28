package p0928;

public class J0928_01 {

	public static void main(String[] args) {
		double number = 13.5678478;
		long result = Math.round(number); //소수점 첫째자리 반올림
		System.out.println(result);
		
		// 문제 4째자리에서 반올림을 하시오.  13.568
		double result2 = Math.round(number*1000)/1000.0;    // 13567.8478
		System.out.println(result2);
		
		// Math.round : 반올림, Math.floor : 버림, Math.ceil : 올림
		System.out.println(Math.floor(number));
		System.out.println(Math.ceil(number));
//		Math.floor(number); //13
//		Math.ceil(number);  //14
		
		
//		double number = 13.5678478;
//		double result = (int)(number*100)/100.0;
//		System.out.println(result);

	}

}
