package testbox;
import javax.swing.JFrame;
import javax.swing.*;

public class  texts 
{
	texts(){  
        JFrame f= new JFrame();  
        JTextArea area=new JTextArea("ho�geldin");  
        area.setBounds(10,30, 200,200);  
        f.add(area);  
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true); 

    }
public static void main(String args[])  
    {  
   new texts();  
    }}  
