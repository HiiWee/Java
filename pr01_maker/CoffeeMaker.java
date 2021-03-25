package pr01_maker;

import java.util.Scanner;
public class CoffeeMaker {
	//Ŀ�� ���� ���� �迭, ������� ����, ��, ����, ����, ���ݸ�
	static int[] container = {10, 10, 10, 10, 10};
	static String[] leftContainer = {"CoffeeBean", "Water", "Ice", "Milk", "Chocolate"};
	static int selector;
	
	// Ŀ�� ������ ���� ���ϴ� �Լ� putSmallCoffeeBean, putMediumCoffeeBean, putLargeCoffeeBean
	public static void putSmallCoffeeBean() {
		// ����Ŀ�� ���� 1�Ҹ�
		if(container[0]-1 < 0)
			System.out.println("���ΰ� �����մϴ�.");
		else {
			System.out.println("���θ� �����մϴ�.");
			container[0] -= 1;
		}
	}
	
	public static void putMediumCoffeeBean() {
		// ���� Ŀ�� ���� 2�Ҹ�
		if(container[0]-2 < 0)
			System.out.println("���ΰ� �����մϴ�.");
		else {
			System.out.println("���θ� �����մϴ�.");
			container[0] -= 2;
		}
	}
	
	public static void putLargeCoffeeBean() {
		//  ���� Ŀ�� ���� 2�Ҹ�
		if(container[0]-3 < 0)
			System.out.println("���ΰ� �����մϴ�.");
		else {
			System.out.println("���θ� �����մϴ�.");
			container[0] -= 3;
		}
	}
	
	public static void putWater() {
		if(container[1]-2 < 0)
			System.out.println("���� �����մϴ�.");
		else {
			System.out.println("���� �ֽ��ϴ�.");
			container[1] -= 2;
		}
	}
	
	public static void putIce() {
		if(container[2]-2 < 0)
			System.out.println("������ �����մϴ�.");
		else {
			System.out.println("������ �ֽ��ϴ�.");
			container[2] -= 2;
		}
	}
	
	public static void makeAmericano(int num) {
		
		if(num==1) {
			System.out.println("[�Ƹ޸�ī��]\n");
			putMediumCoffeeBean();
			putWater();
			System.out.print("�Ƹ޸�ī�밡 �ϼ� �ƽ��ϴ�!\n");
		}
		else if(num==2) {
			System.out.println("[���̽� �Ƹ޸�ī��]\n");
			putMediumCoffeeBean();
			putWater();
			putIce();
			System.out.print("���̽� �Ƹ޸�ī�밡 �ϼ� �ƽ��ϴ�.\n");
		}
	}
	public static void makeBasicCoffee() {
		System.out.print("�⺻ ���� Ŀ�Ǹ� �����մϴ�.\n");
		System.out.print("Ŀ�Ǹ� ����ּ��� \n1.[Americano] 2.[Latte] 3.[Mocca]\n");
		System.out.print("4.[Ice Americano] 5.[Ice Latte] 6.[Ice Mocca]\n>>");
		
		Scanner scan = new Scanner(System.in);
		selector = scan.nextInt();
		switch(selector) {
		case 1:
			makeAmericano(1);
			break;
		case 2:
			// �۾��Ͻ����� 2021.03.25.11:32
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
					makeBasicCoffee();
				}
			}
			else if(selector == 2) {
				System.out.print("�����ڸ�带 �����մϴ�.");
				System.out.print("");
			}
		}
	}
}
		