package CheckBoxs;
import java.awt.event.*; 
import java.awt.*;
import javax.swing.*; 

public class CheckBox extends JFrame {
	static JFrame f; 
	  

    public static void main(String[] args) 
    { 

        f = new JFrame("frame"); 
  

        f.setLayout(new FlowLayout()); 

        JCheckBox c1 = new JCheckBox("checkbox 1"); 
        JCheckBox c2 = new JCheckBox("checkbox 2"); 
  
        JPanel p = new JPanel(); 
  
        p.add(c1); 
        p.add(c2); 
  
        f.add(p); 
  
        f.setSize(300, 300); 
  
        f.show(); 
    } 
} 