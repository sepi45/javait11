package day03;

import java.util.Scanner;

public class If1 {
	public static void main(String[] args) {
		//if, switch
		// 외부 조건에 따라서 프로그램 동작을 다르게 하고 싶을때
		
		// if(){}
		// ()안에 내용이 맞으면 {}를 실행
		// ()안에 내용이 틀리면 {}를 무시
		
//		int age = 18;
//		if(age>=20) {
//			System.out.println("성인입니다");
//		}else {System.out.println("미성년자입니다");}
		

		//입력(사용자가 값을 제공)
		Scanner sc = new Scanner(System.in);
		
		//입력을 받으려면 변수가 있어야함
		int 숫자1=0;
		double 숫자2 = 0.0;
		String 글자1 = null;
		
		//입력받기(키보드)
		System.out.println("정수를 입력하세요");
		숫자1 =sc.nextInt();
		System.out.println("문자를 입력하세요");
		글자1 =sc.next();
		System.out.println("실수를 입력하세요");
		숫자2 = sc.nextDouble();
		
		System.out.println(숫자1);
		System.out.println(글자1);
		System.out.println(숫자2);
		
		if(숫자1==10) {
			System.out.println("입력한 숫자는 10입니다");
			if(숫자2==3.14) {
				System.out.println("입력한 실수는 3.14입니다");
				if(글자1.equals("비교대상"))
					//String
					System.out.println("입력한 문자열은 비교대상입니다");
			}
			sc.close();
			
		}
	}
}
			
			
		
	

