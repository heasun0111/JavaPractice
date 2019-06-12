import java.awt.color.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Draw_RandomPanel extends JPanel
{
	  private Random randomNumbers = new Random();
	   public static Random_Poly[] polies;           
	   
	   public Draw_RandomPanel()
	   {
	      setBackground(Color.WHITE);
	      
	      if(Random_Draw.wedid == false) {
	      polies = new Random_Poly[5+randomNumbers.nextInt(5)];
	      
	      for(int count = 0; count < polies.length; count++) {
	      
	         int x1 = randomNumbers.nextInt(300);
	         int x2 = randomNumbers.nextInt(300);
	         int y1 = randomNumbers.nextInt(300);
	         int y2 = randomNumbers.nextInt(300);
	         
	         Color color = new Color(randomNumbers.nextInt(256),
	               randomNumbers.nextInt(256),randomNumbers.nextInt(256));
	         
	         polies[count] = new Random_Poly(x1,x2,y1,y2,color);
	         }
	      }
	   }
	   
	   public void paintComponent(Graphics g)
	   {
	      super.paintComponent(g);
	      
	      for(Random_Poly poly : polies)
	         if(poly!=null) {      
	         poly.draw(g);}
	   }


}
