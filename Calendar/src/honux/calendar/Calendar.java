package honux.calendar;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {

		System.out.println("일  월  화  수  목  금  토");
		System.out.println("---------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		System.out.println("29 30 31");
		
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
		// 강사님 풀이
		Scanner scanner = new Scanner(System.in);
		int month2 = scanner.nextInt();
		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.printf("%d월은 %d 일까지 있습니다. \n", month2, maxDays[month2-1]);
		}
}
