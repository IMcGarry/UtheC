import javax.swing.*;
import java.awt.event.*;

import java.sql.SQLException;


public class BookListener implements MouseListener {
    public String bookPath;

    public class BookListener implements MouseListener {
        private String bookPath;
        JDialog popUp = null;

        public BookListener(String path) {
            this.bookPath = path;
        }


        public void setBookPath(String s) {
            bookPath = s;
        }

        public String getBookPath() {
            return bookPath;
        }


        private void createPopUp(String bookPath) {
            popUp = new JDialog();
            popUp.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            popUp.setLocationRelativeTo(null);

            ImageIcon bookCover = new ImageIcon(bookPath);
            JLabel bookCoverLabel = new JLabel(bookCover);

            popUp.add(bookCoverLabel);

            popUp.setAlwaysOnTop(true);

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

            Object obj = e.getSource();
            if (obj instanceof BookLabelMaker) {
                setBookPath(((BookLabelMaker) obj).bookPath);
            }

            if (popUp == null) {
                createPopUp(bookPath);
                DatabaseController databaseController = new DatabaseController();
                try {
                    databaseController.GetBookDetails(bookPath);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }


                if (popUp == null) {
                    createPopUp(bookPath);

                }

            }

            @Override
            public void mousePressed (MouseEvent e){

            }

            @Override
            public void mouseReleased (MouseEvent e){

            }

            @Override
            public void mouseEntered (MouseEvent e){

            }

            @Override
            public void mouseExited (MouseEvent e){

            }
        }
    }
}