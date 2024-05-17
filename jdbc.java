import java.sql.*;

public class jdbc {
    public static void main(String[] args) {
        try{
            //load and register the driver
            Class.forName(com.sql.cj.jdbc.Driver);
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ems", null "name", "pwd");
            Statement st = connection.createStatement();
            ResultSet re = st.executeQuery("select * from students");
            while(re.next()){
                System.out.println(re.getString("students"));
                System.out.println(re.getInt("marks"));

            }
            con.close();


        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
