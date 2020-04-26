package thing;

import java.util.Scanner;

public class FutureThing extends Thing {
	
		public FutureThing(ThingDetail detail) {
			super(detail);
		}
		
		public void getuserInput(Scanner input) {
			System.out.print("What kind?");
			String kind = input.next();
			this.setKind(kind);
			char answer = 'x';
			while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
				System.out.print("Do you want buy more thing? (Y/N)");
				answer = input.next().charAt(0);
				if (answer == 'y' || answer == 'Y') {
					System.out.print("When?:");
					String when = input.next();
					this.setWhen(when);
					break;
				}
				else if (answer == 'n' || answer == 'N') {
					this.setWhen("");
					break;
				}
				else {
				}
			}

			System.out.print("How many?");
			int many = input.nextInt();
			this.setMany(many);
			
			System.out.print("How much?");
			int much = input.nextInt();
			this.setMuch(much);
		}
	}