package Day04;

import java.util.Scanner;

public class Flow3 {
	public static void main(String[] args) {
		//대한민국수도맞추기
		
		//무한반복-입력-맞추면 break
		Scanner sc= new Scanner(System.in);
		String answer = null;
		while(true) {
			System.out.println("대한민국의 수도는?");
			answer = sc.next();
			//answer.equals("서울")
			if(answer.equals("서울"))
				System.out.println("정답");
		}
	}
}
	
	
