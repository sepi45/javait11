package Day04;

public class While2 {
	public static void main(String[] args) {
		//while(){}
		//내가 원하는 횟수만큼만 실행하도록 '플래그'를 세운다.
		//횟수 카운팅 가능한 플래그
		int i = 0;
		while(i != 3) {
			System.out.println("hello");
			i++;  //반복문 한번 실행할때마다 플래그를 1씩 증가시킨다.(횟수카운팅)
		}
	}
}
