package lab07b;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by haminata on 03/12/2017.
 */
public class ColourFrame extends JFrame {

    public ColourFrame() {
        super();

        JRadioButton buttonRed = new JRadioButton("Red");
        JRadioButton buttonBlue = new JRadioButton("Blue");
        JRadioButton buttonGreen = new JRadioButton("Green");

        add(buttonRed);
        add(buttonBlue);
        add(buttonGreen);

        setLayout(new FlowLayout());

        ButtonGroup group = new ButtonGroup();
        group.add(buttonRed);
        group.add(buttonBlue);
        group.add(buttonGreen);



        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {

              if(event.getSource() == buttonBlue){
                  changeBackgroundC(Color.blue);

              }else if(event.getSource() == buttonGreen){
                  changeBackgroundC(Color.green);

              }else if(event.getSource() == buttonRed){
                    changeBackgroundC(Color.red);
                }

            }
        };

        buttonRed.addActionListener(listener);
        buttonBlue.addActionListener(listener);
        buttonGreen.addActionListener(listener);

        this.setTitle("Colour Frame");
        this.setSize(250,100);
        this.setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void changeBackgroundC(Color newColour){
        this.getContentPane().setBackground(newColour);
    }

    public static void main(String args[]){
        ColourFrame myFrame = new ColourFrame();
    }


}
