package Day07;

//상속
public class Extends1 {
	public static void main(String[] args) {
		//내가 만들어서 제공하는 클래스
		MyString ms = new MyString();
		ms.setNum(3, -4);
		ms.getPlus();		//저장된 두 수를 더함
		ms.getDiv();
		
		//두 수를 더하는데 우리는 마이너스값이 없다
		MyStringEx mse = new MyStringEx();
		mse.setNum(3, -4);
		mse.getPlus();
		
		
		//의견2 : 우리는 플러스하면 회사로고
		MyStringLogo msl =new MyStringLogo();
		msl.setNum(3, -4);
		msl.getPlus("==logo==");
		
		
		//버그 | 추가사항
		//나눗셈
		
		//-> 상속 extends
	}
}

class MyString{
	private int num1, num2;
	
	public void setNum(int num1, int num2) {
		this.num1 =num1;
		this.num2 =num2;		
	}
	
	public int getPlus() {
		System.out.println(num1+num2);
		return num1+num2;
	}
	
	//나눗셈 추가
	public double getDiv() {
		System.out.println((double)num1/num2);
		return (double)num1/num2;
	}
}

class MyStringEx{
	private int num1, num2;
	
	public void setNum(int num1, int num2) {
		if(num1 <0) {
			num1 *=-1;
		}
		if(num2 <0) {
			num2 *=-1;
		}
		this.num1 =num1;
		this.num2 =num2;		
	}
	
	public int getPlus() {
		System.out.println(num1+num2);
		return num1+num2;
	}
}

class MyStringLogo{
	private int num1, num2;
	
	public void setNum(int num1, int num2) {
		this.num1 =num1;
		this.num2 =num2;		
	}
	
	public int getPlus(String logo) {
		System.out.println(logo+(num1+num2));
		return num1+num2;
	}
}