//
//  WebsiteEater
//
//  This software is released subject to licensing conditions as detailed in 
//  Licence.txt.
//

import java.awt.*;
import javax.swing.*;

public class AppController {
    
    // Properties
    
    private MainFrameController mainFrameController;
        
    // Constructors
    
    private static AppController sharedInstance = new AppController();

    public static AppController getSharedController() {
      return AppController.sharedInstance;
    }
    
    private AppController() {
        this.mainFrameController = new MainFrameController();
    }
    
    // Getters / Setters
    
    public MainFrameController getMainFrameController() {
        return this.mainFrameController;
    }
    
    // Manage frames
    
    public void showMainFrame() {
        this.mainFrameController.showFrame();
    }
    
}