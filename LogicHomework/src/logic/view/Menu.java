package logic.view;

import java.util.Scanner;

import logic.controller.Function;

public class Menu {
	public static void displayMenu() {
		Function func = new Function();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("*** 지역변수/연산자/제어문 연습 프로그램 ***");

			System.out.println("1. 간단 계산기");
			System.out.println("2. 작은수에서 큰수까지 합계구하기");
			System.out.println("3. 신상정보 확인하기");
			System.out.println("4. 학생정보 확인하기");
			System.out.println("5. 난수까지의 합게 구하기");
			System.out.println("6. 구구단");
			System.out.println("7. 주사위 숫자 알아맞추기 게임");
			System.out.println("9. 프로그램 종료");
			
			System.out.println("메뉴 번호 입력 : ");
			
			int no = sc.nextInt();
			
			switch(no) {
			case 1: func.calculator(); 			break;
			case 2: func.totalCalculator();		break;
			case 3: func.profile(); 			break;
			case 4: func.sungjuk(); 			break;
			case 5: func.sumRandomNumber(); 	break;
			case 6: func.continueGugudan(); 	break;
			case 7: func.shutNumber(); 			break;
			case 9: return;
			}
		} while(true);
	}
}
