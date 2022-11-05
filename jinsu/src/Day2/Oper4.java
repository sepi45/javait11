package Day2;

public class Oper4 {
	public static void main(String[] args) {
		// 연산자 (연산기호)
		//1. 산술연산자 : + - * / %
		//2. 대입연산자 : =
		//3. 누적연산자 : += -= *= /=
		//4. 증감연산자 : ++ --
		//5. 비교연산자 : > < >= <= == !=
		//6. 논리연산자 : && || !
		int 숫자1 = 0;
		숫자1 += 1;		//숫자1 = 숫자1 + 1;
		숫자1++; 			//숫자1 += 1;
		숫자1--;
		
		int num = 3;
		num --;
		System.out.println(num);
		num ++;
		System.out.println(num);
		
		int 숫자2 = 0;
		
		//증감연산자 : ++, --
		//변수명 앞 또는 뒤에 ++를 써줌
		// += 1, -= 1 줄임말
		num += 1;
		
		
	}
}
