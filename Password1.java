package Password;
import javax.swing.*;    
public class Password {  
    public static void main(String[] args) {    
    JFrame f=new JFrame("�ifre �rne�i");    
     JPasswordField value = new JPasswordField();   
     JLabel l1=new JLabel("�ifreniz:");    
        l1.setBounds(20,100, 80,30);    
         value.setBounds(100,100,100,30);    
            f.add(value);  f.add(l1);  
            f.setSize(300,300);    
            f.setLayout(null);    
            f.setVisible(true);     
}  
}  