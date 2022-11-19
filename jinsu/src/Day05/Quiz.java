package Day05;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		String nations[] = {"한국", "미국", "중국", "일본"};
		String cities[] = {"서울", "워싱턴", "베이징", "도쿄"};
		
		Scanner sc= new Scanner(System.in);
		String in;
		
		while(true) {
			System.out.print("어느나라의 수도가 궁금합니까?");
			in = sc.next();
			int idx = -1;
			
			for(int i=0; i<nations.length; i++) {
				if(in.equals(nations[i])) {
					idx= i;
				}
			}
			
			if(in.equals("0")) {
				System.out.println("프로그램 종료");
				break;
				
			}
			
			if(idx !=-1) {
				System.out.println(nations[idx]+"의 수도는"+cities[idx]+"입니다");
			}else {
				System.out.println("해당국가가 없습니다.");
			}
		}
	}
}
