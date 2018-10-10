import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacInfo {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String name;
	String phone;
	int id;
	public FacInfo() throws IOException {
		System.out.println("Enter Faculty Name:");
		name = br.readLine();
		System.out.println("Enter phone number:");
		phone = br.readLine();
		System.out.println("Enter your ID:");
		id = Integer.parseInt(br.readLine());
	}
}
