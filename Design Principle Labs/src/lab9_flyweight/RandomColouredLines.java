package lab9_flyweight;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class RandomColouredLines extends JFrame{
   private static final Color colors[] = { Color.red, Color.blue,
                                           Color.yellow, Color.orange,
                                           Color.black,  Color.white };
   private static final int WINDOW_WIDTH=400,
                            WINDOW_HEIGHT=400,
                           NUMBER_OF_LINES=10000;
   public RandomColouredLines() {
      Container contentPane = getContentPane();
      contentPane.setLayout(new BorderLayout());
      
      JButton button = new JButton("draw lines");
      final JPanel  panel  = new JPanel();
      contentPane.add(panel,  BorderLayout.CENTER);
      contentPane.add(button, BorderLayout.SOUTH);
      setBounds(20,20,WINDOW_WIDTH,WINDOW_HEIGHT);
      button.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent event) {
             Graphics g = panel.getGraphics();
             for(int i=0; i < NUMBER_OF_LINES; ++i) {
                Line line = LineFactory.getLine(getRandomColour());
                line.draw(g, getRandomXPos(), getRandomYPos(),
                		getRandomXPos(), getRandomYPos());
             }
          }
       });
    }
   public static void main(String[] args) {
      RandomColouredLines test = new RandomColouredLines();
      test.setVisible(true);
   }
   private int getRandomXPos() {
      return (int)(Math.random()*WINDOW_WIDTH);
   }
   private int getRandomYPos() {
      return (int)(Math.random()*WINDOW_HEIGHT);
   }
   private Color getRandomColour() {
      return colors[(int)(Math.random()*colors.length)];
   }
}