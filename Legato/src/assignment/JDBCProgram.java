package assignment;
import java.sql.*;
import java.util.*;
public class JDBCProgram {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// TODO Auto-generated method stub
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create the connection
			Connection con = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/db","root","admin");
		
			System.out.println("Connected");
			
			//create statements
			System.out.println("Enter id:");
			int id=sc.nextInt();
			System.out.println("Enter name:");
			String name=sc.next();
			System.out.println("Enter location:");
			String location=sc.next();
	//		Statement stmt= con.createStatement();
		
		String sq="insert into customer values(?,?,?)";
		PreparedStatement p=con.prepareStatement(sq);
		p.setInt(1,id);
		p.setString(2,name);
		p.setString(3,location);	
		
		
		
	//		String sql= "insert into customer values("+id+",'"+name+"','"+location+"')";
		//	String sq= "select * from customer";
			//execute statements
		
		
			int i=p.executeUpdate();
			
			
		//	ResultSet rs=stmt.executeQuery(sql);
			
		//	while(rs.next()) {
		//		System.out.println("Customer Id="+rs.getInt(1)+"  Customer Name"+rs.getString(2)+"  Location"+rs.getString(3));
		//	}
			System.out.println("Number of deleted rows:"+i);
			
			//close connection and object
			
			p.close();
			con.close();
			
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
