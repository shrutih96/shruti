package Test;
import java.sql.*;
import java.util.*;
import java.util.regex.Pattern;

public class BooksDB {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
				
		while(true) {
			System.out.println("Enter the option:\n"+
					"1 to display\n"+"2 to add books\n"+
					"3 to exit data\n");
			int option=sc.nextInt();
			switch(option) {
			case 1: displayDB();
					break;
			case 2: addBooks();
					break;
			case 3: System.exit(0);
					break;
			default: System.out.println("Please enter the correct option.");
					break;
			}
		}
	}
	
	public static void displayDB() {
		Connection con=createConnection();
		PreparedStatement p;
		String sq= "select * from books";
		try {
			p = con.prepareStatement(sq);
			ResultSet rs=p.executeQuery();
			
			while(rs.next()) {
			System.out.println("Book Id: "+rs.getInt(1)+
			"  Book Name: "+rs.getString(2)+"  Author Name: "+rs.getString(3));
			}
			p.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void addBooks() {
		Connection con=createConnection();
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Book Id: ");
		int id=sc.nextInt();
		int j=0;
		try {
			PreparedStatement p;
			String sq= "select * from books where Book_Id=?";
			p = con.prepareStatement(sq);
			p.setInt(1,id);
			ResultSet rs=p.executeQuery();
			boolean flag=false;
			while(rs.next()) {
				
				flag=true;
			}
			if(flag) {
				System.out.println("Book Id already exists. Please enter other ID.");
			}
			else{
				System.out.print("Enter the Book Name: ");
				String name=sc.next();
				System.out.print("Enter the Author Name: ");
				String author=sc.next();
				
				try{
						validate(author);
					}
				catch(AuthorValidation a){
					
					System.out.print(a.error("Invalid"));
					System.out.print("Enter the Author Name: ");
					author=sc.next();
					
				}
				
					
				
				String sq1="insert into books values(?,?,?)";
				PreparedStatement p1;
				p1 = con.prepareStatement(sq1);
				p1.setInt(1,id);
				p1.setString(2,name);
				p1.setString(3,author);
				p1.executeUpdate();
				p1.close();
			}
			con.close();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static Connection createConnection(){
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create the connection
			Connection con = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/db","root","admin");
			
			return con;
			
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void validate(String author) throws AuthorValidation{
		if(Pattern.matches("^[A-Za-z]+$", author))
			System.out.print("Valid Input");
		else
			 throw new AuthorValidation();
		}
	 
}
