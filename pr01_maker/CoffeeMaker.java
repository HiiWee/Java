package pr01_maker;

import java.util.Scanner;
public class CoffeeMaker {
	//커피 원료 저장 배열, 순서대로 원두, 물, 우유, 얼음
	int[] container = {10, 10, 10, 10};
	static int selector;


	public static void makeCoffee(int num) {
		if(num == 1) {
			System.out.print("메뉴얼 모드로 커피를 추출합니다.\n");
			System.out.print("원두의 양을 선택하세요 1.[small] 2.[medium] 3.[large]");
			Scanner scan = new Scanner(System.in);
			selector = scan.nextInt();
		}
	
	 
	public static void main(String[] args) {
		// 배열에 사용할 값 상수선언
		final int coffee=0; final int milk=1;
		final int ice=2; final int chocolate=3;

		Scanner scan = new Scanner(System.in);
		// 커피원료 저장 배열
		//int[] container = new int[4];
		// 제어문에서 사용될 정수형 변수
		//int selector;
		// 루프문을 동작하는 불리언
		boolean play_f = true;
		// 관리자모드 제어 불리언
		// boolean management_f = false;

		while(play_f) {
			System.out.print("커피 머신을 동작합니다.");
			System.out.print("[1]커피추출  [2]관리자모드 ");
			selector = scan.nextInt();
			if(selector == 1) {
				System.out.print("커피추출을 시작합니다. 모드를 선택하세요");
				System.out.print("[1]메뉴얼 모드  [2]커스텀 모드");
				selector = scan.nextInt();
				if(selector == 1) {}
			}
			else if(selector == 2) {
				System.out.print("관리자모드를 실행합니다.");
				System.out.print("");
			}
		}
	}
}
		