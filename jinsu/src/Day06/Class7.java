package Day06;

public class Class7 {
	
	int sum(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		//초보
		MyClass7 mc = new MyClass7();		// 1. 객체화
		mc.setNum(3, 4);					// 2. 반드시 set 을 먼저 할것
		int num = mc.sum();					// 3. 마지막에 이걸 사용하면 됨
		System.out.println(num);
		
		}
	}

//프로그래밍 언어 : 자바, 파이선, c, c++ c# js, ......
//... c, c++ java c# 파이썬
// C언어 : class X
// C++ : class 시작(클래스는 초보자를 위해 만들어졌다)

//고수
class MyClass7 {
	int a=3, b=4;
	
	//생성자 : 객체화를 하는 순간에 자동으로 생성되는 메서드
	//생성자의 이름은 클래스의 이름과 같다.
	
	void setNum(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int sum() {
		return a+b;
		
	}
}