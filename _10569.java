package Back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10569 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String input[] = br.readLine().split(" ");
			int V = Integer.parseInt(input[0]);
			int E = Integer.parseInt(input[1]);
			
			System.out.println(2 - V + E);
			
		}

	}

}
