import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;
		
		while (num != 6) {
			System.out.println("*** Select menu ***");
			System.out.println(" 1. Add thing");
			System.out.println(" 2. Delete thing");
			System.out.println(" 3. Edit thing");
			System.out.println(" 4. View thing");
			System.out.println(" 5. Show a menu");
			System.out.println(" 6. Exit");
			System.out.println("Select one number between 1 - 6:");
			num = input.nextInt();
			if ( num == 1) {
				addthing();
			}
			if ( num == 2) {
				deletething();
			}
			if ( num == 3) {
				editthing();
			}
			if ( num == 4) {
				viewthing();
			}
			else {
				continue;
			}
		}
	}
	
	public static void addthing() {
		Scanner input = new Scanner(System.in);
		System.out.print("What kind?");
		String kind = input.next();
		System.out.print("When?");
		String day = input.next();
		System.out.print("How many?");
		int many = input.nextInt();
		System.out.print("How much?");
		int money = input.nextInt();
	}
	
	public static void deletething() {
		Scanner input = new Scanner(System.in);
		System.out.print("What kind?");
		String kind = input.next();
		
	}
	
	public static void editthing() {
		Scanner input = new Scanner(System.in);
		System.out.print("What kind?");
		String kind = input.next();
		
	}
	
	public static void viewthing() {
		Scanner input = new Scanner(System.in);
		System.out.print("What kind?");
		String kind = input.next();
		
	}

}
