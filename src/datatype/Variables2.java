package datatype;

public class Variables2 {
	public static void main(String[] args) {
		// 변수에 값 저장
		int score;
		score = 90;

		// 값(literal)
		// 정수
		System.out.println(0);
		System.out.println(75);
		System.out.println(-100);

		System.out.println(02);
		System.out.println(055);

		System.out.println(0x5);
		System.out.println(0xA);
		System.out.println(0xB3);

		// 실수
		System.out.println(0.25);
		System.out.println(-3.14);

		System.out.println(5E7); // 5 * (10의 7승)
		System.out.println(5e7);

		System.out.println(0.12E-5); // 0.12 * (10^-5)
		System.out.println(0.12e-5);

		// 문자
		System.out.println('A');
		System.out.println('a');
		System.out.println('가');
		System.out.println('나');

//		System.out.println('Ab');
//		System.out.println('');

		System.out.println(' ');
		System.out.println('\t'); // tab
		System.out.println('\n'); // new line
		System.out.println('\u005A');

		// 문자열
		System.out.println("여러개의 문자");
		System.out.println("");
		System.out.println("탭은 \t로 작성");
		System.out.println("뉴라인은 \n로 작성");

		// 논리 (boolean)
		System.out.println(true);
		System.out.println(false);

	}
}
