package logic.controller;

import java.util.Random;
import java.util.Scanner;

public class Function {
	public void calculator() {
		Scanner sc = new Scanner(System.in);
		 System.out.print("첫 번째 정수 입력: ");
		 int fnum = sc.nextInt();
		 System.out.print("두 번째 정수 입력: ");
		 int scnum = sc.nextInt();
		 System.out.print("연산문자(+,-,x,/): ");
		 char operator = sc.next().charAt(0);

		 switch (operator) {
			case '+':
				System.out.println(fnum + scnum);
				break;
			case '-':
				System.out.println(fnum - scnum);
				break;
			case 'x':
				System.out.println(fnum * scnum);
				break;
			case '/':
			    if(scnum == 0){
					System.out.println("0으로 나눌 수 없습니다.");
					int zero = scnum * 0;
					System.out.println("결과값: " + zero);
				}else{
					System.out.println(fnum / scnum);
				}
				
				break;
		 }
	}
	public void totalCalculator(){
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 정수 ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 ");
		int num2 = sc.nextInt();

		int sum = 0;

		for(int i = num1; i <= num2; i++){
			sum += i;
		}

		System.out.println(num1 + "부터 " + num2 + "의 합은 " + sum + "입니다.");
		System.out.println();
	}

	public void profile(){
		Scanner sc = new Scanner(System.in);

		System.out.print("이름: ");
        String name = sc.next();
        System.out.print("나이: ");
        int age = sc.nextInt();
        System.out.print("성별(남/여): ");
        char gender = sc.next().charAt(0);
		System.out.print("성격: ");
		String personality = sc.next();
		System.out.println();

		System.out.println();
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("성별: " + gender);
        System.out.println("성격: " + personality);
		System.out.println();
	}

	public void sungjuk(){
		Scanner sc = new Scanner(System.in);

		System.out.print("학생이름: ");
		String name = sc.next();
		System.out.print("학년: ");
		int grade = sc.nextInt();
		System.out.print("반: ");
		int ban = sc.nextInt();
		System.out.print("번호: ");
		int num = sc.nextInt();
		System.out.print("성별(M/F): ");
		char gender = sc.next().charAt(0);
		System.out.print("성적: ");
		double score = sc.nextDouble();
		
		char credit = (score >= 90) ? 'A' :
						((score >= 80 ) ? 'B' :
						((score >= 70) ? 'C' :
						((score >= 60) ? 'D' : 'F')));

		String gender2 = (gender == 'M') ? "남학생" : "여학생";
		// 강사님 코드 확인해보기

		System.out.println(grade + "학년 " + ban + "반 " + 
							num + "번 " + gender2 + 
							name + "의 점수는 " + ((int)(score * 10) / 10.0) + "이고, " + 
							credit + "학점입니다.");

		System.out.println();
	}

	public void sumRandomNumber(){
		Random random = new Random();
		int value = random.nextInt(100) + 1;

		System.out.println(value);

		int sum = 0;
		for(int i = 1; i <= value; i++){
			sum += i;
		}

		System.out.println("1부터 발생된" + value +"까지의 합: " + sum);
		System.out.println();
	}

	public void continueGugudan(){
        System.out.print("구구단을 출력할 단(1~9): ");
        int dan = new Scanner(System.in).nextInt();

		if(dan < 0){
			System.out.println("양수가 아닙니다.");
			return;
			// return을 통해 음수가 입력되면 메소드 실행 종료되도록 설정
		}

		for(int i = 1; i <= 9; i++){
			if(i%dan == 0){
				continue;
			}
			System.out.println(dan + " * " + i + "= " + (dan * i));
			System.out.println();
		}
	}

	public void shutNumber(){
		Scanner sc = new Scanner(System.in);
		System.out.print("예상되는 두 주사위의 합을 입력하시오(2~12): ");
		int input = sc.nextInt();
		do{
			int dice1 = (int)(Math.random() * 6) + 1;
			System.out.println("1번 주사위의 숫자: " + dice1);
			int dice2 = (int)(Math.random() * 6) + 1;
			System.out.println("2번 주사위의 숫자: " + dice2);

			int dSum = dice1 + dice2;

			System.out.println("두 주사위의 합: " + dSum);

			if(input != dSum){
				System.out.println("틀렸습니다.");
				System.out.println("계속 하시겠습니까?(Y/N)");
				char answer = sc.next().charAt(0);
				if(answer == 'N' || answer == 'n'){
					System.out.println("게임을 종료합니다.");
                    return;
				}
			}else{
				System.out.println("틀렸습니다.");
			}
		}while(true);
		

		

	}

}
