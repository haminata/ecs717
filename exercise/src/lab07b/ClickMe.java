package lab07b;

        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;
        import java.util.Random;
        import java.awt.BorderLayout;

/**
 * Created by haminata on 03/12/2017.
 */
public class ClickMe extends JFrame implements MouseMotionListener{

    private JButton[] box = new JButton[9];
    private JPanel mainPanel1;
    private int randomBox;

    public ClickMe() {
        this.setTitle("Catch me if you can!");
        this.setSize(500, 500);
        this.setVisible(true);

        mainPanel1 = new JPanel(new GridLayout(3,3, 3, 3));
        for (int i = 0; i< box.length; i++){
            box[i]= new JButton();
            mainPanel1.add(box[i]);
        }

        Container di = this.getContentPane();
        di.add(mainPanel1, BorderLayout.CENTER);

        randomBox = ranDom();
        box[randomBox].setText("Click Me");
        box[randomBox].addMouseMotionListener(this);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
    public int ranDom(){
        Random gen = new Random();
        int random = gen.nextInt(9);
        return random;
    }

    public void mouseDragged(MouseEvent e){

    }

    public void mouseMoved(MouseEvent e){
        box[randomBox].removeMouseMotionListener(this);
        box[randomBox].setText("");
        int newRandom = ranDom();

        box[newRandom].addMouseMotionListener(this);
        box[newRandom].setText("Click Me");
        randomBox = newRandom;
    }

    public static void main (String[] args){
        ClickMe click = new ClickMe();
    }

}