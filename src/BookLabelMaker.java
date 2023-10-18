import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BookLabelMaker extends JLabel {
    ImageIcon imageIc;

    public BookLabelMaker(String url){
        this.setBorder(new EmptyBorder(10, 10, 10, 10));
        Color lightBlue1 = Color.decode("#A4E6E6");
        try{
            File file = new File(url);
            BufferedImage ogPic = ImageIO.read(file);
            Image img = ogPic.getScaledInstance(200, 280, Image.SCALE_SMOOTH);
            imageIc = new ImageIcon(img);
            this.setIcon(imageIc);

        }
        catch(IOException e){
            e.printStackTrace();
        }
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setVerticalAlignment(SwingConstants.CENTER);
        this.setBackground(lightBlue1);

    }
}
