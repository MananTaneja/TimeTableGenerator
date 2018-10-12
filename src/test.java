import java.io.*;
public class test {

	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to Faculty Timetable generation system!");
		//FacInfo ob = new FacInfo(); // Creating object for only 1 faculty can be updated to array later
		//System.out.println("Enter the number of course the faculty is handling");
		//int n = Integer.parseInt(br.readLine()); // Will set a variable later for now use 3
		CourseDetails course[] = new CourseDetails[4];
		course[0] = new CourseDetails("Discrete Mathematics", 1 , 4 , "CSE-F" , false);
		course[1] = new CourseDetails("Calculus and Matrix Algebra", 2, 3, "CSE-E" , false);
		course[2] = new CourseDetails("Maths Lab", 3, 2, "ECE-C" , true);
		course[3] = new CourseDetails("Data Structures" , 4, 4, "CSE-F", false);
		course[0].showCourseDetails();
		course[1].showCourseDetails();
		course[2].showCourseDetails();
		course[3].showCourseDetails();
		TimeTableDetails t = new TimeTableDetails();
		for(int i = 0 ; i < course.length ; i++) {
			if(course[i].isLab == true) {
				t.generate(course[i]);
			}
		}
		for(int i = 0 ; i < course.length ; i++) {
			if(course[i].isLab == false) {
				t.generate(course[i]);
			}
		}
		t.display_timetable_array();
	}

}
