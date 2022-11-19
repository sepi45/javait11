package Day07;

public class Extends4 {
	public static void main(String[] args) {
		Human human = new Human("휴먼", 12);
		System.out.println("이름:"+human.getName()+", 나이:"+human.getAge());
		
		
		Member member = new Member("멤버", 13, 111);
		member.getMemNo();
	}
}

// 사람 Human
class Human {
// 이름, 나이
	private String name;
	private int age;
	public Human(String name, int age){
		this.name=name;
		this.age=age;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
//생성자를 통해서 정보를 입력
//게터세터



//회원Member
class Member extends Human{
	private int memNo;
	public Member(String name, int age, int memNo){
		super(name, age);
		this.memNo = memNo;
	}
//+회원번호
	public int getMemNo() {
		return memNo;
	}
	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}
	
	public void MemberInfo() {
		System.out.println("이름: "+this.getName()+", 나이: "+this.getAge()+", 회원번호"+this.getMemNo());
	}
}
//생성자를 통해서 정보를 입력
//회원번호 게터세터
//회원소개