package challenge;

public class Gugudan {
	public static int[] calculate(int turns) {
		int[] result = new int[turns];
		for (int i = 0; i < result.length; i++) {
			result[i] = turns * (i+1);
		}
		return result;
	}
	
	public static void print(int[] result, int turns) {
		for (int i = 0; i < result.length; i++) {
//			System.out.println(turns + "*" + (i+1) + "=" + result[i]);
			System.out.printf("%d * %d = %d%n", turns, (i+1), result[i]);
		}
	}
}
