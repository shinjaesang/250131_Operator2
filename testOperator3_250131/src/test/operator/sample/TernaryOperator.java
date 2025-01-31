package test.operator.sample;

import java.util.Scanner;

/**
 * 삼항 연산자(ternary operator) 연습용 클래스
 * 항목이 3개로 표현되는 연산자, 13순위
 * 첫번째항목 ? 두번째항목 : 세번째항목
 * 조건표현식 ? 조건의 결과가 참일 때 선택할 값 : 조건의 결과가 거짓일 때 선택할 값(false)일 때 선택할 값
 * 자료형 변수명 = (조건표현식) ? 값1 : 값2;
 * 다른 문장의 부분 사용 가능: 선택된 값을 사용하는 구문에 적용함
 * 조건표현식은 반드시 결과가 true | false 가 나오게끔 작성해야 함
 * 일반 산술계산식(true | false 의 결과가 아닌 식) 등은 사요할 수 없음(에러임)
 */
public class TernaryOperator {
	//	Field (필드: 멤버변수)
	//	Constructor(생성자 함수) => 클래스 앙네 생성자가 하나도 없으면, 컴파일 시에 자동 기본생성자 추가함
	//	public TernaryOperatort() {}
	//	Method(멤버 함수)
	//	위의 3가지(선택) 멤버로 클래스 내부를 채움
	// 메소드 작성 규칙: 
	//	접근제한자(public->캡슐화에 영향을 줌) [예약어(생략가능)] 반환자료형 메소드명([자료형 변수명, .......(필요할 경우 여러가지 작성 가능)]) {	소스코드 구문}
	//	반환자료형: 반환(return)되는 값의 자료형을 표기함, return 10; -> int 가 반환자료형임
	//	void:  반환되는 값 없다를 의미 return;
	//	import는 public으로 생성된 클래스만 가능
	
	/**
	 * 정수 1개를 키보드로 입력받아, 그 수의 절대값을 출력
	 * 정수:  음수, 0, 양수
	 * 			1씩 차이나는 수, 소숫접 아래값 취급 안 함
	 * 절대값(absolute): 모든 정수의 양수화(음수 --> 양수로 바꿈, 0과 양수는 그대로 처리)
	 */
	public void testAbs() {
		System.out.print("정수 입력: ");
		int num = new Scanner(System.in).nextInt();
		
		System.out.println(num + "의 절대값: " + ((num < 0) ? -num : num));
		return;		//생략할 수 있음, 생략하면 컴파일 시에 jvm에 의해 자동 추가됨
//		모든 메소드 맨 마지막에는 return 문이 존재해야 함
//		System.out.println(); --> Unreachable code(에러 내용)
//		return 문 다음에는 코드가 존재할 수 없음
//		void와 return 은 한 세트라고 생각하면 됨
	}
	
	/**
	 * 문자하나를 키보드로 입력받아서, 영어소문자이면 "Lower" 출력
	 * 영어대문자이면 "Upper" 출력, 숫자문이면 "Numeric" 출력
	 * 그 외의 문자는 "Etc" 출력
	 * 삼함연산자 중첨 사용 가능: 
	 * ((조건1)? 조건1이 참일 때 선택값 : (조건 2) ? 조건2가 참일 때 선택값 :  
	 * (조건3) ? 조건 3이 참일 때 선택값 : (조건 4) ? 조건 4가 참일 때 선택값 : 모든 조건이 false일 때 선택값))
	 * false인 자리에 다른 조거느이 삼항연산자를 또 사용할 수 있음(횟수 제한 없음)
	 */
	public void testAlphabettic() {
		System.out.print("문자 하나 입력: ");
		char ch = new Scanner(System.in).next().charAt(0);
		
		String result = ((ch >= 'a' && ch <= 'z' ) ? "Lower" : 
									(ch >= 'A' && ch <='Z') ? "Upper" : 
											(ch >= '0' && ch<= '9') ? "Numeric" : "Etc");
		
		System.out.println(ch + "은/는 " + result);
		return;
	}
	
	/**
	 * 삼항연산자 중첩 사용 테스트 2
	 * 정수 하나 입력받아서 양수이면 "Positive",
	 * 음수이면 "Negative", 0이면 "Zero" 출력 처리
	 */
	public void testIntegral() {
//		메소드 안 코딩 작성 순서: 
//		1. 변수 선언과 값 대입(기록) 처리

		System.out.print("숫자 하나 입력: ");
		int num1 = new Scanner(System.in).nextInt();

//		2. 준비된 변수안의 값에 대한 계산 처리: 연산자와 제어문 사용
		String result1 = ((num1 > 0) ? "Positive" :
									(num1 < 0) ? "Negative" : "Zero");
//		3. 계산 결과 처리: 출력 확인 또는 리턴
		System.out.println(num1 + "은/는" + result1);
		return;
	}
	/**
	 * 학생정보 입력 받아서, 성적에 대한 등급 처리하고 출력
	 * 국어점수, 영어점수, 수학점수 키보드로 입력 받아서 (kor, eng, mat :int)
	 * 총 점(tot: int), 평균(avg: double)을 구하고 
	 * 평균을 가지고 등급(grade: char)을 구하고 
	 * 출력 처리: 국어점수, 영어점수, 수학점수, 총점, 평균(소숫점아래 첫째자리까지만 출력), 등급
	 * 
	 * 평균에 대한 등급 기준:
	 * 평균이 90 이상이면 'A'
	 * 			 80 이상 90 미만이면 'B'
	 * 			 70 이상 80 미만이면 'C'
	 * 			 60 이상 70 미만이면 'D'
	 * 			 60 미만은 'F' 
	 */
	
public void testExample() {
//		1. 변수 선언과 값 기록( 키보드 입력)
		Scanner sc = new Scanner(System.in);
		
//		2. 기록된 변수값 사용해서 계산 처리
		System.out.print("국어점수 입력:");
		int kor = sc.nextInt();
		System.out.print("영어점수 입력:");
		int eng = sc.nextInt();
		System.out.print("수학점수 입력:");
		int mat = sc.nextInt();
		
		int tot = kor + eng + mat;
		double avg = tot/3.0;

//		평균에 대한 등급 처리
		char grade = ((avg >= 90) ? 'A' :
								(avg >= 80 && avg < 90) ? 'B' :
									(avg >= 70 && avg < 80) ? 'C' :
										(avg >= 60 && avg < 70) ? 'D' : 'F');
//		char grade = (avg >= 90) ? 'A' : ((avg >= 80 ) ? 'B' : ((avg >= 70) ? 'C' : ((avg >= 60) ? 'D' : 'F')));
		
//		3. 결과 출력 또는 결과 반환 
		System.out.println();
		System.out.println("국어점수: " + kor);
		System.out.println("영어점수: " + eng);
		System.out.println("수학점수: " + mat);
		System.out.println("총 점수: " + tot);
		System.out.println("평균 점수: " + avg);
//		System.out.println("평균 점수: " + (int)(avg * 10) / 10.0);
		System.out.println("등급: " + grade);
		
		return;
		
//		강사님 코드
//		System.out.println(kor + ", " + eng + ", " + mat + ", " + tot + ", " + ((int)(avg * 10) / 10.0) + ", " + grade);
//		//또는 printf() 사용하여 format 적용 출력
//		System.out.printf("%d, %d, %d, %d, %.1f, %c \n", kor, eng, mat, tot, avg, grade);
//		return; // 반환값 없음 => void
	}

	/**
	 * 삼항연산자 연습 2
	 * 수험생의 이름과 점수를 입력받아서
	 * 점수가 60이상이면 "합격입니다. 축하합니다.", 
	 * 아니면 "불합격입니다. 다음 기회에 분발합시다."
	 * 문자열 변수에 저장하고 나서 출력
	 * 출력 예: 홍길동님, 
	 * 				홍길동님, 
	 * 출력도 삼항연산자 적용함
	 */
	public void testPractice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수험생 이름: ");
		String name = sc.next();
		System.out.print("점수 입력:");
		int score = sc.nextInt();
		
		String result = ((score >= 60) ? "합격입니다. 축하합니다." : "불합격입니다. 다음 기회에 분발합시다." );
		
		System.out.println(name + "님 " + result);
		return;
	}
	
	
	/**
	 * 삼항 연산자 연습 3
	 * 문자하나를 입력받아 출력 처리
	 * "프로그램을 종료하시겠습니까? (종료: y, 취소: n) : "
	 * 대소문자 상관없이 'y' 이면 프로그램을 종료처리
	 * 'y'가 아니면 종료 취소 처리 => "프로그램 계속 진행 중입니다." 출력되게 함
	 * 프로그램 종료 처리 방법 1: java.lang.System 클래스에 exit(정수 0) 메소드 사용
	 * 프로그램 종료 처리 방법 2: main() 까지 리턴 처리(권장 사항)
	 */
	public void testQuestion() {
		System.out.print("프로그램을 종료하시겠습니까? (종료: y, 취소: n) : ");
//		char answer = new Scanner(System.in).next().charAt(0);
		char answer = new Scanner(System.in).next().toUpperCase().charAt(0);
		
//		String shutdown = (answer == 'y' || answer =='Y') ? "프로그램이 종료됩니다." : "프로그램 계속 진행 중 입니다.";
		
//		삼항연산자는 계산한 결과값을 선택하는 연산자임
//		삼항연산자에서 참과 거짓일 때 선택할 값부분에 실행항 구문을 작성하면 에러남
//		해결: if 문을 사용
//		String shutdown = (answer == 'y' || answer =='Y') ? System.exit(0) : System.out.println("프로그램 계속 진행 중 입니다.");
		
//		System.out.println(shutdown);
		
		if(answer == 'Y') {
//			괄호 안의 결과가 true일 때 실행할 구문 작성
//			System.out.println("프로그램이 종료됩니다.");
//			System.exit(0);
//			return;
		}else { //바로 위의 조건이 false이 때 실행할 구문 작성
			System.out.println("프로그램 계속 진행 중 입니다.");
		}
		
		return;
		
	}
}
