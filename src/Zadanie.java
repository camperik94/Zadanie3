import java.util.Scanner;

public class Zadanie {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int weight = in.nextInt();
		int height = in.nextInt();
		
		
		in.close();
		
		Bmi bmi = new Bmi(weight, height);
		
		
		System.out.println(bmi.getWaga());
		System.out.println(bmi.getWzrost());
		bmi.zmierzBmi();
		
		
	}
}
