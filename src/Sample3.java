package lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample3 {
	public static void main(String[] args) throws IOException {
		System.out.println("整数を入力してください。");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int res = Integer.parseInt(br.readLine());

		if (res == 1) {
			System.out.println("1が入力されました。");
		}else {
			System.out.println("1以外が入力されました。");
		}
	}
}
