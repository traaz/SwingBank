/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Settings;

import javax.swing.JFrame;

/**
 *
 * @author alioz
 */
public class ActionButton {
    public static void setVisible(JFrame oldFrame,JFrame newFrame){
        oldFrame.setVisible(false);
        newFrame.setVisible(true);
    }
    
}
