import java.awt.*;
import javax.swing.*;

public class AppController extends JFrame {
	
    JPanel jpanel = new JPanel();
    JButton jbutton = new JButton("Launch");	
	
	public AppController()  {
		this.setTitle("Website Eater");
	    this.setSize(600, 400);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	    this.setVisible(true);
	    this.setResizable(false); 
	    
	    jpanel.setBackground(Color.WHITE);  
	    jpanel.add(jbutton);
	    this.setContentPane(jpanel); 
	}	

	public static void main(String[] args){  	
		new AppController();	    
	}    
	
}