package test.operator.sample;

import java.util.Random;
import java.util.Scanner;

public class OperatorSample {
	
	/**
	 * 나열 연산자: 우선 순위 15순위임
	 * 항목들을 나열할 때 사용
	 */
	public void testComma() {
//		int a = 10;
//		int b = 20;
//		int c = 30;
		
//		같은 자료형 변수가 여러 개 선언이 될 경우, 나열 연산자 사용해서 한번에 선언할 수 있음
//		int a = 10, b = 20, c = 30;
		
		int a = 10, b, c = 30;
		b = 20;
		
		System.out.println(a + ", " + b + ", " + c);
		return;
	}
	
	/**
	 * 일반 논리 연산자의 성질
	 * 논리표현식 && 논리표현식: 앞의 결과가 false이면 뒤를 실행 안 함
	 *  논리표현식 || 논리표현식: 앞의 결과가 true이면 뒤를 실행 안 함
	 *  
	 *  비트 논리연산자로 논리식을 작성해도 됨, 연산처리 속도가 일반논리연산자보다 느림
	 *  논리표현식 & 논리표현식: 뒤까지 다 실행하고 결과 도출
	 *  논리표현식 | 논리표현식:  뒤까지 다 실행하고 결과 도출
	 */
	 public void testLogical() {
		 System.out.print("정수 입력: ");
		 int num = new Scanner(System.in).nextInt();
		 
		 String result = (num >= 1 && num++ <= 100)? "1~100 사이의 값이다" : "1~100 사이의 값이 아니다";
			 
		System.out.println(result);
		System.out.println("num: " + num); //1증가된 값이면 뒤가 실해됨, 
	 }
	 
	 /**
	  * 자바에서 랜덤값(임의의 난수: cpu가 만드는 아무 값을 의미함)
	  * 방법 1: java.lang.Math 클래스의 random() 메소드 사용(static)
	  * 방법 2: java.util.Random 클래스의 메소드를 이용
	  */
	 public void testRandom() {
		 System.out.println("랜덤값: " + Math.random()); //0.0 <= r <1.0
//		 Math.random() 으로 1~100 사이의 정수 발생한다면
//		 원하는 범위의 정수를 만들려면:  (int)(Math.random() * (끝값 - 시작값 + 1)) + 시작값
		 int value = (int)(Math.random() * 100) + 1;
		 System.out.println("value: " + value);
		 
//		 51~100 사이의 정수를 팬덤하게 발생시킨다면
		 value = (int)(Math.random() * 50) + 51;
		 System.out.println("value: " + value);
		 
		 Random r = new Random();
		 int num = r.nextInt(100); //0~99 사이의 정수를 하나 발생시킴, 1~100 사이의 값으로 변경하고 싶으면 + 1을 추가
//		 int num = r.nextInt(100) + 1;
		 System.out.println(num);
		 
//		 51~100 사이의 랜덤 정수 발생한다면
		 num = r.nextInt(50) + 51;
		 System.out.println(num);
	 }
}
