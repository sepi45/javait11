package Day08;

//다형성: 코드 수정을 최소화 하기 위해 클래스 구조를 잡아 상속한다.(스타벅스 -> 강남점, 신촌점, 인천점....)
public interface Interface2 {
	void sell(String coffee);
	
	void make(String coffee, int price);
	
	void coffeelist();
}
