package pr01_maker;

import java.util.Scanner;
public class CoffeeMaker {
	//Ŀ�� ���� ���� �迭, ������� ����, ��, ����, ����, ���ݸ�
	static int[] container = {10, 10, 10, 10, 10};
	static final int BEAN=0; 	static final int WATER=1;	static final int ICE=2; 
	static final int MILK=3;	static final int CHOCOLATE=4;
	static String[] leftContainer = {"CoffeeBean", "Water", "Ice", "Milk", "Chocolate"};
	static int selector;
	
	// Ŀ�� ������ ���� ���ϴ� �Լ� putSmallCoffeeBean, putMediumCoffeeBean, putLargeCoffeeBean
	public static int putSmallCoffeeBean() {
		// ����Ŀ�� ���� 1�Ҹ�
		if(container[BEAN]-1 < 0) {
			System.out.println("���ΰ� �����մϴ�.");
			return 0;
		}
		else {
			System.out.println("���θ� �����մϴ�.");
			container[BEAN] -= 1;
			return 1;
		}
	}
	
	public static void putMediumCoffeeBean() {
		// ���� Ŀ�� ���� 2�Ҹ�
		if(container[BEAN]-2 < 0) {
			System.out.println("���ΰ� �����մϴ�.");
		}
		else {
			System.out.println("���θ� �����մϴ�.");
			container[BEAN] -= 2;
		}
	}
	
	public static void putLargeCoffeeBean() {
		//  ���� Ŀ�� ���� 2�Ҹ�
		if(container[BEAN]-3 < 0)
			System.out.println("���ΰ� �����մϴ�.");
		else {
			System.out.println("���θ� �����մϴ�.");
			container[BEAN] -= 3;
		}
	}
	
	public static void putWater() {
		if(container[WATER]-2 < 0)
			System.out.println("���� �����մϴ�.");
		else {
			System.out.println("���� �ֽ��ϴ�.");
			container[WATER] -= 2;
		}
	}
	
	public static void putIce() {
		if(container[ICE]-2 < 0)
			System.out.println("������ �����մϴ�.");
		else {
			System.out.println("������ �ֽ��ϴ�.");
			container[ICE] -= 2;
		}
	}
	
	public static void putMilk() {
		if(container[MILK]-3 < 0)
			System.out.println("������ �����մϴ�.");
		else {
			System.out.println("������ �ֽ��ϴ�.");
			container[MILK] -= 3;
		}
	}
	
	public static void putChocolate() {
		if(container[CHOCOLATE]-2 < 0)
			System.out.println("���ݸ��� �����մϴ�.");
		else {
			System.out.println("���ݸ��� �ֽ��ϴ�.");
			container[CHOCOLATE] -= 2;
		}
	}
	
	public static void dripAmericano() {
		System.out.println("[�Ƹ޸�ī��]");
		putMediumCoffeeBean();
		putWater();
		System.out.println("�Ƹ޸�ī�밡 �ϼ� �ƽ��ϴ�!");
	}
	
	public static void dripIceAmericano() {
		System.out.println("[���̽� �Ƹ޸�ī��]");
		putMediumCoffeeBean();
		putWater();
		putIce();
		System.out.print("���̽� �Ƹ޸�ī�밡 �ϼ� �ƽ��ϴ�.\n");
	}
	
	public static void dripLatte() {
		System.out.println("[ī���]");
		putLargeCoffeeBean();
		putMilk();
	}
	
	public static void dripIceLatte() {
		System.out.println("[���̽� ī���]");
		putLargeCoffeeBean();
		putMilk();
		putIce();
	}
	
	public static void dripMocca() {
		System.out.println("[ī���ī]");
		putMediumCoffeeBean();
		putChocolate();
		putWater();
	}
	
	public static void dripIceMocca() {
		System.out.println("[���̽� ī���ī]");
		putMediumCoffeeBean();
		putChocolate();
		putWater();
		putIce();
	}
	
	public static void startBasicMode() {
		System.out.print("�⺻ ���� Ŀ�Ǹ� �����մϴ�.\n");
		System.out.print("Ŀ�Ǹ� ����ּ��� \n1.[Americano] 2.[Latte] 3.[Mocca]\n");
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
			System.out.println("�ش��尡 �����ϴ�.");
			break;
		}
	}
	
	 
	public static void main(String[] args) {
		// �迭�� ����� �� �������
		final int coffee=0; final int milk=1;
		final int ice=2; final int chocolate=3;

		Scanner scan = new Scanner(System.in);
		// �������� �����ϴ� �Ҹ���
		boolean play_f = true;

		while(play_f) {
			System.out.print("Ŀ�� �ӽ��� �����մϴ�.");
			System.out.print("[1]Ŀ������  [2]�����ڸ�� ");
			selector = scan.nextInt();
			
			if(selector == 1) {
				System.out.print("Ŀ�������� �����մϴ�. ��带 �����ϼ���");
				System.out.print("[1]�⺻ ���  [2]Ŀ���� ���");
				selector = scan.nextInt();
				
				if(selector == 1) {
					startBasicMode();
				}
			}
			else if(selector == 2) {
				System.out.print("�����ڸ�带 �����մϴ�.");
				System.out.print("");
			}
		}
	}
}
		