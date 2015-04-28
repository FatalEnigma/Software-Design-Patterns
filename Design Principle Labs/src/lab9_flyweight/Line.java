package lab9_flyweight;

import java.awt.*;
public class Line {
   private Color colour;
   
   public Line(Color colour) {
      this.colour = colour;
   }
   public void draw(Graphics g, int x, int y, int x2, int y2) {
      g.setColor(colour);
      g.drawLine(x, y, x2, y2);
   }
}
