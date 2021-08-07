/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Settings;

import java.awt.Component;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author alioz
 */
public class Text {
    private static String originalText;
    
    public static void checkTextFocusGained(JTextField textField,String org){
        originalText = org;
        if(textField.getText().trim().equals(org)){
            textField.setText("");
        }
    }
    public static void checkTextFocusLost(JTextField textField){
        if(textField.getText().trim().equals("")){
            textField.setText(originalText);
        }
    }
    public static void setOnlyNumber(JTextField textField){
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c=e.getKeyChar();
                if(!Character.isDigit(c)){
e.consume();//To change body of generated methods, choose Tools | Templates.
            }
            }
      });
        
    }

    
      public static void setOnlyAlphabet(JTextField textField){
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c=e.getKeyChar();
                if(!Character.isAlphabetic(c)){
e.consume();//To change body of generated methods, choose Tools | Templates.
            }
            }
      });
        
    }
     public static int checkTheTextKeyReleased(JTextField textField,int limit){
         String text=textField.getText();
        if(!text.equals("")){
            int miktar=Integer.valueOf(text);
            if(miktar>limit){
                miktar=limit;
                textField.setText(String.valueOf(miktar));
            }
            return miktar;
       }else{
            return 0;
        }
        
        
     }
     public static boolean textAlanlarıDolumu(JPanel panel){
         Component[] components=panel.getComponents();
         for(Component c: components){
             if(c instanceof JTextField ){
                 JTextField textField=(JTextField)c;
                 if(textField.getText().trim().equals("") && textField.isEnabled()){
                     return false;
                 }
             }
         }
         return true;
     }
    


}