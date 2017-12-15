package clientProject;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.CachedRowSet;
public class DataBase 
{
	private  Connection connDB;
	private String address;
	private String port;
	private String username;
	private String password;
	private String database;

	
public DataBase( String address, String port, String username, String password, String database) {
		super();
		this.connDB = null;
		this.database = database;
		this.port = port;
		this.username = username;
		this.password = password;
		this.address = address;
		
		conn();
	System.out.println(database);
	System.out.println(address);
	System.out.println(username);
	System.out.println(password);


}

void conn()
{
	try {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		String connString = "jdbc:mysql://"+this.address+":"+this.port+"/"+this.database;
		
		Connection conn = DriverManager.getConnection(
				connString, this.username , this.password);
		Statement stmt = conn.createStatement();
		
		this.connDB=conn;
		System.out.println("done");
	
	}
	catch(Exception ex)
	{
		System.out.println(ex);
		
	}
}

public Connection getConnection() {
	if (this.connDB != null)
		return this.connDB;
conn();
return this.connDB;
	
}

public List<Event> getAllEvents() {
	List<Event> events = new ArrayList<Event>();
    try {
        Statement statement = getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT events.id,  events.EventName as eventName,events.TimeStamp as TimeDate,concat( host.HostName, \"    \", HostMac.ip) as HostDetails, TypeEvents.Severity as SecurityLevel,events.summary  FROM sys.EVENTS   inner JOIN HostMac on events.HostID = HostMac.id  inner JOIN TypeEvents on TypeEvents.name = events.EventName  inner join Host on host.id=hostmac.id ;");
        System.out.println(resultSet);

        while( resultSet.next() ) {
            Event event = new Event();
            event.setId( resultSet.getString( "id" ) );
            event.setDateTime( resultSet.getString( "TimeDate" ));
            event.setName( resultSet.getString( "EventName" ) );
            //event.setHostID( resultSet.getString( "HostID" ) );
            event.setStatus( resultSet.getString("SecurityLevel"));
            event.setClient(resultSet.getString("HostDetails"));
            
            events.add(event);
            
        }
        resultSet.close();
        statement.close();
        return events;
    } catch (SQLException e) {
    		System.out.println(e.getMessage());
    		return null;
    }
    
}









}
