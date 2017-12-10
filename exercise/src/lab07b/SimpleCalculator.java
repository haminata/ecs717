package lab07b;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by haminata on 03/12/2017.
 */
public class SimpleCalculator extends JFrame implements ActionListener {
    private JButton num1;
    private JButton num2;
    private JButton num3;
    private JButton num4;
    private JButton num5;
    private JButton num6;
    private JButton num7;
    private JButton num8;
    private JButton num9;
    private JButton num0;
    private JButton dot;
    private JButton ce;
    private JTextField textArea;

    //step 1:
    public SimpleCalculator(){
        this.setTitle("Simple Calculator");
        this.setSize(400,400);
        this.setVisible(true);

        //step

        textArea = new JTextField(50);
        textArea.setHorizontalAlignment(JTextField.RIGHT);
        textArea.setEditable(false);

        JPanel mainPanel = new JPanel(new GridLayout(5, 5, 15, 15));
        getContentPane().add(mainPanel);
        mainPanel.add(num7 = new JButton("7"));
        mainPanel.add(num8 = new JButton("8"));
        mainPanel.add(num9 = new JButton("9"));
        mainPanel.add(num4 = new JButton("4"));
        mainPanel.add(num5 = new JButton("5"));
        mainPanel.add(num6 = new JButton("6"));
        mainPanel.add(num1 = new JButton("1"));
        mainPanel.add(num2 = new JButton("2"));
        mainPanel.add(num3 = new JButton("3"));
        mainPanel.add(num0 = new JButton("0"));
        mainPanel.add(dot = new JButton("."));
        mainPanel.add(ce = new JButton("CE"));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        Container display = this.getContentPane();
        display.add(textArea, BorderLayout.NORTH);
        display.add(mainPanel, BorderLayout.CENTER);


        num1.addActionListener(this);
         num2.addActionListener(this);
         num3.addActionListener(this);
         num4.addActionListener(this);
         num5.addActionListener(this);
         num6.addActionListener(this);
         num7.addActionListener(this);
         num8.addActionListener(this);
         num9.addActionListener(this);
         num0.addActionListener(this);
         dot.addActionListener(this);
         ce.addActionListener(this);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent event) {
        String text = textArea.getText();

        if(event.getSource() == num1){
            textArea.setText(text + "1");
        }else if (event.getSource() == num2){
            textArea.setText(text + "2");
        }else if (event.getSource() == num3){
            textArea.setText(text + "3");
        }else if (event.getSource() == num0){
            textArea.setText(text + "0");
        }else if (event.getSource() == num4){
            textArea.setText(text + "4");
        }else if (event.getSource() == num5){
            textArea.setText(text + "5");
        }else if (event.getSource() == num6){
            textArea.setText(text + "6");
        }else if (event.getSource() == num7){
            textArea.setText(text + "7");
        }else if (event.getSource() == num8){
            textArea.setText(text + "8");
        }else if (event.getSource() == num9){
            textArea.setText(text + "9");
        }else if (event.getSource() == dot) {
            textArea.setText(text + ".");
            if (!text.contains(".")){
                    textArea.setText(text + ".");
                 } else {
                textArea.setText(text);
            }
        }
        else if (event.getSource() == ce) {
            textArea.setText("");
        }


        };

    //step 1
    public static void main (String[] args){
        SimpleCalculator calc = new SimpleCalculator();
    }

}



