import java.io.*;
public class test {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to Faculty Timetable generation system!");
		FacInfo ob = new FacInfo();
		System.out.println("Enter the number of course the faculty is handling");
		int n = Integer.parseInt(br.readLine()); // Will set a variable later for now use 3
		CourseDetails course[] = new CourseDetails[3];
		course[0] = new CourseDetails("Discrete Mathematics", "15MAT201" , 4 , "CSE-F" , false);
		course[1] = new CourseDetails("Calculus and Matrix Algebra", "15MAT100", 3, "CSE-E" , false);
		course[2] = new CourseDetails("Maths Lab", "15MAT999", 2, "ECE-C" , true);
		course[0].showCourseDetails();
		course[1].showCourseDetails();
		course[2].showCourseDetails();
	}

}
