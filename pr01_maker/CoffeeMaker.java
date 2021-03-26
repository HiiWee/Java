package pr01_maker;

import java.util.Scanner;
public class CoffeeMaker {
	//커피 원료 저장 배열, 순서대로 원두, 물, 얼음, 우유, 초콜릿
	static int[] container = {10, 10, 10, 10, 10};
	static final int BEAN=0; 	static final int WATER=1;	static final int ICE=2; 
	static final int MILK=3;	static final int CHOCOLATE=4;
	static String[] leftContainer = {"CoffeeBean", "Water", "Ice", "Milk", "Chocolate"};
	static int selector;
	
	// 커피 원두의 양을 정하는 함수 putSmallCoffeeBean, putMediumCoffeeBean, putLargeCoffeeBean
	public static int putSmallCoffeeBean() {
		// 연한커피 원두 1소모
		if(container[BEAN]-1 < 0) {
			System.out.println("원두가 부족합니다.");
			return 0;
		}
		else {
			System.out.println("원두를 추출합니다.");
			container[BEAN] -= 1;
			return 1;
		}
	}
	
	public static void putMediumCoffeeBean() {
		// 보통 커피 원두 2소모
		if(container[BEAN]-2 < 0) {
			System.out.println("원두가 부족합니다.");
		}
		else {
			System.out.println("원두를 추출합니다.");
			container[BEAN] -= 2;
		}
	}
	
	public static void putLargeCoffeeBean() {
		//  진한 커피 원두 2소모
		if(container[BEAN]-3 < 0)
			System.out.println("원두가 부족합니다.");
		else {
			System.out.println("원두를 추출합니다.");
			container[BEAN] -= 3;
		}
	}
	
	public static void putWater() {
		if(container[WATER]-2 < 0)
			System.out.println("물이 부족합니다.");
		else {
			System.out.println("물을 넣습니다.");
			container[WATER] -= 2;
		}
	}
	
	public static void putIce() {
		if(container[ICE]-2 < 0)
			System.out.println("얼음이 부족합니다.");
		else {
			System.out.println("얼음을 넣습니다.");
			container[ICE] -= 2;
		}
	}
	
	public static void putMilk() {
		if(container[MILK]-3 < 0)
			System.out.println("우유가 부족합니다.");
		else {
			System.out.println("우유를 넣습니다.");
			container[MILK] -= 3;
		}
	}
	
	public static void putChocolate() {
		if(container[CHOCOLATE]-2 < 0)
			System.out.println("초콜릿이 부족합니다.");
		else {
			System.out.println("초콜릿을 넣습니다.");
			container[CHOCOLATE] -= 2;
		}
	}
	
	public static void dripAmericano() {
		System.out.println("[아메리카노]");
		putMediumCoffeeBean();
		putWater();
		System.out.println("아메리카노가 완성 됐습니다!");
	}
	
	public static void dripIceAmericano() {
		System.out.println("[아이스 아메리카노]");
		putMediumCoffeeBean();
		putWater();
		putIce();
		System.out.print("아이스 아메리카노가 완성 됐습니다.\n");
	}
	
	public static void dripLatte() {
		System.out.println("[카페라떼]");
		putLargeCoffeeBean();
		putMilk();
	}
	
	public static void dripIceLatte() {
		System.out.println("[아이스 카페라떼]");
		putLargeCoffeeBean();
		putMilk();
		putIce();
	}
	
	public static void dripMocca() {
		System.out.println("[카페모카]");
		putMediumCoffeeBean();
		putChocolate();
		putWater();
	}
	
	public static void dripIceMocca() {
		System.out.println("[아이스 카페모카]");
		putMediumCoffeeBean();
		putChocolate();
		putWater();
		putIce();
	}
	
	public static void startBasicMode() {
		System.out.print("기본 모드로 커피를 추출합니다.\n");
		System.out.print("커피를 골라주세요 \n1.[Americano] 2.[Latte] 3.[Mocca]\n");
		System.out.print("4.[Ice Americano] 5.[Ice Latte] 6.[Ice Mocca]\n>>");
		
		Scanner scan = new Scanner(System.in);
		selector = scan.nextInt();
		switch(selector) {
		case 1:
			dripAmericano();
			break;
		case 2:
			dripLatte();
			break;
		case 3:
			dripMocca();
			break;
		case 4:
			dripIceAmericano();
			break;
		case 5:
			dripIceLatte();
			break;
		case 6:
			dripIceMocca();
			break;
		default:
			System.out.println("해당모드가 없습니다.");
			break;
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
					startBasicMode();
				}
			}
			else if(selector == 2) {
				System.out.print("관리자모드를 실행합니다.");
				System.out.print("");
			}
		}
	}
}
		