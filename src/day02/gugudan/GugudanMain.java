package day02.gugudan;

public class GugudanMain {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			// 다른 클래스에 있는 함수를 사용하기 위해서는 
			// 메서드 앞에 클래스 명을 붕여 주어야 한다!!
			int[] result = Gugudan3.calculate(i);
			Gugudan3.print(result);
		}
	}
}
