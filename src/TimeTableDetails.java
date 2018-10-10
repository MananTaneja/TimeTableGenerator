
public class TimeTableDetails {
	int no_hours = 7;
	String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	public void printGap(int a, int b) {
		for(int i = b ; i <= a ; i++ ) {
			System.out.print(" ");
		}
	}
		
	public void printTableFormat() {
		System.out.print("Days");
		printGap(12,4);
		for(int i = 1; i < 8; i++) {
			printGap(14,1);
			System.out.print(i);
			printGap(30,15);
		}
		System.out.println();
		for(int i = 0 ; i < 212; i++) {
			System.out.print("_");
		}
		System.out.println("\n");
		for (int i = 0 ; i < 6; i++) {
			System.out.print(days[i]);
			printGap(12, days[i].length());
			for(int j = 0 ; j < 7; j++) {
				System.out.print("XYZ Subject");
				printGap(30, 12);
			}
			System.out.println("\n");
		}
	}
}