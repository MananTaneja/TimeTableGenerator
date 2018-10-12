import java.util.Random;

public class TimeTableDetails {
	String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
	int tt[] = new int[30];
	
	public TimeTableDetails() {
		for(int i = 0; i<30;i++) {
			tt[i] = 0;
		}
	}
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
		for (int i = 0 ; i < 5; i++) {
			System.out.print(days[i]);
			printGap(12, days[i].length());
			for(int j = 0 ; j < 6; j++) {
				System.out.print("XYZ Subject");
				printGap(30, 12);
			}
			System.out.println("\n");
		}
	}
	
	
	public void generate(CourseDetails ob) {
		 int count = 0;
		 Random rand = new Random();
		 while(count<ob.occurence) {
			 int rand_int = rand.nextInt(30);
			 tt[rand_int] = ob.course_id;
			 count++;
			 }
		 }
	
	public void display_timetable_array() {
		int count = 1;
		for(int i= 0  ; i<30; i++) {
			System.out.print(tt[i] + "\t");
			if(count % 6==0) {
				System.out.println();
			}
			count++;
		}
	}
}