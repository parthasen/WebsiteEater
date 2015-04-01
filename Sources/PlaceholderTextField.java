//
//  WebsiteEater
//
//  This software is released subject to licensing conditions as detailed in 
//  Licence.txt.
//

import java.awt.*;
import javax.swing.*;
import javax.swing.text.Document;

public class PlaceholderTextField extends JTextField {

    // Properties
    
    private String placeholder;

    // Getters / setters

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }
    
    // Drawings
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (this.getText().length() <= 0 && this.placeholder.length() > 0) {
            Graphics2D g2D = (Graphics2D)g;
            g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                                 RenderingHints.VALUE_ANTIALIAS_ON);
            g2D.setColor(getDisabledTextColor());
            
            int x = this.getInsets().left;
            int y = g.getFontMetrics().getMaxAscent() + getInsets().top - 2;
            g2D.drawString(placeholder, x, y);
        }
    }

}