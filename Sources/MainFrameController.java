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

	//Panel for the panelCenter
	JPanel panelCenterCenter = new JPanel();

	//Panel for the north panel
	JPanel panelNorthCenter = new JPanel();	

	JPanel panelNorthCenterCenter = new JPanel();		//panel for both text field
	JPanel panelNorthCenterCenterCenter = new JPanel();	//panel for directory text field
	JPanel panelNorthCenterCenterNorth = new JPanel();	//panel for url text field

	JPanel panelNorthCenterEast = new JPanel();			//panel for both buttons
	JPanel panelNorthCenterEastCenter = new JPanel();	//panel for directory button
	JPanel panelNorthCenterEastNorth = new JPanel();	//panel for launch button

	//Button
	JButton launch = new JButton("Launch");
	JButton directoryChooserButton = new JButton("Dir");

	// Contructors
	public MainFrameController() {
		this.setupMainFrame();
		this.setupMainLayout();
	}

	private void setupMainFrame() {
		this.frame.setTitle("Website Eater");
		this.frame.setSize(600, 500);
		this.frame.setLocationRelativeTo(null);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		this.frame.setResizable(false); 		
		this.frame.setBackground(Color.WHITE);  
		this.frame.setContentPane(this.panel); 
		//Dimension dimMaximumWindowSize = new Dimension(800, 800);
		//this.frame.setMaximumSize(dimMaximumWindowSize);
	}

	private void setupMainLayout() {
		this.frame.setLayout(new BorderLayout());
		Dimension dimPanelNorth = new Dimension(600, 120);
		panelNorth.setPreferredSize(dimPanelNorth);
		this.panel.add(panelNorth, BorderLayout.NORTH);	
		panelCenterCenter.setBorder(BorderFactory.createLineBorder(Color.black));
		panelCenterCenter.setBackground(Color.WHITE);
		this.panel.add(panelCenterCenter, BorderLayout.CENTER);	
		this.panel.add(new JPanel(), BorderLayout.EAST);
		this.panel.add(new JPanel(), BorderLayout.SOUTH);
		this.panel.add(new JPanel(), BorderLayout.WEST);	
		this.setupPanelNorthLayout();
	}

	private void setupPanelNorthLayout() {
		panelNorth.setLayout(new BorderLayout());
		panelNorth.add(new JPanel(), BorderLayout.EAST);
		panelNorth.add(new JPanel(), BorderLayout.NORTH);
		panelNorth.add(new JPanel(), BorderLayout.SOUTH);
		panelNorth.add(new JPanel(), BorderLayout.WEST);
		//panelNorthCenter.setBackground(Color.BLUE);
		panelNorth.add(panelNorthCenter, BorderLayout.CENTER);

		panelNorthCenter.setLayout(new BorderLayout());			
		panelNorthCenterEast.setPreferredSize(new Dimension(80, 10));
		//panelNorthCenterEast.setBackground(Color.GREEN);
		panelNorthCenter.add(panelNorthCenterEast, BorderLayout.EAST);
		//panelNorthCenterCenter.setBackground(Color.BLACK);
		panelNorthCenter.add(panelNorthCenterCenter, BorderLayout.CENTER);

		panelNorthCenterEast.setLayout(new BorderLayout());
		panelNorthCenterEastNorth.setPreferredSize(new Dimension(0, 50));
		//panelNorthCenterEastNorth.setBackground(Color.GREEN);
		panelNorthCenterEast.add(panelNorthCenterEastNorth, BorderLayout.NORTH);
		launch.setPreferredSize(new Dimension(80, 40));
		panelNorthCenterEastNorth.add(launch);		
		panelNorthCenterEast.add(panelNorthCenterEastCenter, BorderLayout.CENTER);
		directoryChooserButton.setPreferredSize(new Dimension(80, 40));
		panelNorthCenterEastCenter.add(directoryChooserButton);

		panelNorthCenterCenter.setLayout(new BorderLayout());
		panelNorthCenterCenterNorth.setPreferredSize(new Dimension(0, 50));
		//panelNorthCenterEastNorth.setBackground(Color.GREEN);
		panelNorthCenterCenter.add(panelNorthCenterCenterNorth, BorderLayout.NORTH);
		JTextField url = new JTextField("URL HERE");
		url.setPreferredSize(new Dimension(490, 41));
		panelNorthCenterCenterNorth.add(url);

		panelNorthCenterCenter.add(panelNorthCenterCenterCenter, BorderLayout.CENTER);
		JTextField directory = new JTextField("DIRECTORY");
		directory.setPreferredSize(new Dimension(490, 41));
		panelNorthCenterCenterCenter.add(directory);

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