import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class UserDataRead{
	
	private static final String COMMA_DELIMITER = ",";
	private static ArrayList<User> userList = new ArrayList<User>();
	
	public static void main(String[] args) throws IOException {
		getUserData();
		printUserData();
	}
	
	private static void getUserData() throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("Userdata.csv"));
		String line = "";
		br.readLine();
		while((line = br.readLine()) != null) {
			String[] data = line.split(COMMA_DELIMITER);
			userList.add(new User(data[0], data[1], data[2], data[3]));
		}
	}
	
	private static void printUserData() {
		for (User user: userList) {
			System.out.println(user);
		}
	}

}
