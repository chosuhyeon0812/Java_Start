package honux.calendar;

public class Calendar {
	private final int[] MAX_DAYS = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private final int[] LEAP_MAX_DAYS = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			return true;
		return false;
	}
	
	public int getmaxDaysofMonth(int year, int month2) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month2];
		} else {			
			return MAX_DAYS[month2];
		}
	}
	
	/*
	 * - 월을 입력하면 해당월의 달력을 출력한다
	 * - 달력은 모양은 1단계에서 작성한 모양으로 만든다
	 * - 1일은 일요일로 정해도 무방하다
	 * - 프롬프트를 출력한다.
	 */
	// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
	public void printCalendar(int year, int month2) {
		System.out.printf("   <<%d년 %d월>>\n", year, month2);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		
		// get weekday automatically 
		int weekday = getWeekDay(year, month2, 1);
		
		// print blank space
		for (int i = 0; i < weekday; i++) {
			System.out.print("   ");
		}
		int maxDay = getmaxDaysofMonth(year, month2);
		int count = 7 - weekday;
		// 7보다 작으면 count 7이면 0
		
		int delim;
		if (count < 7) {
			delim = count;
		} else {
			delim = 0;
		}
				
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

	private int getWeekDay(int year, int month2, int day) {
		int syear = 1970;
		final int  STANDARD_WEEKDAY = 4; // 1970/Jan/1st/Thursday
		
		int count = 0;
		
		for (int i = syear; i < year; i++) {
			int delta = isLeapYear(i) ? 366 : 365;
			count += delta;
		}
		
		for (int i = 1; i < month2; i++) {
			int delta = getmaxDaysofMonth(year, i);
			count += delta;
		}
		
		count += day -1 ;
		
		int weekday = (count + STANDARD_WEEKDAY) % 7;
		return weekday;
	}

}
