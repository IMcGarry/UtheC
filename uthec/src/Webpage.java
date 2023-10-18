import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

public class Webpage extends JFrame {
    Color darkBlue1;
    Color lightBlue1;
    double width;
    double height;
    public Webpage(){
        //Styling
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        width = dim.getWidth() - 100;
        height = dim.getHeight() - 500;
        darkBlue1 = Color.decode("#070C44");
        lightBlue1 = Color.decode("#A4E6E6");

        //Cursor
        try{
            Image ghost = ImageIO.read(new File("Book images/cursor.png"));
            Cursor ghostCursor = Toolkit.getDefaultToolkit().createCustomCursor(ghost, new Point(0,0), "ghostCursor");
            this.setCursor(ghostCursor);
        }
        catch(IOException e){
            e.printStackTrace();
        }


        //Set up window
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(dim));
        this.setLayout(new BorderLayout());

        /**Set up header**/
        //Header Panel
        JPanel header = new JPanel();
        header.setBackground(darkBlue1);
        header.setPreferredSize(new Dimension((int)width, 200));
        header.setLayout(new BorderLayout());
        header.setVisible(true);
        //Logo
        try{
            Image logo = ImageIO.read(new File("Book images/Logo.png"));
            Image scaledLogo = logo.getScaledInstance(300, 200, Image.SCALE_SMOOTH);
            ImageIcon logoII = new ImageIcon(scaledLogo);
            JLabel logoMe = new JLabel(logoII);
            header.add(logoMe, BorderLayout.WEST);
        }
        catch(IOException e){
            e.printStackTrace();
        }



        //Set up footer
        JPanel footer = new JPanel();
        footer.setBackground(darkBlue1);
        footer.setPreferredSize(new Dimension((int)width, 100));
        footer.setVisible(true);

        //Set up Main Panel
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(lightBlue1);
        mainPanel.setLayout(new BorderLayout());
        //mainPanel.setOpaque(true);

        //Set up Scroll pane
        JScrollPane scrollFrame = new JScrollPane();
        scrollFrame.setPreferredSize(new Dimension((int)width, (int)height));

        //Set up grid display
        JPanel grid = new JPanel();
        grid.setLayout(new GridLayout(9, 5));
        grid.setBackground(lightBlue1);
        grid.setVisible(true);

        /** Creating Book labels -- START **/
        //Hawking
        BookLabelMaker briefHisTime = new BookLabelMaker("Book images/A brief history of time hawking.jpeg");
        briefHisTime.addMouseListener(new BookListener("Book images/A brief history of time hawking.jpeg"));
        grid.add(briefHisTime);
        BookLabelMaker briefAnsBigQs = new BookLabelMaker("Book images/Brief answers to big questions.jpg");
        briefAnsBigQs.addMouseListener(new BookListener("Book images/Brief answers to big questions.jpg"));
        grid.add(briefAnsBigQs);
        BookLabelMaker theoryOfAll = new BookLabelMaker("Book images/the theory of everything hawking.jpeg");
        theoryOfAll.addMouseListener(new BookListener("Book images/the theory of everything hawking.jpeg"));
        grid.add(theoryOfAll);
        BookLabelMaker uniInNutshell = new BookLabelMaker("Book images/the universe in a nutshell hawking.jpeg");
        uniInNutshell.addMouseListener(new BookListener("Book images/the universe in a nutshell hawking.jpeg"));
        grid.add(uniInNutshell);

        //Tolkien
        BookLabelMaker hobbit = new BookLabelMaker("Book images/The Hobbit.jpg");
        hobbit.addMouseListener(new BookListener("Book images/The Hobbit.jpg"));
        grid.add(hobbit);
        BookLabelMaker silmarillion = new BookLabelMaker("Book images/The Silmarillion.jpg");
        silmarillion.addMouseListener(new BookListener("Book images/The Silmarillion.jpg"));
        grid.add(silmarillion);
        BookLabelMaker fellowship = new BookLabelMaker("Book images/The Fellowship of the Ring.jpg");
        fellowship.addMouseListener(new BookListener("Book images/The Fellowship of the Ring.jpg"));
        grid.add(fellowship);
        BookLabelMaker twoTowers = new BookLabelMaker("Book images/The Two Towers.jpg");
        twoTowers.addMouseListener(new BookListener("Book images/The Two Towers.jpg"));
        grid.add(twoTowers);
        BookLabelMaker returnOfKing = new BookLabelMaker("Book images/The Return of the King.jpg");
        returnOfKing.addMouseListener(new BookListener("Book images/The Return of the King.jpg"));
        grid.add(returnOfKing);

        //Rowling
        BookLabelMaker hp1 = new BookLabelMaker("Book images/HP1.jpg");
        hp1.addMouseListener(new BookListener("Book images/HP1.jpg"));
        grid.add(hp1);
        BookLabelMaker hp2 = new BookLabelMaker("Book images/HP2.jpg");
        hp2.addMouseListener(new BookListener("Book images/HP2.jpg"));
        grid.add(hp2);
        BookLabelMaker hp3 = new BookLabelMaker("Book images/HP3.jpg");
        hp3.addMouseListener(new BookListener("Book images/HP3.jpg"));
        grid.add(hp3);
        BookLabelMaker hp4 = new BookLabelMaker("Book images/HP4.jpg");
        hp4.addMouseListener(new BookListener("Book images/HP4.jpg"));
        grid.add(hp4);
        BookLabelMaker hp5 = new BookLabelMaker("Book images/HP5.jpg");
        hp5.addMouseListener(new BookListener("Book images/HP5.jpg"));
        grid.add(hp5);
        BookLabelMaker hp6 = new BookLabelMaker("Book images/HP6.jpg");
        hp6.addMouseListener(new BookListener("Book images/HP6.jpg"));
        grid.add(hp6);
        BookLabelMaker hp7 = new BookLabelMaker("Book images/HP7.jpg");
        hp7.addMouseListener(new BookListener("Book images/HP7.jpg"));
        grid.add(hp7);
        BookLabelMaker fantasticBeasts = new BookLabelMaker("Book images/Fantastic Beasts and Where to Find Them.jpg");
        fantasticBeasts.addMouseListener(new BookListener("Book images/Fantastic Beasts and Where to Find Them.jpg"));
        grid.add(fantasticBeasts);

        //Brown
        BookLabelMaker davinci = new BookLabelMaker("Book images/Da Vinci Code.jpg");
        davinci.addMouseListener(new BookListener("Book images/Da Vinci Code.jpg"));
        grid.add(davinci);
        BookLabelMaker angelsAndDemons = new BookLabelMaker("Book images/Angels and Demons.jpg");
        angelsAndDemons.addMouseListener(new BookListener("Book images/Angels and Demons.jpg"));
        grid.add(angelsAndDemons);
        BookLabelMaker inferno = new BookLabelMaker("Book images/Inferno.jpg");
        inferno.addMouseListener(new BookListener("Book images/Inferno.jpg"));
        grid.add(inferno);
        BookLabelMaker origin = new BookLabelMaker("Book images/origin brown.jpeg");
        origin.addMouseListener(new BookListener("Book images/origin brown.jpeg"));
        grid.add(origin);
        BookLabelMaker deceptPoint = new BookLabelMaker("Book images/deception point brown.jpeg");
        deceptPoint.addMouseListener(new BookListener("Book images/deception point brown.jpeg"));
        grid.add(deceptPoint);
        BookLabelMaker digFortress = new BookLabelMaker("Book images/digital fortress brown.jpeg");
        digFortress.addMouseListener(new BookListener("Book images/digital fortress brown.jpeg"));
        grid.add(digFortress);
        BookLabelMaker lostSym = new BookLabelMaker("Book images/The Lost Symbol.jpg");
        lostSym.addMouseListener(new BookListener("Book images/The Lost Symbol.jpg"));
        grid.add(lostSym);

        //Gibson
        BookLabelMaker neuromancer = new BookLabelMaker("Book images/Neuromancer.jpg");
        neuromancer.addMouseListener(new BookListener("Book images/Neuromancer.jpg"));
        grid.add(neuromancer);
        BookLabelMaker burningChrome = new BookLabelMaker("Book images/Burning Chrome.jpg");
        burningChrome.addMouseListener(new BookListener("Book images/Burning Chrome.jpg"));
        grid.add(burningChrome);
        BookLabelMaker miraWork = new BookLabelMaker("Book images/The Miracle Worker.jpg");
        miraWork.addMouseListener(new BookListener("Book images/The Miracle Worker.jpg"));
        grid.add(miraWork);

        //Grisham
        BookLabelMaker sparPart = new BookLabelMaker("Book images/Sparring Partners.jpg");
        sparPart.addMouseListener(new BookListener("Book images/Sparring Partners.jpg"));
        grid.add(sparPart);
        BookLabelMaker time4Mercy = new BookLabelMaker("Book images/a time for mercy grisham.jpeg");
        time4Mercy.addMouseListener(new BookListener("Book images/a time for mercy grisham.jpeg"));
        grid.add(time4Mercy);
        BookLabelMaker litigators = new BookLabelMaker("Book images/The Litigators.jpg");
        litigators.addMouseListener(new BookListener("Book images/The Litigators.jpg"));
        grid.add(litigators);
        BookLabelMaker reckoning = new BookLabelMaker("Book images/The Reckoning.jpg");
        reckoning.addMouseListener(new BookListener("Book images/The Reckoning.jpg"));
        grid.add(reckoning);
        BookLabelMaker whistler = new BookLabelMaker("Book images/the whistler grisham.jpeg");
        whistler.addMouseListener(new BookListener("Book images/the whistler grisham.jpeg"));
        grid.add(whistler);
        BookLabelMaker confession = new BookLabelMaker("Book images/the confession grisham.jpeg");
        confession.addMouseListener(new BookListener("Book images/the confession grisham.jpeg"));
        grid.add(confession);
        BookLabelMaker caminoGhosts = new BookLabelMaker("Book images/camino ghosts grisham.jpeg");
        caminoGhosts.addMouseListener(new BookListener("Book images/camino ghosts grisham.jpeg"));
        grid.add(caminoGhosts);
        BookLabelMaker caminoWinds = new BookLabelMaker("Book images/camino winds grisham.jpeg");
        caminoWinds.addMouseListener(new BookListener("Book images/camino winds grisham.jpeg"));
        grid.add(caminoWinds);
        BookLabelMaker caminoIsland = new BookLabelMaker("Book images/camino island grisham.jpeg");
        caminoIsland.addMouseListener(new BookListener("Book images/camino island grisham.jpeg"));
        grid.add(caminoIsland);

        //Hesse
        BookLabelMaker steppenwolf = new BookLabelMaker("Book images/Steppenwolf.jpg");
        steppenwolf.addMouseListener(new BookListener("Book images/Steppenwolf.jpg"));
        grid.add(steppenwolf);
        BookLabelMaker siddhartha = new BookLabelMaker("Book images/siddhartha hesse.jpeg");
        siddhartha.addMouseListener(new BookListener("Book images/siddhartha hesse.jpeg"));
        grid.add(siddhartha);
        BookLabelMaker rosshalde = new BookLabelMaker("Book images/rosshalde hesse.jpg");
        rosshalde.addMouseListener(new BookListener("Book images/rosshalde hesse.jpg"));
        grid.add(rosshalde);
        BookLabelMaker demian = new BookLabelMaker("Book images/demian hesse.jpg");
        demian.addMouseListener(new BookListener("Book images/demian hesse.jpg"));
        grid.add(demian);
        BookLabelMaker glassBead = new BookLabelMaker("Book images/the glass bead game hesse.jpeg");
        glassBead.addMouseListener(new BookListener("Book images/the glass bead game hesse.jpeg"));
        grid.add(glassBead);

        //Murakami
        BookLabelMaker kafkaShore = new BookLabelMaker("Book images/kafka on the shore murakami.jpeg");
        kafkaShore.addMouseListener(new BookListener("Book images/kafka on the shore murakami.jpeg"));
        grid.add(kafkaShore);
        BookLabelMaker norWood = new BookLabelMaker("Book images/norwegian wood murakami.jpg");
        norWood.addMouseListener(new BookListener("Book images/norwegian wood murakami.jpg"));
        grid.add(norWood);
        BookLabelMaker iq84 = new BookLabelMaker("Book images/iq84 murakami.jpeg");
        iq84.addMouseListener(new BookListener("Book images/iq84 murakami.jpeg"));
        grid.add(iq84);
        BookLabelMaker firstPersonSing = new BookLabelMaker("Book images/first person singular murakami.jpeg");
        firstPersonSing.addMouseListener(new BookListener("Book images/first person singular murakami.jpeg"));
        grid.add(firstPersonSing);

        /*BookLabelMaker name = new BookLabelMaker("path");
        grid.add(name);*/

        /** Creating book labels -- END **/


        //Adding grid to mainPanel
        mainPanel.add(grid, BorderLayout.CENTER);

        //Set up mainPanel as viewport for scroll pane
        scrollFrame.setViewportView(mainPanel);

        this.add(header, BorderLayout.NORTH);
        this.add(scrollFrame, BorderLayout.CENTER);
        this.add(footer, BorderLayout.SOUTH);
        this.pack();
        this.setVisible(true);
    }
}
