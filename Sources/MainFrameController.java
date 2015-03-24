//
//  WebsiteEater
//
//  This software is released subject to licensing conditions as detailed in 
//  Licence.txt.
//

import java.awt.*;
import javax.swing.*;

public class MainFrameController {
	
	// Properties
	
	JFrame frame = new JFrame();
	
    JPanel panel = new JPanel();
	
    JButton button = new JButton("Launch");
	
	// Contructors
	
	public MainFrameController() {
		this.frame.setTitle("Website Eater");
	    this.frame.setSize(600, 400);
	    this.frame.setLocationRelativeTo(null);
	    this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
	    this.frame.setResizable(false); 
	    
	    this.panel.setBackground(Color.WHITE);  
	    this.panel.add(this.button);
	    this.frame.setContentPane(this.panel); 
	}
	
	// Getters / Setters
	
	public JFrame getFrame() {
		return this.frame;
	}
	
	// Manage window state
	
	public void showFrame() {        
	    this.frame.setVisible(true);
	}
	
	public void hideFrame() {        
	    this.frame.setVisible(false);
	}
	
}