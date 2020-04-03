import java.util.Scanner;

public class Thingmanager {
	Thing thing;
	Scanner input;
	
	Thingmanager(Scanner input) {
		this.input = input;
		
		
	}
	public void addthing() {
		thing = new Thing();
		System.out.print("What kind?");
		thing.kind = input.next();
		System.out.print("When?");
		thing.when = input.next();
		System.out.print("How many?");
		thing.many = input.nextInt();
		System.out.print("How much?");
		thing.much = input.nextInt();
	}
	
	public void deletething() {
		System.out.print("What kind?");
		String kind = input.next();
		if (thing == null) {
			System.out.println("It is not been registered");
			return;
		}
		if (thing.kind.equals(kind)) {
			thing = null;
			System.out.println("deleted");
		}
		
	}
	
	public void editthing() {
		System.out.print("What kind?");
		String kind = input.next();
		if (thing.kind.equals(kind)) {
			int num = -10;
			while (num != 5) {
				System.out.println("** Select Edit menu **");
				System.out.println(" 1. Edit kind");
				System.out.println(" 2. Edit when");
				System.out.println(" 3. Edit many");
				System.out.println(" 4. Edit much");
				System.out.println(" 5. Exit");
				System.out.println("Select one number between 1 - 5:");
				num = input.nextInt();
				if ( num == 1) {
					System.out.print("What kind?");
					thing.kind = input.next();
				}
				if ( num == 2) {
					System.out.print("When?");
					thing.when = input.next();
				}
				if ( num == 3) {
					System.out.print("How many?");
					thing.many = input.nextInt();
				}
				if ( num == 4) {
					System.out.print("How much?");
					thing.much = input.nextInt();
				}
				else {
					continue;
				}
			}
		}
		

	}
	
	public void viewthing() {
		System.out.print("What kind?");
		String kind = input.next();
		if (thing.kind.equals(kind)) {
			thing.printInfo();
		}
		
	}

}

