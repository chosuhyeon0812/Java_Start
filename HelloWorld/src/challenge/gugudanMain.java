package challenge;

import java.util.Scanner;

public class gugudanMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 2; i <= num; i++) {
			// day02.gugudan.
			System.out.println(i + "단");
//			int[] result = day02.gugudan.Gugudan.calculate(i);
			int[] result = Gugudan.calculate(i);
			Gugudan.print(result, i);
		}
	}
}
