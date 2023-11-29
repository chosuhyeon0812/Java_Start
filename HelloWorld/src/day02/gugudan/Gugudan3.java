package day02.gugudan;

public class Gugudan3 {
	// 메서드를 활용해 구구단 구현하기
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for (int i = 0; i < result.length; i++) {
			result[i] = times * (i+1);
		}
		return result;
	}
	
	public static void print(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
 	}
	
//	public static void main(String[] args) {
//		for (int i = 2; i < 10; i++) {
//			// 함수 호출1
//			int[] result = calculate(i);
//			// 함수 호출2
//			print(result);
//		}
//	}
}
