import java.sql.*;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String again = "Y";	
		while(again == "Y"){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Music, Music or Book?: ");
		String check = scanner.next();
		if(new String("Music").equals(check)) {
			addMusic();
		}
		
		if(new String("Movie").equals(check)) {
			addMovie();
		}
		}

	
	}



public static void addMusic() {

try {
	//1, Get a connection database
	Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "Vfe3q4rf");
	
	Scanner scanner = new Scanner(System.in);
	Statement myStmt = myConn.createStatement();
	
	
	System.out.print("Enter id: ");
	String id = scanner.next();
	System.out.print("Title: ");
	String title = scanner.next();
	System.out.print("Artist: ");
	String artist = scanner.next();
	System.out.print("Album: ");
	String album = scanner.next();
	System.out.print("Enter Year: ");
	String year = scanner.next();
	System.out.print("Date: ");
	String date = scanner.next();
	System.out.print("Rating: ");
	String rating = scanner.next();
	System.out.print("Comments: ");
	String comments = scanner.next();
	
	
	String sql = "insert into music " + " (id, Title, Artist, Album, Year, Date, Rating, Comments)" + "values ('" + id + "', '" + title + "', '" + artist + "', '" + album + "', '" + year + "', '" + date + "', '" + rating + "', '" + comments + "')";
	
	myStmt.executeUpdate(sql);
	
	System.out.println("Insert complete.");
	
}

catch (Exception exc) {
	exc.printStackTrace();
}
}

public static void addMovie() {

try {
	//1, Get a connection database
	Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "Vfe3q4rf");
	
	Scanner scanner = new Scanner(System.in);
	Statement myStmt = myConn.createStatement();
	
	
	System.out.print("Enter id: ");
	String id = scanner.next();
	System.out.print("Title: ");
	String title = scanner.next();
	System.out.print("Artist: ");
	String artist = scanner.next();
	System.out.print("Album: ");
	String album = scanner.next();
	System.out.print("Enter Year: ");
	String year = scanner.next();
	System.out.print("Date: ");
	String date = scanner.next();
	System.out.print("Rating: ");
	String rating = "test";
	System.out.print("Comments: ");
	String comments = "test";
	
	
	String sql = "insert into music " + " (id, Title, Artist, Album, Year, Date, Rating, Comments)" + "values ('" + id + "', '" + title + "', '" + artist + "', '" + album + "', '" + year + "', '" + date + "', '" + rating + "', '" + comments + "')";
	
	myStmt.executeUpdate(sql);
	
	System.out.println("Insert complete.");
	
}

catch (Exception exc) {
	exc.printStackTrace();
}
}



public static void updateEmployee() {

try {
	//1, Get a connection database
	Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "Vfe3q4rf");
	
	Scanner scanner = new Scanner(System.in);
	Statement myStmt = myConn.createStatement();
	
	
	System.out.print("Update email: ");
	String email = scanner.next();
	
	
	String sql = "update employees " + 
				 " set email='" +
				 email + "'" 
				 + " where id = 6";
	
	myStmt.executeUpdate(sql);
	
	System.out.println("Insert complete.");
	
}

catch (Exception exc) {
	exc.printStackTrace();
}
}

}