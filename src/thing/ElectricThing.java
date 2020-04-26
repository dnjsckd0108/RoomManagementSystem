package thing;

import java.util.Scanner;

public class ElectricThing extends Thing {
	
	protected int expensivemuch;
	
	public ElectricThing(ThingDetail detail) {
		super(detail);
	}
	
	public void getuserInput(Scanner input) {
		System.out.print("What kind?");
		String kind = input.next();
		this.setKind(kind);

		System.out.print("When?");
		String when = input.next();
		this.setWhen(when);
		
		System.out.print("How many?");
		int many = input.nextInt();
		this.setMany(many);
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Is the price over than 10000? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("how much:");
				int much = input.nextInt();
				this.setMuch(expensivemuch);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setMuch(much);
				break;
			}
			else {
			}	
		}
	}
	public void printInfo() {
		String sdetail = "none";
		switch(this.detail) {
		case Past:
			sdetail = "Past. ";
			break;
		case Future:
			sdetail = "Future. ";
			break;
		case Electric:
			sdetail = "Electric. ";
			break;
		default:
		}
		
		System.out.println("detail:" + sdetail + "kind:" + kind + " when:" + when + " many:" + many + " price:" + much + " price:" + expensivemuch + "¸¸¿ø");
	}
}
