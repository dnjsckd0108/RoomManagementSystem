package thing;

import java.util.Scanner;

public class PastThing extends Thing {
	
	public PastThing(ThingDetail detail) {
		super(detail);
	}
	
	public void getuserInput(Scanner input) {
		setKind(input);
		setWhen(input);
		setMany(input);
		setMuch(input);
	}
	
	public void printInfo() {
		String sdetail = getdetailString();
		System.out.println("detail:" + sdetail + "kind:" + thingkind + " when:" + thingwhen + " many:" + thingmany + " price:" + thingmuch);
	}

}