package honux.calendar;

import java.util.Scanner;

public class Calendar {
	private final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getmaxDaysofMonth(int month2) {
		return MAX_DAYS[month2 - 1];
	}
	
	/*
	 * - 월을 입력하면 해당월의 달력을 출력한다
	 * - 달력은 모양은 1단계에서 작성한 모양으로 만든다
	 * - 1일은 일요일로 정해도 무방하다
	 * - 프롬프트를 출력한다.
	 */
	public void printCalendar(int year, int month2) {
		System.out.printf("   <<%4d년 %2d월>>\n", year, month2);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		int maxDay = getmaxDaysofMonth(month2);
		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
//		System.out.println(" 1  2  3  4  5  6  7");
//		System.out.println(" 8  9 10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");
//		System.out.println("29 30 31");
	}

	// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
//		Scanner sc = new Scanner(System.in);
//		System.out.println("해당하는 달의 최대 일 수는 몇일 인가요?");
//		int month = sc.nextInt();
//		
//		if (month == 2) {
//			System.out.println("28일");
//		} else if (month == 4 || month == 6 || month == 8 ||
//				month == 9 || month == 11) {
//			System.out.println("30일");
//		} else {
//			System.out.println("31일");
//		}
//		sc.close();
	
}
