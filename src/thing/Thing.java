package thing;

import java.util.Scanner;

public abstract class Thing implements Thinginput {
	
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
	
	public Thing(String kind, String when, int many, int much) {
		this.thingkind = kind;
		this.thingwhen = when;
		this.thingmany = many;
		this.thingmuch = much;
	}
	
	public Thing(ThingDetail detail,String kind, String when, int many, int much) {
		this.detail = detail;
		this.thingkind = kind;
		this.thingwhen = when;
		this.thingmany = many;
		this.thingmuch = much;
	}
	
	public ThingDetail getDetail() {
		return detail;
	}

	public void setDetail(ThingDetail detail) {
		this.detail = detail;
	}

	public String getKind() {
		return thingkind;
	}

	public void setKind(String kind) {
		this.thingkind = kind;
	}

	public String getWhen() {
		return thingwhen;
	}

	public void setWhen(String when) {
		this.thingwhen = when;
	}

	public int getMany() {
		return thingmany;
	}

	public void setMany(int many) {
		this.thingmany = many;
	}

	public int getMuch() {
		return thingmuch;
	}

	public void setMuch(int much) {
		this.thingmuch = much;
	}
	public abstract void printInfo();
	
	public void setKind(Scanner input) {
		System.out.print("What kind?");
		String thingkind = input.next();
		this.setKind(thingkind);
	}
	
	public void setWhen(Scanner input) {
		System.out.print("When?");
		String when = input.next();
		this.setWhen(when);
	}
	
	public void setMany(Scanner input) {
		System.out.print("How many?");
		int many = input.nextInt();
		this.setMany(many);
	}
	
	public void setMuch(Scanner input) {
		System.out.print("How much?");
		int much = input.nextInt();
		this.setMuch(much);
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