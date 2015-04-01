//
//  WebsiteEater
//
//  This software is released subject to licensing conditions as detailed in 
//  Licence.txt.
//

import java.awt.event.*;
import java.lang.*;
import java.lang.reflect.*;

public class ActionPerformer implements ActionListener {

    // Properties

    private Object target;

    private String action;

    // Constructors
    
    public ActionPerformer(Object target, String action) {
        this.target = target;
        this.action = action;
    }

    // Getters / setters

    public Object getTarget() {
        return this.target;
    }

    public String getAction() {
        return this.action;
    }

    // ActionListener interface

    public void actionPerformed(ActionEvent e) {
        Class<?> targetClass = this.target.getClass();
        Class<ActionEvent> argClass = ActionEvent.class;
        Method  method;
        
        try {
            method = targetClass.getDeclaredMethod(this.action, argClass);
        } catch (NoSuchMethodException exception) {
            System.out.println(exception);
            return;
        }
        
        try {
          method.invoke(this.target, e);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception);
        } catch (IllegalAccessException exception) {
            System.out.println(exception);
        } catch (InvocationTargetException exception) {
            System.out.println(exception);
        }
    }

}