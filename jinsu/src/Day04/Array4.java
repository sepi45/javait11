package Day04;

import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		
	//국가, 수도
		String nations[]= {"미국","한국","일본","중국"};
		String cities[]= {"워싱턴","서울","도쿄","베이징"};
		String in;		//사용자로부터 입력받은 값을 저장할 변수
		int idx;		//입력받은 문자열의 값과 동일한 문자열의 위치를 백업해둘 변수
		
		Scanner sc= new Scanner(System.in);
		String answer = null;
		while(true) {
			System.out.println("국가 이름");
			answer = sc.next();
			if(answer.equals(nations[0]))
				System.out.println(cities[0]);
			if(answer.equals(nations[1]))
				System.out.println(cities[1]);
			if(answer.equals(nations[2]))
				System.out.println(cities[2]);
			
				
		}	
	}
}
