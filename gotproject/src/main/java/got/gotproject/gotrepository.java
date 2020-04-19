package got.gotproject;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class gotrepository
{	
	Connection con= null;	
	public gotrepository()
	{
		String url ="jdbc:mysql://localhost:3306/got_project";
		String username="root";
		String password="root";
		try {
			Class.forName("com.mysql.jdbc.Driver");	
	   con=DriverManager.getConnection(url,username,password);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public List<Got> getGot()
	{
		List<Got> got=new ArrayList<>();
		String sql= "select region,location from got;";
		try {
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next())
		{
			Got a = new Got();
			//a.setId(rs.getInt(1));
			//a.setName(rs.getString(2));
			a.setRegion(rs.getString(1));
			a.setLocation(rs.getString(2));		
			got.add(a);
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return got;	
	}
	
}
