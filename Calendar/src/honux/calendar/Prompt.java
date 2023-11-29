package honux.calendar;

import java.util.Scanner;

public class Prompt {
	private final static String PROMPT = "cal> ";

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month2 = 1;
		while (true) {
			System.out.println("달을 입력하세요!");
			System.out.print(PROMPT);
			month2 = scanner.nextInt();
			if (month2 == -1) {
				break;
			}
			if (month2 > 12) {
				continue;
			}
			cal.printCalendar(2023, month2);
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
