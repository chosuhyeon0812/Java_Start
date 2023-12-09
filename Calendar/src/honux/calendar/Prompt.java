package honux.calendar;

import java.util.Scanner;

public class Prompt {
	
	/**
	 * 
	 * @param week = 요일명
	 * @return 0 ~ 6 (0 = Sunday, 6 = Saturday)
	 */
	
	public int parseDay(String week) {
		if (week.equals("su")) return 0;
		else if (week.equals("mo"))return 1;
		else if (week.equals("tu"))return 2;
		else if (week.equals("wd"))return 3;
		else if (week.equals("th"))return 4;
		else if (week.equals("fr"))return 5;
		else if (week.equals("sa"))return 6;
		else
			return 0;
	}
	
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month2 = 1;
		int year = 0;
		int weekday = 0;
		
		while (true) {
			System.out.println("년도를 입력하세요!(exit : -1)");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
		
			System.out.println("달을 입력하세요!");
			System.out.print("MONTH> ");
			month2 = scanner.nextInt();
			
			System.out.println("첫째 날의 요일을 입력하세요!(su, mo, tu, wd, th, fr, sa)");
			String str_weekday = scanner.next();
			weekday = parseDay(str_weekday);
			
			if (year == -1) {
				break;
			}
			if (month2 > 12 || month2 < 1) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
	
			cal.printCalendar(year, month2, weekday);
//			cal.printSampleCalendar();
		}
		System.out.println("Bye~~");
		scanner.close();
	}

	public static void main(String[] args) {
		// 셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
