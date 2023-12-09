package honux.calendar;

public class Calendar {
	private final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			return true;
		return false;
	}
	
	public int getmaxDaysofMonth(int year, int month2) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month2 - 1];
		} else {			
			return MAX_DAYS[month2 - 1];
		}
	}
	
	/*
	 * - 월을 입력하면 해당월의 달력을 출력한다
	 * - 달력은 모양은 1단계에서 작성한 모양으로 만든다
	 * - 1일은 일요일로 정해도 무방하다
	 * - 프롬프트를 출력한다.
	 */
	// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
	public void printCalendar(int year, int month2, int weekday) {
		System.out.printf("   <<%4d년 %2d월>>\n", year, month2);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		
		// print blank space
		for (int i = 0; i < weekday; i++) {
			System.out.print("   ");
		}
		int maxDay = getmaxDaysofMonth(year, month2);
		int count = 7 - weekday;
		int delim = count;
				
		// print first line(제일 윗줄 먼저 계산하고 나머지 7개씩 끊어서 순환하기)
		for (int i = 1; i <= count; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		
		// print from second line to last
		count++;
		
		for (int i = count; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == delim) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println();
	}

}
