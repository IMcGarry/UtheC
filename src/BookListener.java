import javax.swing.*;
import java.awt.event.*;
<<<<<<< HEAD
=======
import java.sql.SQLException;
>>>>>>> 5415c1b936c2c3d293bc7986a7d2996151ef9343

public class BookListener implements MouseListener {
    private String bookPath;
    JDialog popUp = null;
    public BookListener(String path){
        this.bookPath = path;
    }

    private void createPopUp(String bookPath){
        popUp = new JDialog();
        popUp.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        popUp.setLocationRelativeTo(null);

        ImageIcon bookCover = new ImageIcon(bookPath);
        JLabel bookCoverLabel = new JLabel(bookCover);

        popUp.add(bookCoverLabel);
        popUp.pack();
        popUp.setVisible(true);

        popUp.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                popUp = null;
            }
        });

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(popUp == null){
            createPopUp(bookPath);
<<<<<<< HEAD
=======
            DatabaseController databaseController = new DatabaseController();
            try {
                databaseController.GetBookDetails(bookPath);
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
>>>>>>> 5415c1b936c2c3d293bc7986a7d2996151ef9343
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
