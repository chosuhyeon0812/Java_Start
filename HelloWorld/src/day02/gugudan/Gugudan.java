package day02.gugudan;


//import java.util.Scanner;


// 다른 패키지로의 접근이 가능한가 싶어서 해봄,,
public class Gugudan {
	
	public static int[] calculate(int turns) {
		int[] result = new int[turns];
		for (int i = 0; i < result.length; i++) {
			result[i] = turns * (i+1);
		}
		return result;
	}
	
	public static void print(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
//	public static void main(String[] args) {
		
		
//		// 8, 9단
//		System.out.println("구구단 중 출력할 단은? : ");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		if (n < 2) {
//			System.out.println("값을 잘못 입력했습니다");
//		} else if (n > 9) {			
//			System.out.println("값을 잘못 입력했습니다");
//		} else {
//			for (int i = 1; i < 10; i++) {
//				System.out.println(n * i);
//			}			
//		}
		
//		// 6단 : 반복문 사용하기(while)
//		System.out.println("6단");
//		int i = 1;
//		while (i < 10) {
//			System.out.println(6 * i);
//			i = i + 1;
//		}
//		
//		// 7단 : 반복문 사용하기(for)
//		System.out.println("7단");
//		for (int j = 1; j < 10; j++) {
//			System.out.println(7 * j);
//		}
		
		// 2단
		// 위에 줄 복사 : [ctrl] + [alt] + [아래/위 화살표]
//		System.out.println("2단");
//		System.out.println(2 * 1);
//		System.out.println(2 * 2);
//		System.out.println(2 * 3);
//		System.out.println(2 * 4);
//		System.out.println(2 * 5);
//		System.out.println(2 * 6);
//		System.out.println(2 * 7);
//		System.out.println(2 * 8);
//		System.out.println(2 * 9);
		
		// 3단
//		System.out.println("3단");
//		System.out.println(3 * 1);
//		System.out.println(3 * 2);
//		System.out.println(3 * 3);
//		System.out.println(3 * 4);
//		System.out.println(3 * 5);
//		System.out.println(3 * 6);
//		System.out.println(3 * 7);
//		System.out.println(3 * 8);
//		System.out.println(3 * 9);	
		
		// 4단
//		System.out.println("4단");
//		int result = 4 * 1;
//		System.out.println(result);
//		result  = 4 * 2;
//		System.out.println(result);
//		result  = 4 * 3;
//		System.out.println(result);
//		result  = 4 * 4;
//		System.out.println(result);
//		result  = 4 * 5;
//		System.out.println(result);
//		result  = 4 * 6;
//		System.out.println(result);
//		result  = 4 * 7;
//		System.out.println(result);
//		result  = 4 * 8;
//		System.out.println(result);
//		result  = 4 * 9;
//		System.out.println(result);
		
//		System.out.println("구구단 총 출력할 단은? : ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();	
//		System.out.println(number * 1);
//		System.out.println(number * 2);
//		System.out.println(number * 3);
//		System.out.println(number * 4);
//		System.out.println(number * 5);
//		System.out.println(number * 6);
//		System.out.println(number * 7);
//		System.out.println(number * 8);
//		System.out.println(number * 9);
		

//		}
}
