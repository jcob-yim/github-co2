package githubEx;
import java.util.Scanner;//종현
import java.util.ArrayList;//종현
public class githubEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// git(로컬저장소)에만 있던 원시 파일
		//종현
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		int a =1;
		int n =0;
		ArrayList<Integer>b = new ArrayList<>();
		while (a<=1000000000) {
			a= a+6*n;
			b.add(a);
			n++;
		}
		System.out.println(b);
		for (int i=0; i<b.size();i++) {
			if (b.get(i)<N && b.get(i+1)>=N) {
				System.out.println(i+2);
			}
		}
		//종현
		
	}

}
