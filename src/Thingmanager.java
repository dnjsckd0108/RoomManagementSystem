import java.util.ArrayList;
import java.util.Scanner;

public class Thingmanager {
	ArrayList<Thing> things = new ArrayList<Thing>();
	Scanner input;
	
	Thingmanager(Scanner input) {
		this.input = input;
		
		
	}
	public void addthing() {
		Thing thing = new Thing();
		System.out.print("What kind?");
		thing.kind = input.next();
		System.out.print("When?");
		thing.when = input.next();
		System.out.print("How many?");
		thing.many = input.nextInt();
		System.out.print("How much?");
		thing.much = input.nextInt();
		things.add(thing);
	}
	
	public void deletething() {
		System.out.print("What kind?");
		String kind = input.next();
		int index = -1;
		for (int i = 0; i<things.size(); i++) {
			if (things.get(i).kind.equals(kind)) {
				index = i;
				break;
			}
		}
		if (index>=0) {
			things.remove(index);
			System.out.println( kind + "'s information is deleted");
		}
		else {
			System.out.println("It is not been registered");
		}
	}
	
	public void editthing() {
		System.out.print("What kind?");
		String kind = input.next();
		for (int i = 0; i<things.size(); i++) {
			Thing thing = things.get(i);
			if (thing.kind.equals(kind)) {
				int num = -1;
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
				break;
			}
		}
	}
	
	public void viewthings() {
		for (int i = 0; i<things.size(); i++) {
			things.get(i).printInfo();
		}

		
	}

}

