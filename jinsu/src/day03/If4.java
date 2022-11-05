package day03;

import java.util.Scanner;

public class If4 {
	public static void main(String[] args) {
		//국영수
		//각각 40점 이상이고
		//총 합이 150이상이면
		//'합격
		//그 외에는 불합격
//		int 국어 = 50;
//		int 영어 = 50;
//		int 수학 = 49;
//		if(국어+영어+수학>=150) {System.out.println("합격입니다");
//		}
//		else if(국어+영어+수학<150) { System.out.println("불합격");
//		}
//		else if (국어<40) {System.out.println("불합격");}
//		else if (영어<40) {System.out.println("불합격");}
//		else if (수학<40) {System.out.println("불합격");}
//		System.out.println("=============================");
		Scanner sc = new Scanner(System.in);
		int 국어, 영어, 수학, 총합;
		System.out.println("국어점수");
		국어 = sc.nextInt();
		System.out.println("영어점수");
		영어 = sc.nextInt();
		System.out.println("수학점수");
		수학 = sc.nextInt();
		
		총합 = 국어 + 영어 + 수학;
		if (국어 >= 40 && 영어>= 40 && 수학 >= 40 && 총합 >=150) {
			System.out.println("합격");
		}else{System.out.println("불합격");
		}
		}
		
		
	}
		
		
	

