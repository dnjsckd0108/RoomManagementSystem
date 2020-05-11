package thing;

import java.util.Scanner;

public interface Thinginput {

	public String getKind();
	
	public void setKind(String kind);

	public void setWhen(String when);
	
	public void setMany(int many);
	
	public void setMuch(int much);
	
	public void getuserInput(Scanner input);
	
	public void printInfo();
	
	public void setKind(Scanner input);
	
	public void setWhen(Scanner input);
	
	public void setMany(Scanner input);
	
	public void setMuch(Scanner input);
}
