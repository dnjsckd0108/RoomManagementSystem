package thing;

import java.util.Scanner;

import exception.WhenFormatException;

public interface Thinginput {

	public String getThingkind();
	
	public void setThingkind(String thingkind);

	public void setThingwhen(String thingwhen) throws WhenFormatException;
	
	public void setThingmany(int thingmany);
	
	public void setThingmuch(int thingmuch);
	
	public void getuserInput(Scanner input);
	
	public void printInfo();
	
	public void setKind(Scanner input);
	
	public void setWhen(Scanner input);
	
	public void setMany(Scanner input);
	
	public void setMuch(Scanner input);
}