package day03;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		
		String job=""; int salary=0;
				Scanner scanner = new Scanner(System.in);
				System.out.println("직급을 입력하세요");
				job = scanner.next();
				switch(job) {
				case "사원":
					salary = 2800;
					break;
				case "대리":
					salary = 3600;
					break;
				case "과장":
					salary = 3800;
					break;
				case "차장":
					salary = 4800;
					break;
				case "부장":
					salary = 5800;
					break;
					default:
						salary = 0;
					System.out.println("연봉은"+salary+"입니다");
					
				}
	}
}
