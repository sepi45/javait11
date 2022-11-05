package day03;

public class Review {
	public static void main(String[] args) {
		System.out.println("Hello java");
		//프로그램 언어는 수정에 초점
		// 변수 : 저장공간. 자주 변경될, 혹은 자주 사용될 데이터를 저장(재활용, 값 수정)
		//변수 선언(생성)
		//자료형 변수명;
		String 변수1;		//문자열
		int 변수2;			//정수
		double 변수3;		//실수(소수점)
		// 변수 대입(값넣기) : = 을 사용해서 값을 넣음
		변수1 = "java";
		변수2 = 123;
		변수3 = 3.14;
		
		//변수 초기화(선언과 대입을 동시에)
		String 변수4 = "선언과 동시에 대입";
		
		//변수사용 : 변수명을 적어줌. 변수 안에 들어있는 값이 사용됨
		System.out.println(변수4);
		변수4=변수1;		//오른쪽에 잇는 것은 값사용, 왼쪽에 있는것은 공간
		System.out.println(변수4);
		
		//연산자
		// == 같다
		System.out.println(변수1!=변수4);
		
		// != 다르다 > < >= <=
		//+ - * / %
		//+= -= *= /= %=
		// ++ --
		// && || !
		
		
		//누적/증감연산
		int num1 = 0;
		int num2 = 0;
		num1 = num1 + 2;
		System.out.println(num1);
		
		num2 += 2;
		System.out.println(num2);
		
		//자료형변환 (정수 <->실수)
		int 정수1 = 3;
		double 실수1 = 3.14;
		
		System.out.println(정수1);
		System.out.println(실수1);
		System.out.println("======형변환=======");
		System.out.println((double)정수1);
		System.out.println((int)실수1);
		
		/*
		 정수 / 정수 == 정수
		 실수 / 정수 == 실수
		 실수 / 실수 =- 실수
		 */
		
		
	}
}
