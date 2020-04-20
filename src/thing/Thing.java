package thing;

import java.util.Scanner;

public class Thing {
	
	protected ThingDetail detail = ThingDetail.Past;
	protected String kind;
	protected String when;
	protected int many;
	protected int much;
	
	public Thing() {
	}
	
	public Thing(String kind, String when, int many, int much) {
		this.kind = kind;
		this.when = when;
		this.many = many;
		this.much = much;
	}
	
	public ThingDetail getDetail() {
		return detail;
	}

	public void setDetail(ThingDetail detail) {
		this.detail = detail;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getWhen() {
		return when;
	}

	public void setWhen(String when) {
		this.when = when;
	}

	public int getMany() {
		return many;
	}

	public void setMany(int many) {
		this.many = many;
	}

	public int getMuch() {
		return much;
	}

	public void setMuch(int much) {
		this.much = much;
	}
	
	public void printInfo() {
		System.out.println("kind:" + kind + " when:" + when + " many:" + many + " price:" + much);
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
		
		System.out.print("How much?");
		int much = input.nextInt();
		this.setMuch(much);
	}
}
