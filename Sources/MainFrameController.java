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
    
    JButton button = new JButton("North");
    
    // Contructors
    
    public MainFrameController() {
        this.setupFrame();
		this.setupLayout();
    }
	
	private void setupFrame() {
        this.frame.setTitle("Website Eater");
        this.frame.setSize(600, 400);
        this.frame.setLocationRelativeTo(null);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        this.frame.setResizable(true); 
        
        this.panel.setBackground(Color.WHITE);  
        //this.panel.add(this.button);
        this.frame.setContentPane(this.panel); 
	}
	
	private void setupLayout() {

		this.frame.setLayout(new BorderLayout());		    
		JButton buttonNorth = new JButton("North");
		Dimension dimNorth = new Dimension(600, 100);
		buttonNorth.setPreferredSize(dimNorth);
		this.panel.add(buttonNorth, BorderLayout.NORTH);
		
		JButton buttonCenter = new JButton("Center");
		this.panel.add(buttonCenter, BorderLayout.CENTER);
		
		
			
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