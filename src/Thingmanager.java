import java.util.ArrayList;
import java.util.Scanner;

import thing.ElectricThing;
import thing.FutureThing;
import thing.Thing;
import thing.ThingDetail;

public class Thingmanager {
	ArrayList<Thing> things = new ArrayList<Thing>();
	Scanner input;
	Thingmanager(Scanner input) {
		this.input = input;
	}
	
	public void addthing() {
		int detail = 0;
		Thing thing;
			while (detail !=1 && detail !=2 && detail !=3) {
			System.out.println("Select Thing Detail:");
			System.out.println("1 for Past:");
			System.out.println("2 for Future:");
			System.out.println("3 Electric:");
			System.out.println("Select num for Thing detail  1 to 3:");
			detail = input.nextInt();
			if (detail == 1) {
				thing = new Thing(ThingDetail.Past);
				thing.getuserInput(input);
				things.add(thing);
				break;
				
			}
			else if (detail == 2) {
				thing = new FutureThing(ThingDetail.Future);
				thing.getuserInput(input);
				things.add(thing);
				break;
				
			}
			else if (detail == 3) {
				thing = new ElectricThing(ThingDetail.Electric);
				thing.getuserInput(input);
				things.add(thing);
				break;
				
			}
			else {
				System.out.print("Select num for Thing detail between 1 and 2:");
			}
		}
	}
	
	public void deletething() {
		System.out.print("What kind?");
		String kind = input.next();
		int index = -1;
		for (int i = 0; i<things.size(); i++) {
			if (things.get(i).getKind().equals(kind)) {
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
			if (thing.getKind().equals(kind)) {
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
						kind = input.next();
						thing.setKind(kind);
					}
					if ( num == 2) {
						System.out.print("When?");
						String when = input.next();
						thing.setWhen(when);
					}
					if ( num == 3) {
						System.out.print("How many?");
						int many = input.nextInt();
						thing.setMany(many);
					}
					if ( num == 4) {
						System.out.print("How much?");
						int much = input.nextInt();
						thing.setMuch(much);
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
		System.out.println("# of registered things:" + things.size());
		for (int i = 0; i<things.size(); i++) {
			things.get(i).printInfo();
		}
	}

}