package assignment;
import java.sql.*;
import java.util.*;
public class Customer {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
				
		while(true) {
			System.out.println("Enter the option:\n"+
					"1 to enter values\n"+"2 to update values\n"+
					"3 to delete values\n"+
					"4 to display data\n"+"5 to exit");
			int option=sc.nextInt();
			switch(option) {
			case 1: insert();
					break;
			case 2: update();
					break;
			case 3: delete();
					break;
			case 4: display();
					break;
			case 5: System.exit(0);
					break;
			default:System.out.println("Please give the correct input");
			}	
					
		}
	}
		public static void insert() {
			Connection con=createConnection();
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter id:");
			int id=sc.nextInt();
				
					
			
			System.out.println("Enter name:");
			String name=sc.next();
			System.out.println("Enter location:");
			String location=sc.next();
			try {
				PreparedStatement p1;
				String sq1= "select * from customer where Customer_Id=?";
					
						
						boolean flag=false;
						p1 = con.prepareStatement(sq1);
						p1.setInt(1,id);
						ResultSet rs=p1.executeQuery();
						while(rs.next()) {
							flag=true;
						}
						if(flag)
							System.out.println("Customer_Id already exists.");
						else {
							String sq="insert into customer values(?,?,?)";
							PreparedStatement p;
							p = con.prepareStatement(sq);
							p.setInt(1,id);
							p.setString(2,name);
							p.setString(3,location);
							p.executeUpdate();
							p.close();
						}
						
						p1.close();
				
				
				System.out.println("Values entered.");
				
				
				
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		public static void update() {
			Connection con=createConnection();
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter name to be changed:");
			String name=sc.next();
			System.out.println("Enter id at which name is to be changed:");
			int id=sc.nextInt();
			
			
			try {
				PreparedStatement p1;
				String sq1= "select * from customer where Customer_Id=?";
					
						
						boolean flag=false;
						p1 = con.prepareStatement(sq1);
						p1.setInt(1,id);
						ResultSet rs=p1.executeQuery();
						while(rs.next()) {
							flag=true;
						}
						if(flag) {
							String sq="update customer set Customer_Name=? where Customer_Id =?";
							
							PreparedStatement p;
							p = con.prepareStatement(sq);
							p.setString(1,name);
							p.setInt(2,id);
							p.executeUpdate();
							p.close();
						}
							
						else {
							System.out.println("Customer_Id does not exist.");
						}
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		public static void delete() {
			Connection con=createConnection();
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter customer id details to be deleted:");
			int id=sc.nextInt();		
			String sq="delete from customer where customer_id=?";
			PreparedStatement p;
			try {
				p = con.prepareStatement(sq);
				p.setInt(1,id);
				p.executeUpdate();
				
				p.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		public static void display() {
			Connection con=createConnection();
			PreparedStatement p;
			String sq= "select * from customer";
			try {
				p = con.prepareStatement(sq);
				ResultSet rs=p.executeQuery();
				
				while(rs.next()) {
				System.out.println("Customer Id="+rs.getInt(1)+"  Customer Name"+rs.getString(2)+"  Location"+rs.getString(3));
				}
				p.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		// TODO Auto-generated method stub
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

}