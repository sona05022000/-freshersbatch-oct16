/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

/**
 *
 * @author KUNAL KUMAR DAS
 */
import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;

public class Front_Page implements ActionListener {
    JFrame f;
    JLabel id,l1;
    JButton b;
    Front_Page(){
        
        f=new JFrame("Front");
        f.setBackground(Color.red);
        f.setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/employee_1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,80,1000,400);
        f.add(l1);
        
        
       b=new JButton("CLICK HERE TO CONTINUE");
       b.setBackground(Color.BLACK);
       b.setForeground(Color.WHITE);
       
       b.setBounds(650,410,300,70);
       b.addActionListener(this);
       
       id = new JLabel();
       id.setBounds(0,0,1000,550);
       id.setLayout(null);
       
       JLabel lid = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
       lid.setBounds(60,0,1000,100);
       lid.setFont(new Font("serif",Font.PLAIN,52));
       lid.setForeground(Color.white);
       id.add(lid);
       
       id.add(b);
       f.add(id);
       
       f.getContentPane().setBackground(Color.BLACK);
       f.setVisible(true);
       f.setSize(1000,550);
       f.setLocation(150,100);
       
       
      while(true){
          lid.setVisible(false);
          try{
              Thread.sleep(500);
          }
          catch(Exception e){}
         lid.setVisible(true);
         try{
             Thread.sleep(500);
         }
         catch(Exception e){}
         }
          }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b){
            f.setVisible(false);
            login l=new login();
            
        }
    }
    public static void main(String[] args ){
        Front_Page f = new Front_Page();
    }
}
    
    
      
    
    

