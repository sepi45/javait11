package Day04;

public class Array1 {
	public static void main(String[] args) {
		String name ="이름";
		int age =12;
		double height =111.1;
		
		
/*
 * 		//하나의 주제로 변수들을 묶고싶을때
		String menu1 = "에스프레소";
		String menu2 = "아메리카노";
		String menu3 = "카페라떼";
		String menu4 = "카페모카";
		String menu5 = "오렌지쥬스";
		String menu6 = "케모마일";
		String menu7 = "쌍화차";
		System.out.println(menu[0]);
		System.out.println(menu[1]);
		System.out.println(menu[2]);
		System.out.println(menu[3]);
		System.out.println(menu[4]);
		System.out.println(menu[5]);
		System.out.println(menu[6]);
 */
		
		String[]menu= {"에스프레소","아메리카노","카페라떼","카페모카","오렌지쥬스","케모마일차","쌍화차"};
	
	for(int i=0;i<7;i++) {
		System.out.println(menu[i]);
	}
	}
}
