import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

public class Random_Poly
{

	   private int x1;
	   private int x2;
	   private int y1;
	   private int y2;
	   private Color mycolor;
	   
	   public Random_Poly(int x1, int x2, int y1, int y2, Color color) {
	      this.x1 = x1;
	      this.x2 = x2;
	      this.y1 = y1;
	      this.y2 = y2;
	      mycolor = color;
	   }
	   
	   public void draw(Graphics g) {
	      g.setColor(mycolor);               
	      if(Random_Draw.choose==1) {
	         g.drawLine(x1,y1,x2,y2);
	      }
	         
	      else if(Random_Draw.choose==2) {
	         g.drawOval(x1,y1,x2,y2);
	      }
	         
	      else if(Random_Draw.choose==3) {
	         g.drawRect(x1,y1,x2,y2);
	      }
	   }


}
