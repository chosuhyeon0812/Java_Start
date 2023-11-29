package honux.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		// 입력 : 키보드로 두 수의 입력을 받는다.
		// 출력 : 화면에 두 수의 합을 출력한다
		System.out.println("두 수를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = a + b;
		System.out.printf("두 수의 합은 %d입니다 ", result);
		sc.close();
	}
}
