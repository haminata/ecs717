package lab07b;

import javax.swing.*;
import java.awt.*;

/**
 * Created by haminata on 03/12/2017.
 */
public class SimpleCalculator extends JFrame{

    public SimpleCalculator(){
        super();


    }
    public void addComponentsToPane(final Container pane) {

        final JPanel compsToExperiment = new JPanel();
        compsToExperiment.setLayout(experimentLayout);
        JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(2,3));
}
