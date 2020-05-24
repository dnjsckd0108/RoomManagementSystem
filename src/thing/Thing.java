package thing;

import java.io.Serializable;
import java.util.Scanner;
import exception.WhenFormatException;

public abstract class Thing implements Thinginput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4756164897541312804L;
	
	protected ThingDetail detail = ThingDetail.Past;
	protected String thingkind;
	protected String thingwhen;
	protected int thingmany;
	protected int thingmuch;
	
	public Thing() {
	}
	
	public Thing(ThingDetail detail) {
		this.detail=detail;
	}
	
	public Thing(String thingkind, String thingwhen, int thingmany, int thingmuch) {
		this.thingkind = thingkind;
		this.thingwhen = thingwhen;
		this.thingmany = thingmany;
		this.thingmuch = thingmuch;
	}
	
	public Thing(ThingDetail detail,String thingkind, String thingwhen, int thingmany, int thingmuch) {
		this.detail = detail;
		this.thingkind = thingkind;
		this.thingwhen = thingwhen;
		this.thingmany = thingmany;
		this.thingmuch = thingmuch;
	}
	
	public ThingDetail getDetail() {
		return detail;
	}

	public void setDetail(ThingDetail detail) {
		this.detail = detail;
	}

	public String getThingkind() {
		return thingkind;
	}

	public void setThingkind(String thingkind) {
		this.thingkind = thingkind;
	}

	public String getThingwhen() {
		return thingwhen;
	}

	public void setThingwhen(String thingwhen) throws WhenFormatException {
		if (!thingwhen.contains("/") && !thingwhen.equals("")) {
			throw new WhenFormatException();
		}
		this.thingwhen = thingwhen;
	}

	public int getThingmany() {
		return thingmany;
	}

	public void setThingmany(int thingmany) {
		this.thingmany = thingmany;
	}

	public int getThingmuch() {
		return thingmuch;
	}

	public void setThingmuch(int thingmuch) {
		this.thingmuch = thingmuch;
	}
	public abstract void printInfo();
	
	public void setKind(Scanner input) {
		System.out.print("What kind?");
		String thingkind = input.next();
		this.setThingkind(thingkind);
	}
	
	public void setWhen(Scanner input) {
		String thingwhen = "";
		while (!thingwhen.contains("/")) {
			System.out.print("When?");
			thingwhen = input.next();
			try {
				this.setThingwhen(thingwhen);
			}
			catch (WhenFormatException e) {
				System.out.println("Incorrect Date Format. put your when that contains /");
			}
		}
	}
	
	public void setMany(Scanner input) {
		System.out.print("How many?");
		int thingmany = input.nextInt();
		this.setThingmany(thingmany);
	}
	
	public void setMuch(Scanner input) {
		System.out.print("How much?");
		int thingmuch = input.nextInt();
		this.setThingmuch(thingmuch);
	}
	
	public String getdetailString() {
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
		return sdetail;
	}
}