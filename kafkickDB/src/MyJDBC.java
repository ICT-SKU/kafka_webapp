import java.sql.*;

public class MyJDBC {
    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/crawlingdb",
                    "root",
                    "1234"
            );

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from crawlingdata");

            while(rs.next()) {
                System.out.println(rs.getString("category"));
                System.out.println(rs.getString("time"));
                System.out.println(rs.getString("id"));
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }

    }
}
