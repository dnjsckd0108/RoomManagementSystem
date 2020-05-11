package thing;

import java.util.Scanner;

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
			if (answer == 'y' || answer == 'Y') {
				setWhen(input);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setWhen("");
				break;
			}
			else {
			}
		}
	}
}