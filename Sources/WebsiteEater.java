//
//  WebsiteEater
//
//  This software is released subject to licensing conditions as detailed in 
//  Licence.txt.
//

import java.awt.*;
import javax.swing.*;

public class WebsiteEater {
 
    public static void main(String[] args) {
        if (args.length == 0) {
            AppController.getSharedController().showMainFrame();
        } else {
            executeCommandLine(args);
        }
    }    

    public static void executeCommandLine(String[] args) {
        System.out.println("Command line interface is not yet supported");
    }

}