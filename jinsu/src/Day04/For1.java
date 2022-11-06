package Day04;

public class For1 {
	public static void main(String[] args) {
		//for : while이 지저분하니 정리해서 씀
		
		for(int i=0; i<5; i++) {
			System.out.println("안녕");
		}
			/*
			 * for(초기값;조건식;증감량{
			 * 반복하고자 하는 코드들;
			 * }
			 */
		
		int k =0, sum=0;
		while(k <11) {
			sum += k;
			k++;
		}
			System.out.println(sum);
			
			int 총합 = 0;
			for(int b=0; b<11; b++) {
				총합 += b;
			}
			System.out.println(총합);
		}
		
			}




