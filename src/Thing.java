public class Thing {
	String kind;
	String when;
	int many;
	int much;
	
	public Thing() {
	}
	
	public Thing(String kind, String when, int many, int much) {
		this.kind = kind;
		this.when = when;
		this.many = many;
		this.much = much;
	}
	
	public void printInfo() {
		System.out.println("kind:" + kind + " when:" + when + " many:" + many + " price:" + much);
	}
}
