package Day06;

public class Class11 {
	public static void main(String[] args) {
		Animal dog = new Animal();
		Animal cat = new Animal();
		
		dog.setInfo("멍멍이", 7, "강아지");
		cat.setInfo("냥이", 3, "고양이");
		
		dog.소개();
		cat.소개();
		
		dog.먹기();
		cat.먹기();
		
		dog.짖기();
		cat.짖기();	
	}
}
class Animal{
	// 멤버변수 : 이름 나이 타입
	// 메서드 : 소개, 먹기, 짖기
	private String name;
	private int age;
	private String type;
	
	public void AnimalInfo() {
		System.out.println("이름: "+name+" 나이: "+age+" 종류: "+type);	
	}
	
	public void setInfo(String owner, String name, int car_num) {
		this.name = name;
		this.age=age;
		this.type=type;
	}
}