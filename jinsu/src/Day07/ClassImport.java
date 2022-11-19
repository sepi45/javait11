package Day07;

public class ClassImport {
	
	// 접근권한제어자 -> 캡슐화
	// 멤버변수는 private, 메서드는 public
	private String str;
	private int Num;
	
	//생성자 : 객체화할때 사용되는 메서드
	// 생성자의 이름은 클래스명과 같다
	ClassImport(){
		System.out.println("객체화 성공");
	}

	public String getStr() {		//get : 변수로 사용하지 말고 이 메서드를 사용해라
		return str;
	}

	public void setStr(String str) {		// set : 변수에 값을 대입할 때 이 메서드를 통해 해라
		this.str = str;
	}

	public int getNum() {
		return Num;
	}

	public void setNum(int num) {
		Num = num;
	}
	
	//  getter와 setter를 직접

	}

