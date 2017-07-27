
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Basic_Functions {
    
    public Basic_Functions()
    {
        
    }
    //Display desired panel on a specific button call
    public void Buttoncall(JPanel main , JPanel add)
    {
       main.removeAll();
       main.repaint();
       main.revalidate();  
       main.add(add);
       main.repaint();
       main.revalidate(); 
    }
    //Change background when button is selected
    public void ButtonSelected(JButton btn1, JButton ... Elements)
    {

       btn1.setBackground(new java.awt.Color(204, 70, 15));
       for(JButton b:Elements)
       {
           b.setBackground(new java.awt.Color(23, 42, 69));
       }
    }
    //Empty all the desired JTextFields
    public void EmptyFields(JTextField ... Elements)
    {
        for(JTextField b:Elements)
       {
           b.setText(null);
       }
    }
    //Change lower case into uppercase
    public void UpperCase(JTextField tf)
    {
        tf.addKeyListener(new KeyAdapter() {
           public void keyTyped(KeyEvent e) {
             char keyChar = e.getKeyChar();
             if (Character.isLowerCase(keyChar)) {
               e.setKeyChar(Character.toUpperCase(keyChar));
             }
           }

          });
    }
}
