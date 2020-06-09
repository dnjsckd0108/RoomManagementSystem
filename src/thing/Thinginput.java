package thing;

import java.util.Scanner;

import exception.WhenFormatException;

public interface Thinginput {

	public String getThingkind();
	
	public void setThingkind(String thingkind);
	
	public String getThingwhen();

	public void setThingwhen(String thingwhen) throws WhenFormatException;
	
	public int getThingmany();
	
	public void setThingmany(int thingmany);
	
	public int getThingmuch();
	
	public void setThingmuch(int thingmuch);
	
	public void getuserInput(Scanner input);
	
	public void printInfo();
	
	public void setKind(Scanner input);
	
	public void setWhen(Scanner input);
	
	public void setMany(Scanner input);
	
	public void setMuch(Scanner input);
}