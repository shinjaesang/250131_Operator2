package test.operator.run;

import test.operator.sample.AssignmentOperator;
import test.operator.sample.BitOperator;
import test.operator.sample.OperatorSample;
import test.operator.sample.TernaryOperator;

public class TestOperator {
	
	public static void main(String[] args) {
//		연산자 실행 테스트용
//		클래스가 제공하는 기능(메소드 == 멤버함수)을 실행(작동) 시키려면
//		클래스에 대한 객체 생성 => 생성된 객체의 주소를 가지고 메소드를 구동시킴
//		클래스 객체 생성 구문: 클래스(래퍼런스타입)명 래퍼런스(주소,참조)변수 = new 클래스생성자();
		
		OperatorSample samp = new OperatorSample();
		
//		클래스가 가진 기능(메소드)를 작동(호출: call) 시키는 문장
//		래퍼런스변수.메소드명(.....); 또는 자료형 변수 = 래퍼런스변수.메소드명(....);
//		System.out.println("samp가 가진 주소: " + samp.hashCode());
//		System.out.println(samp.toString());
//		samp.testComma();
//		samp.testLogical();
		samp.testRandom();
		
		TernaryOperator ternaryOperator = new TernaryOperator();
		
//		ternaryOperator.testAbs();
//		ternaryOperator.testAlphabettic();
//		ternaryOperator.testIntegral();
//		ternaryOperator.testExample();
//		ternaryOperator.testPractice1();
//		ternaryOperator.testQuestion();
		
//		System.out.println("main() 종료됨");
		
		AssignmentOperator test = new AssignmentOperator();
//		test.testAssignment();
//		test.testArithmeticAssign();
		
		BitOperator bitTest= new BitOperator();
//		bitTest.testBit();
	}
}
