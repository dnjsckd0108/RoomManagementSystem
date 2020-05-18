package thing;

import java.util.Scanner;

public class ElectricThing extends SpecialThing {
	
	public ElectricThing(ThingDetail detail) {
		super(detail);
	}

	public void getuserInput(Scanner input) {
		setKind(input);
		setThingWhenwithYN(input);
		setMany(input);
		setMuch(input);
	}
}