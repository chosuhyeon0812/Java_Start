package honux.calendar;

import java.text.ParseException;
import java.util.Scanner;

public class Prompt {
	public void printMenu() {
		System.out.println("+------------------+");
		System.out.println("| 1. 일정 등록	");
		System.out.println("| 2. 일정 검색	");
		System.out.println("| 3. 달력 보기	");
		System.out.println("| h. 도움말 / q. 종료");
		System.out.println("+------------------+");
	}
	
	/**
	 1. switch case - String
	 2. Plan class - refactoring? 
	 */
	
	/**
	 * 
	 * @param week = 요일명
	 * @return 0 ~ 6 (0 = Sunday, 6 = Saturday)
	 */
	
	public int parseDay(String week) {
		switch(week) {
		case "su":
			break;
		case "mo":
			return 1;
		case "tu":
			return 2;
		case "wd":
			return 3;
		case "th":
			return 4;
		case "fr":
			return 5;
		case "sa":
			return 6;
		default:
			return 0;
		}
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
	
	/*
	 +------------------+
	 1. 일정 등록
	 2. 일정 검색
	 3. 달력 보기
	 h. 도움말 / q. 종료
	 명령(1, 2, 3, h, q)
	 +------------------+
	 */
	
	public void runPrompt() throws ParseException {
		printMenu();
		
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		
		
		while (true) {
			System.out.println("명령(1, 2, 3, h, q)");
			// 캘린더에 일정 추가하기
			String cmd = scanner.next();
			switch(cmd) {
			case "1":
				cmdRegister(scanner, cal);
				break;
			case "2":
				cmdSearch(scanner, cal);
				break;
			case "3":
				cmdCal(scanner, cal);
				break;
			case "h":
				printMenu();
				break;
			case "q":
				break;
			}
			
			if(cmd.equals("1")) cmdRegister(scanner, cal);
			else if (cmd.equals("2")) cmdSearch(scanner, cal);
			else if (cmd.equals("3")) cmdCal(scanner, cal);
			else if (cmd.equals("h")) printMenu();
			else if (cmd.equals("q")) break;
				
			
		}
		System.out.println("Thanks you, Bye~~");
		scanner.close();
	}

	private void cmdCal(Scanner s, Calendar c) {
		int month2 = 1;
		int year = 2017;
		System.out.println("년도를 입력하세요!");
		System.out.print("YEAR> ");
		year = s.nextInt();
	
		System.out.println("달을 입력하세요!");
		System.out.print("MONTH> ");
		month2 = s.nextInt();
		
		
		if (month2 > 12 || month2 < 1) {
			System.out.println("잘못된 입력입니다.");
			return; // 메소드를 종료하려면 return
		}

		c.printCalendar(year, month2);
		
	}
	
	private void cmdSearch(Scanner s, Calendar c){
		System.out.println("[일정 검색]");
		System.out.println("날짜를 입력해주세요:) (yyyy-MM-dd)");
		String date = s.next();
		String plan = "";
		try {
			plan = c.searchPlan(date);
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println("일정 검색 중 오류가 발생했습니다.");
		}
		System.out.println(plan);
	}
	private void cmdRegister(Scanner s, Calendar c) throws ParseException {
		System.out.println("[새 일정 등록]");
		System.out.println("날짜를 입력해주세요:) (yyyy-MM-dd)");
		String date = s.next();
		String text = "";
		System.out.println("일정을 입력해주세요.(문자의 끝에 ;을 입력해주세요.)");
		while(true) {
			String word = s.next();
			text += word + " ";
			if (word.endsWith(";")) {
				break;
			}
		}
		c.registerPlan(date, text);
	}
	
	public static void main(String[] args) throws ParseException {
		// 셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
