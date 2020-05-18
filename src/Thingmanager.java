import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import thing.ElectricThing;
import thing.FutureThing;
import thing.PastThing;
import thing.ThingDetail;
import thing.Thinginput;

public class Thingmanager {
	ArrayList<Thinginput> things = new ArrayList<Thinginput>();
	Scanner input;
	Thingmanager(Scanner input) {
		this.input = input;
	}
	
	public void addthing() {
		int detail = -1;
		Thinginput thinginput;
		while (detail < 1 || detail > 3) {
			try {
				System.out.println("Select Thing Detail:");
				System.out.println("1 for Past:");
				System.out.println("2 for Future:");
				System.out.println("3 Electric:");
				System.out.println("Select num for Thing detail  1 to 3:");
				detail = input.nextInt();
				if (detail == 1) {
					thinginput = new PastThing(ThingDetail.Past);
					thinginput.getuserInput(input);
					things.add(thinginput);
					break;
					
				}
				else if (detail == 2) {
					thinginput = new FutureThing(ThingDetail.Future);
					thinginput.getuserInput(input);
					things.add(thinginput);
					break;
					
				}
				else if (detail == 3) {
					thinginput = new ElectricThing(ThingDetail.Electric);
					thinginput.getuserInput(input);
					things.add(thinginput);
					break;
					
				}
				else {
					System.out.print("Select num for Thing detail between 1 and 3:");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer beteween 1 and 3!");
				if(input.hasNext()) {
					input.next();
				}
				detail = -1;
			}
		}
	}
	
	public void deletething() {
		System.out.print("What kind?");
		String kind = input.next();
		int index = findIndex(kind);
		removefromThings(index,kind);
	}
	
	public int findIndex(String kind) {
		int index = -1;
		for (int i = 0; i<things.size(); i++) {
			if (things.get(i).getThingkind().equals(kind)) {
				index = i;
				break;
			}
		}
		return index;
	}

	public int removefromThings(int index, String kind) {
		if (index >= 0) {
			things.remove(index);
			System.out.println( kind + "'s information is deleted");
			return 1;
		}
		else {
			System.out.println("It is not been registered");
			return -1;
		}
	}
	
	public void editthing() {
		System.out.print("What kind?");
		String kind = input.next();
		for (int i = 0; i<things.size(); i++) {
			Thinginput thing = things.get(i);
			if (thing.getThingkind().equals(kind)) {
				int num = -1;
				while (num != 5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						thing.setKind(input);
						break;
					case 2:
						thing.setWhen(input);
						break;
					case 3:
						thing.setWhen(input);
						break;
					case 4:
						thing.setMuch(input);
						break;
					default:
						continue;
					}
				}
				break;
			}
		}
	}
	
	public void viewthings() {
		System.out.println("# of registered things:" + things.size());
		for (int i = 0; i<things.size(); i++) {
			things.get(i).printInfo();
		}
	}

	
	public void showEditMenu() {
		System.out.println("** Select Edit menu **");
		System.out.println(" 1. Edit kind");
		System.out.println(" 2. Edit when");
		System.out.println(" 3. Edit many");
		System.out.println(" 4. Edit much");
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1 - 5:");
	}
}