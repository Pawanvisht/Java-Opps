package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SalesByMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		int a = c.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < a; i++) {
			int b = c.nextInt();
			list.add(b);
		}
		System.out.println(list);
	}

}
