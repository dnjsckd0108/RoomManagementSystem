import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Thingmanager thingmanager = getObject("thingmanager.ser");
		if(thingmanager == null) {
			thingmanager = new Thingmanager(input);
		}
		else {
			thingmanager.setScanner(input);
		}
		
		selectMenu(input, thingmanager);
		putObject(thingmanager, "thingmanager.ser");
	}
	
	public static void selectMenu(Scanner input, Thingmanager thingmanager) {
		int num = -1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					thingmanager.addthing();
					logger.log("add a thing");
					break;
				case 2:
					thingmanager.deletething();
					logger.log("delete a thing");
					break;
				case 3:
					thingmanager.editthing();
					logger.log("edit a thing");
					break;
				case 4:
					thingmanager.viewthings();
					logger.log("edit a list of thing");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("*** Select menu ***");
		System.out.println(" 1. Add thing");
		System.out.println(" 2. Delete thing");
		System.out.println(" 3. Edit thing");
		System.out.println(" 4. View things");
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1 - 5:");
	}
	
	public static Thingmanager getObject(String filename) {
		Thingmanager thingmanager = null;
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			thingmanager = (Thingmanager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return thingmanager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return thingmanager;
		
	}
	
	public static void putObject(Thingmanager thingmanager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(thingmanager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}