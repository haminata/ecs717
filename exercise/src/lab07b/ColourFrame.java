package lab07b;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by haminata on 03/12/2017.
 */
public class ColourFrame extends JFrame implements ActionListener {

    private JRadioButton buttonRed = new JRadioButton("Red");
    private JRadioButton buttonBlue = new JRadioButton("Blue");
    private JRadioButton buttonGreen = new JRadioButton("Green");
    private JPanel mainPanel = new JPanel();

    public ColourFrame() {
        this.setTitle("Radio Button Colour Frame");
        this.setSize(250,100);
        this.setVisible(true);

        ButtonGroup group = new ButtonGroup();
        group.add(buttonRed);
        group.add(buttonBlue);
        group.add(buttonGreen);

        JPanel p1 = new JPanel(new FlowLayout());
        p1.add(buttonRed);
        p1.add(buttonBlue);
        p1.add(buttonGreen);


        Container contain = this.getContentPane();

        contain.add(p1, BorderLayout.NORTH);
        contain.add(mainPanel, BorderLayout.CENTER);

        buttonRed.addActionListener(this);
        buttonBlue.addActionListener(this);
        buttonGreen.addActionListener(this);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent event) {
        JRadioButton source = (JRadioButton)event.getSource();
        Color colour = getBackground();

        if(source == buttonBlue)
            colour = Color.blue;

        else if(source == buttonGreen)
            colour = Color.green;

        else if(source == buttonRed)
            colour = Color.red;

        mainPanel.setBackground(colour);
        repaint();

    }

    public static void main(String args[]){
        new ColourFrame();
    }


}