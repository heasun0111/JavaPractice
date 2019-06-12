import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Random_Draw {
	static int choose=0;                  
	   static int delete = 0;                  
	   static boolean wedid = false;            
	   static String message = "deleted";
	   
	   public static void main(String[] args)
	   {   
	         String number = 
	               JOptionPane.showInputDialog("Choose Type of Draw. 1. Line  2. Cicle  3. Square ").trim();
	         if(number!=null) {
	          choose = Integer.parseInt(number);}
	         
	            JFrame application = new JFrame();
	            application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            Draw_RandomPanel panel = new Draw_RandomPanel();
	            application.add( panel );
	            application.setSize(500,500);
	            application.setVisible(true);
	            wedid = true;

	         while(true) {
	            number = 
	                  JOptionPane.showInputDialog("Choose Number for Delete, 0 is EXIT").trim();
	            if(number!=null) {
	                delete = Integer.parseInt(number);}
	            
	            if(delete == 0) {
	               break;
	            }
	            
	            else {
	               Draw_RandomPanel.polies[delete] = null; 
	               panel.repaint();                          
	            }
	         }   
	   }


}
