package thing;

import java.util.Scanner;

import exception.WhenFormatException;

public abstract class SpecialThing extends Thing {
	
	public SpecialThing(ThingDetail detail) {
		super(detail);
	}

	public abstract void getuserInput(Scanner input);

	public void printInfo() {
		String sdetail = getdetailString();
		System.out.println("detail:" + sdetail + "kind:" + thingkind + " when:" + thingwhen + " many:" + thingmany + " price:" + thingmuch );
	}
	
	public void setThingWhenwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you want buy more thing? (Y/N)");
			answer = input.next().charAt(0);
			try {
				if (answer == 'y' || answer == 'Y') {
					System.out.println("When?");
					String thingwhen = input.next();
					this.setThingwhen(thingwhen);
					break;
				}
				else if (answer == 'n' || answer == 'N') {
					this.setThingwhen("");
					break;
				}
				else {
				}
			}
			catch(WhenFormatException e) {
				System.out.println("Incorrect Date Format. put your when that contains /");
			}
		}
	}
}