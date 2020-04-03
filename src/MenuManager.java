import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Thingmanager thingmanager = new Thingmanager(input);
		
		int num = -10;
		while (num != 5) {
			System.out.println("*** Select menu ***");
			System.out.println(" 1. Add thing");
			System.out.println(" 2. Delete thing");
			System.out.println(" 3. Edit thing");
			System.out.println(" 4. View thing");
			System.out.println(" 5. Exit");
			System.out.println("Select one number between 1 - 5:");
			num = input.nextInt();
			if ( num == 1) {
				thingmanager.addthing();
			}
			if ( num == 2) {
				thingmanager.deletething();
			}
			if ( num == 3) {
				thingmanager.editthing();
			}
			if ( num == 4) {
				thingmanager.viewthing();
			}
			else {
				continue;
			}
		}
	}
	
}