import com.mysql.cj.conf.IntegerProperty;
import com.mysql.cj.conf.StringProperty;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayBookInfo extends JFrame implements WindowListener {
    private String title;
    private String author;
    private String publisher;
    private String price;
    private String genre;
    private String ISBN;
    private int quantity;

    private String bookPath;

    public DisplayBookInfo(ResultSet rs){
        this.bookPath = Main.bl.bookPath;
        try {
            while(rs.next()){
                title = rs.getString("title");
                author = rs.getString("author");
                publisher = rs.getString("publisher");
                price = rs.getString("price");
                genre = rs.getString("genre");
                ISBN = rs.getString("ISBN");
                quantity = rs.getInt("quantity");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("DBI: title(" + title + ") | author(" + author + ")| publisher(" + publisher + ")| price(" + price + ")| genre(" + genre + ")| ISBN(" + ISBN + ")| quantity(" + quantity + ") \n");


    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
