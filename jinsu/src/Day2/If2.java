package Day2;

public class If2 {
	public static void main(String[] args) {
		int age = 21;
		int money = 0;
		if(14 > age) {
			System.out.println("어린이");
			money = 400;
		}
		else if(age<20) {
			System.out.println("청소년");
			money = 650;
		}
		else {
			System.out.println("성인");
			money = 1000;
		}
		System.out.println("금액 "+money+"원");
	}
	
}
