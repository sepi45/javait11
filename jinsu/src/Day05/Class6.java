package Day05;

public class Class6 {
	public static void main(String[] args) {
		Person 홍길동 = new Person();
		Person 이순신 = new Person();
		
		
		홍길동.setInfo("홍길동",18,"남",170);
		이순신.setInfo("이순신",40,"남",160);
		
		홍길동.PersonInfo();
		이순신.PersonInfo();
		
	}
}

class Person{
	//이름, 나이, 성별, 키
	
	String name;
	int age;
	String gender;
	int height;
	
	//생성자의 이름은 클래스의 이름과 같음, 자료형이 없음
	 
	
	//정보보기(이름, 나이, 성별, 키 출력)
	public void PersonInfo() {
		System.out.println("이름: "+name+" 나이: "+age+" 성별: "+gender+" 키: "+height);	
	}
	public void setInfo(String name, int age, String gender, int height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		}
	//인사하기(홍길동이 인사합니다)
}
