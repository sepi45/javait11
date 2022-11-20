package Day08;

public class Extends1 {
	public static void main(String[] args) {
		
	}
}

class Star{
	//본사 : 스타벅스가 갖춰야할 기본 데이터(변수)와 기능(함수)
	//생성자로 가격, 메뉴 정하기
	private int price;
	private String menu;
	
	//~~를 판매합니다.
	//~~의 가격은 --입니다
	Star(){
	System.out.println("아메리카노의 가격은 "+price+" 입니다");
	System.out.println("스타벅스의 메뉴는"+menu+" 입니다");
	
	}
	public void setVar(int num, String 아메리카노) {
		this.price = 2000;
		this.menu = 아메리카노;		
	}
	public int getNum() {
		return price;			
	}
	public String getmenu() {
		return menu;
	}
}

class StarBupyeong extends Star{
	//부평점 : 스타벅스가 기본적으로 갖춰야할 것 + 부평점만의 특징
	//생성자로 가격, 메뉴 재정의하기
	public StarBupyeong() {
		super();
	}
	
	
	
	//부평점 - ~~를 판매합니다
	//부평점 - ~~의 가격은 --입니다
}