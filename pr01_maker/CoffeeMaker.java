package pr01_maker;

import java.util.Scanner;
public class CoffeeMaker {
	//커피 원료 저장 배열, 순서대로 원두, 물, 얼음, 우유, 초콜릿
	static int[] container = {10, 10, 10, 10, 10};
	static String[] leftContainer = {"CoffeeBean", "Water", "Ice", "Milk", "Chocolate"};
	static int selector;
	
	// 커피 원두의 양을 정하는 함수 putSmallCoffeeBean, putMediumCoffeeBean, putLargeCoffeeBean
	public static void putSmallCoffeeBean() {
		// 연한커피 원두 1소모
		if(container[0]-1 < 0)
			System.out.println("원두가 부족합니다.");
		else {
			System.out.println("원두를 추출합니다.");
			container[0] -= 1;
		}
	}
	
	public static void putMediumCoffeeBean() {
		// 보통 커피 원두 2소모
		if(container[0]-2 < 0)
			System.out.println("원두가 부족합니다.");
		else {
			System.out.println("원두를 추출합니다.");
			container[0] -= 2;
		}
	}
	
	public static void putLargeCoffeeBean() {
		//  진한 커피 원두 2소모
		if(container[0]-3 < 0)
			System.out.println("원두가 부족합니다.");
		else {
			System.out.println("원두를 추출합니다.");
			container[0] -= 3;
		}
	}
	
	public static void putWater() {
		if(container[1]-2 < 0)
			System.out.println("물이 부족합니다.");
		else {
			System.out.println("물을 넣습니다.");
			container[1] -= 2;
		}
	}
	
	public static void putIce() {
		if(container[2]-2 < 0)
			System.out.println("얼음이 부족합니다.");
		else {
			System.out.println("얼음을 넣습니다.");
			container[2] -= 2;
		}
	}
	
	public static void makeAmericano(int num) {
		
		if(num==1) {
			System.out.println("[아메리카노]\n");
			putMediumCoffeeBean();
			putWater();
			System.out.print("아메리카노가 완성 됐습니다!\n");
		}
		else if(num==2) {
			System.out.println("[아이스 아메리카노]\n");
			putMediumCoffeeBean();
			putWater();
			putIce();
			System.out.print("아이스 아메리카노가 완성 됐습니다.\n");
		}
	}
	public static void makeBasicCoffee() {
		System.out.print("기본 모드로 커피를 추출합니다.\n");
		System.out.print("커피를 골라주세요 \n1.[Americano] 2.[Latte] 3.[Mocca]\n");
		System.out.print("4.[Ice Americano] 5.[Ice Latte] 6.[Ice Mocca]\n>>");
		
		Scanner scan = new Scanner(System.in);
		selector = scan.nextInt();
		switch(selector) {
		case 1:
			makeAmericano(1);
			break;
		case 2:
			// 작업일시정지 2021.03.25.11:32
		}
	}
	
	 
	public static void main(String[] args) {
		// 배열에 사용할 값 상수선언
		final int coffee=0; final int milk=1;
		final int ice=2; final int chocolate=3;

		Scanner scan = new Scanner(System.in);
		// 루프문을 동작하는 불리언
		boolean play_f = true;

		while(play_f) {
			System.out.print("커피 머신을 동작합니다.");
			System.out.print("[1]커피추출  [2]관리자모드 ");
			selector = scan.nextInt();
			
			if(selector == 1) {
				System.out.print("커피추출을 시작합니다. 모드를 선택하세요");
				System.out.print("[1]기본 모드  [2]커스텀 모드");
				selector = scan.nextInt();
				
				if(selector == 1) {
					makeBasicCoffee();
				}
			}
			else if(selector == 2) {
				System.out.print("관리자모드를 실행합니다.");
				System.out.print("");
			}
		}
	}
}
		