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

	//Panel for the main Layout
	JPanel panelNorth = new JPanel();
	JPanel panelCenter = new JPanel();	

	// Contructors

	public MainFrameController() {
		this.mainSetupFrame();
		this.mainSetupLayout();
		//this.panelNorthSetupLayout();
	}

	private void mainSetupFrame() {
		this.frame.setTitle("Website Eater");
		this.frame.setSize(600, 400);
		this.frame.setLocationRelativeTo(null);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		this.frame.setResizable(false);         

		//Dimension dimMaximumWindowSize = new Dimension(800, 800);
		//this.frame.setMaximumSize(dimMaximumWindowSize);
		this.frame.setBackground(Color.WHITE);  
		this.frame.setContentPane(this.panel); 
	}

	private void mainSetupLayout() {
		this.frame.setLayout(new BorderLayout());
		Dimension dimPanelNorth = new Dimension(600, 100);
		panelNorth.setPreferredSize(dimPanelNorth);
		panelNorth.setBackground(Color.YELLOW);
		this.panel.add(panelNorth, BorderLayout.NORTH);		
		panelCenter.setBackground(Color.BLACK);
		this.panel.add(panelCenter, BorderLayout.CENTER);	
		this.panel.add(new JPanel(), BorderLayout.EAST);
		this.panel.add(new JPanel(), BorderLayout.SOUTH);
		this.panel.add(new JPanel(), BorderLayout.WEST);					
	}

	private void panelNorthSetupLayout() {
		panelNorth.setLayout(new BorderLayout());
		this.panel.add(new JPanel(), BorderLayout.EAST);
		this.panel.add(new JPanel(), BorderLayout.SOUTH);
		this.panel.add(new JPanel(), BorderLayout.WEST);
		this.panel.add(new JPanel(), BorderLayout.CENTER);
		this.panel.add(new JPanel(), BorderLayout.NORTH);
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