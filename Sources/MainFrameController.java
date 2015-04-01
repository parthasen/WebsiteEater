//
//  WebsiteEater
//
//  This software is released subject to licensing conditions as detailed in 
//  Licence.txt.
//

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

public class MainFrameController {

    // UI elements
    
    private JFrame frame = new JFrame();

    private JPanel panel = new JPanel();

    private PlaceholderTextField websiteUrlField = new PlaceholderTextField();

    private PlaceholderTextField outputUrlField = new PlaceholderTextField();

    private JButton launchButton = new JButton("Launch");

    private JButton outputButton = new JButton("Output");
    
    private JTextArea logTextArea = new JTextArea();

    // Contructors
    
    public MainFrameController() {
        this.setupFrame();
        this.setupUIElements();
    }

    private void setupFrame() {
        this.frame.setTitle("Website Eater");
        this.frame.setSize(600, 500);
        this.frame.setLocationRelativeTo(null);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setResizable(false);
        this.frame.setBackground(Color.WHITE);
        this.frame.setContentPane(this.panel);
    }

    private void setupUIElements() {
        this.frame.setLayout(null);
        
        this.websiteUrlField.setBounds(new Rectangle(4, 10, 520, 22));
        this.websiteUrlField.setPlaceholder("Website URL");
        this.frame.add(this.websiteUrlField);
        
        ActionPerformer performer = new ActionPerformer(this, "launch");
        this.launchButton.addActionListener(performer);
        this.launchButton.setBounds(new Rectangle(530, 10, 60, 22));
        this.frame.add(this.launchButton);
        
        this.outputUrlField.setBounds(new Rectangle(4, 40, 520, 22));
        this.outputUrlField.setPlaceholder("Output directory path");
        this.frame.add(this.outputUrlField);
        
        performer = new ActionPerformer(this, "chooseOutputFolder");
        this.outputButton.addActionListener(performer);
        this.outputButton.setBounds(new Rectangle(530, 40, 60, 22));
        this.frame.add(this.outputButton);
        
        this.logTextArea.setBorder(LineBorder.createBlackLineBorder());
        this.logTextArea.setBounds(new Rectangle(6, 70, 588, 400));
        this.logTextArea.setEditable(false);
        this.logTextArea.append("Nothing to do...");
        this.frame.add(this.logTextArea);
    }

    // Getters / Setters

    public JFrame getFrame() {
        return this.frame;
    }
    
    // Actions
    
    public void launch(ActionEvent e) {
        System.out.println("LAUNCH");
    }
    
    public void chooseOutputFolder(ActionEvent e) {
        System.out.println("CHOOSE OUTPUT FOLDER");
    }

    // Manage window state

    public void showFrame() {
        this.frame.setVisible(true);
    }

    public void hideFrame() {
        this.frame.setVisible(false);
    }

}