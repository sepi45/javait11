package day03;

import java.util.Scanner;

public class If5 {
	public static void main(String[] args) {
		// 윤년구하는 프로그램
		// 년도를 입력받고 윤년인지 아닌지 판별해주는 프로그램
		// 해당년도가 4로 나누어 떨어지고 100으로 떨어지지 않으면 윤년
		// 400으로 나누어 떨어지면 무조건 윤년
		//2012 : 윤년(4의 배수 || 100의 배수)
		//2200 : 운년이 아님(100의 배수)
		//2013 : 윤년이 아님(!4의배수)
		
		Scanner sc = new Scanner(System.in);
		int year = 0;
		System.out.println("년도를 입력");
		year = sc.nextInt();
		
		if(year%4 == 0 && year %100 !=0 ||year%400==0) {
			System.out.println("윤년입니다");
			
		}
		else {System.out.println("아닙니다");}
	}
}
