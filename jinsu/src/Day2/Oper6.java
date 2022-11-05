package Day2;

public class Oper6 {
	public static void main(String[] args) {
		// 연산자 (연산기호)
				//1. 산술연산자 : + - * / %
				//2. 대입연산자 : =
				//3. 누적연산자 : += -= *= /=
				//4. 증감연산자 : ++ --
				//5. 비교연산자 : > < >= <= == !=
				//6. 논리연산자 : && || !
		
		// && : and(앞 뒤 모두 true 여야만 true)
		// || : or (앞 또는 뒤 둘중 하나만 true여도 true)
		// !  : not (boolean 값을 반대로 바꿈)
		boolean tst = !true;  //false
		//System.out.println(tst);
		
		boolean 참 = true;
		boolean 거짓 = false;
		
		// &&
		System.out.println(참 && 참);
		System.out.println(참 && 거짓);
		System.out.println(거짓 && 참);
		System.out.println(거짓 && 거짓);
		
		//청소년 : 14이상 ~ 20미만
		System.out.println("나이");
		int age = 21;
		System.out.println(age >= 14&& age <20);
		
		System.out.println("||");
		// ||
		System.out.println(참 || 참);
		System.out.println(참 || 거짓);
		System.out.println(거짓 || 참);
		System.out.println(거짓 || 거짓);
		System.out.println("키");
		//키가 150cm이상이거나 나이가 15이상이면 통과
		double height =160.0;
		System.out.println(height >= 150 || age >= 15);
		
		// ! 반대로
		System.out.println(!참);
		System.out.println(!거짓);
		
		System.out.println("=================");
		
		int x = 100, y = 200;
		
		
		
		
		
	}
}
