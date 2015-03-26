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
        this.panel.add(this.button);
        this.frame.setContentPane(this.panel); 
	}
	
	private void setupLayout() {

		this.frame.setLayout(new BorderLayout());
		    //On ajoute le bouton au content pane de la JFrame
		    //Au centre
		    this.panel.add(new JButton("CENTER"), BorderLayout.CENTER);
		    //Au nord
		    this.panel.add(new JButton("NORTH"), BorderLayout.NORTH);
		    //Au sud
		    this.panel.add(new JButton("SOUTH"), BorderLayout.SOUTH);
		    //À l'ouest
		    this.panel.add(new JButton("WEST"), BorderLayout.WEST);
		    //À l'est
			JButton button = new JButton("EAST");
			Dimension dim = new Dimension(200, 200);
			button.setPreferredSize(dim);
		    this.panel.add(button, BorderLayout.EAST);
			
		/*
	    this.frame.setLayout(new GridLayout(3, 2));
		

	    this.panel.add(new JButton("1"));
	    this.panel.add(new JButton("2"));
	    this.panel.add(new JButton("3"));
	    this.panel.add(new JButton("4"));
	    this.panel().add(new JButton("5"));*/
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