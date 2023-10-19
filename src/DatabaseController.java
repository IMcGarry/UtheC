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

        /*PreparedStatement ps = con.prepareStatement("SELECT * FROM books WHERE title LIKE ? AND hardcover=false");
        ps.setString(1, "%" + bookName + "%");*/
        PreparedStatement ps = con.prepareStatement("SELECT t1.title, t1.price, t1.ISBN, t1.quantity, t2.name AS author, t3.name AS genre, t4.company_name AS publisher FROM books AS t1 LEFT JOIN authors AS t2 ON t1.authorID=t2.authorID LEFT JOIN genres AS t3 ON t1.genreID=t3.genreID LEFT JOIN publishers AS t4 ON t1.publisherID=t4.publisherID WHERE t1.title LIKE ? AND t1.hardcover=0;");
        ps.setString(1, "%" + bookName + "%");

        ResultSet rs = ps.executeQuery();
        DisplayBookInfo DBI = new DisplayBookInfo(rs);
        if(rs.next()){
            System.out.println("Book exists");
        }
        else{
            System.out.println("Book does not exist");
        }
    }
}
