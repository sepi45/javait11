package Day04;

public class Array3 {
	public static void main(String[] args) {
		String name[] = new String[4];
		int no[]= {1,2,3,4};
		
		name[0]="ㄱ";
		name[1]="ㄴ";
		name[2]="ㄷ";
		name[3]="ㄹ";
		
		for(int i=0; i<name.length;i++) {
			System.out.println(no[i]+"번 - "+name[i]);
		}
		
		
		}
}
