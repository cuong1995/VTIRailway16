package hello;

import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

//		int[] points = { 1, 2, 3, 5, 7, 9 };
//		int[] points2 = { 1, 2, 3, 5, 7, 9 };
//
//		for (int i : points2) {
//			System.out.println(i);
//		}
		
//		int i = 1;
//		while (i < 10) {
//			System.out.println(i);
//			i ++;
//		}
/*		int i = 1;		
		do {
			i ++;
			System.out.println(i);			
		} while (i < 10);
*/						
//		System.out.print("Nguyễn \nMạnh \n");
//		System.out.println("Cường");
//		
//		Random random = new Random();
//		int x = random.nextInt();
//		System.out.println(x);
//		// random x 0->10
//		x = random.nextInt(11);
//		System.out.println(x);
//		
//		// random x 10->20
//		x = random.nextInt(11) + 10;
//		System.out.println(x);
		
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("Mời người dùng nhập vào 1 chuỗi :");
//		String name = scanner.next();
//		System.out.println(name);
//		scanner.nextLine();
		
		System.out.println("Mời người dùng nhập vào 1 số :");
		if(scanner.hasNextInt()){
			int number = scanner.nextInt();
			System.out.println(number);
		}
	}
	

}
