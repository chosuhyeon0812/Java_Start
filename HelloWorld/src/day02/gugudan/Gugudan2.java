package day02.gugudan;

public class Gugudan2 {
	public static void main(String[] args) {
		
		// 배열을 활용해 구구단 만들기
		int[] result = new int[9];
		for (int i = 0; i < result.length; i++) {
			result[i] = 2 * (i + 1);
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		int[] times3 = new int[9];
		for (int i = 0; i < times3.length; i++) {
			times3[i] = 3 * (i + 1);
		}
		for (int i = 0; i < times3.length; i++) {
			System.out.println(times3[i]);
		}
	}
}
