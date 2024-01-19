package githubEx;

import java.io.IOException;
import java.util.Scanner;

public class githubEx2 {

	public static void main(String[] args) throws IOException {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        ArrayList<Integer> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		double MAX = 0;

		int N = sc.nextInt();
		int[] ar = new int[N];
		double[] answer = new double[N];
		double sum = 0;

		for (int i = 0; i < N; i++) {
			ar[i] = sc.nextInt();

			if (MAX < ar[i]) {
				MAX = ar[i];
			}
		}

		for (int j = 0; j < N; j++) {
			answer[j] = (double) ar[j] / MAX * 100.0;
			sum += answer[j];
		}
		System.out.println(sum/N);
	}

}