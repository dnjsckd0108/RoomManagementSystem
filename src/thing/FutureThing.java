package thing;

import java.util.Scanner;

public class FutureThing extends SpecialThing {
	
	public FutureThing(ThingDetail detail) {
		super(detail);
	}
		
	public void getuserInput(Scanner input) {
		setKind(input);
		setThingWhenwithYN(input);
		setMany(input);
		setMuch(input);
	}
	
	public void printInfo() {
		String sdetail = getdetailString();
		System.out.println("detail:" + sdetail + "kind:" + thingkind + " when:" + thingwhen + " many:" + thingmany + " price:" + thingmuch);
	}
}