/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallycounter;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import counterapplication.*;

class TallyCounter extends JFrame {
    Counter counter;
    JLabel label;
    JButton incrementButton;
    JButton resetButton;
    
    public TallyCounter() {
        
        counter = new Counter();
        label = new JLabel("" + counter.value(),
                           SwingConstants.CENTER);
        incrementButton = new JButton("Increment");
        resetButton = new JButton("Reset");
        
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 1));
        container.add(label);
        container.add(incrementButton);
        container.add(resetButton);
        
        class IncrementButtonHandler implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent event){
                counter.increment();
                update();
            }
        }
        
        IncrementButtonHandler ibh = new IncrementButtonHandler();
        incrementButton.addActionListener(ibh);
        
        class ResetButtonHandler implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent event){
                counter.reset();
                update();
            }
        }
        
        ResetButtonHandler rbh = new ResetButtonHandler();
        resetButton.addActionListener(rbh);
        
        setSize(150, 450);
        setVisible(true);
    }
    
    public void update() {
        label.setText("" + counter.value());
        repaint();
    }
    
    public static void main(String[] args){
        TallyCounter app = new TallyCounter();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

