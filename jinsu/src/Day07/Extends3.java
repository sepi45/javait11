package Day07;

public class Extends3 {
	public static void main(String[] args) {
		TestClass tc = new TestClass();
		TestClassEx tce = new TestClassEx();
		
}

class TestClass{
	//private : 나 외에 다 사용 불가
	//protected : 상속 받은 클래스까지는 허용
	//default(안적으면) : 같은 패키지면 허용
	//public : 같은 프로젝트면 허용(다 가능)
	
	//상속받으면 private -> protected
	protected int num;
	protected String str;
	private double dNum;
	
	public void Print() {
		System.out.println("테쓰형 클래스 사용");
	}
}

// TestClass를 상속받아서 수정&추가

class TestClassEx extends TestClass{
	//추가
	private int num2;
	
	//수정	
	public void Print() {
		int num2;
		System.out.println("테스트클래스Ex가 만든 Print 사용");
	}
	
}



}

