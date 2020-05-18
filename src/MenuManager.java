import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Thingmanager thingmanager = new Thingmanager(input);
		
		selectMenu(input, thingmanager);
	}
	
	public static void selectMenu(Scanner input, Thingmanager thingmanager) {
		int num = -1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					thingmanager.addthing();
					break;
				case 2:
					thingmanager.deletething();
					break;
				case 3:
					thingmanager.editthing();
					break;
				case 4:
					thingmanager.viewthings();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("*** Select menu ***");
		System.out.println(" 1. Add thing");
		System.out.println(" 2. Delete thing");
		System.out.println(" 3. Edit thing");
		System.out.println(" 4. View things");
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1 - 5:");
	}
	
}