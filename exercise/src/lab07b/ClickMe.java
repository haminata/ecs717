package lab07b;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

/**
 * Created by haminata on 03/12/2017.
 */
public class ClickMe extends JFrame implements ActionListener{

    private JButton[] box = new JButton[9];
    private JPanel mainPanel1;
    private int secret;
    private String clear;



    public ClickMe() {
        this.setTitle("Catch me if you can!");
        this.setSize(500, 500);

        mainPanel1 = new JPanel(new GridLayout(3,3, 3, 3));
        for (int i = 0; i< box.length; i++){
            box[i]= new JButton();
            mainPanel1.add(box[i]);
        }

        Container di = this.getContentPane();
        di.add(mainPanel1, BorderLayout.CENTER);
        this.setVisible(true);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        chngeBox();
    }
    public int ranDom(){
        Random gen = new Random(9);
            return gen.nextInt();

    }

    public void clearAll(){
        for (int i = 0; i < 9; i++) {
            box[i].setText("");

        }

    }

    public void chngeBox(){
        clearAll();
        secret = ranDom();
        box[secret].setText("Click Me");

    }
    public void actionPerformed(ActionEvent event) {


    }



    public static void main (String[] args){
        ClickMe click = new ClickMe();
        click.chngeBox();
    }

}