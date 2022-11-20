package Day08;

public class Interface2Impl {
	public static void main(String[] args) {
		Gangnam gangnam = new Gangnam();
	}
}

class Gangnam implements Interface2{
	String menu[] = new String[100];
	int priceList[] = new int[100];
	int end_idx=0;
	
	@Override
	public void sell(String coffe) {
		// 판매했다고 출력
		int index = -1;
		for(int i=0; i<menu.length;i++) {
			if(coffee.equals(menu[i])) {
			index = i;
			break;
		}
	}
		System.out.println("강남점- "+menu[index]+"를 "+priceList[index]+"원에 판매했습니다");
	

	@Override
	public void make(String coffee, int price) {
		// 커피항목+가격을 메뉴에 추가
		menu[end_idx] =coffee;
		priceList[end_idx]=price;
		end_idx++;
		
	}

	@Override
	public void coffeelist() {
		// 현재 커피리스트와 가격을 출력
		//에스프레소: 2000원....
		
	}
	



		
	}
