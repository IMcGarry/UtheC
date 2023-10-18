import java.sql.*;

public class DatabaseController {
    Connection con;
    DatabaseController(){
        EstablishConnection();
    }

    void EstablishConnection(){
        String hostString = "jdbc:mysql://localhost:3306/uthec";
        String dbUser = "root";
        String dbPass = "root";

        try {
            con = DriverManager.getConnection(hostString, dbUser, dbPass);
            //registerUser(con, user, pass);
        }
        catch(SQLException err){
            System.out.println(err.getMessage());
        }
    }

    void GetBookDetails(String bookPath) throws SQLException {
        String bookNameWithFP = bookPath.split("/")[1];
        String bookName = bookNameWithFP.split("\\.")[0];
        System.out.println(bookName);

        PreparedStatement ps = con.prepareStatement("SELECT * FROM books WHERE title LIKE ?");
        ps.setString(1, "%" + bookName + "%");

        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            System.out.println("Book exists");
        }
        else{
            System.out.println("Book does not exist");
        }
    }
}
