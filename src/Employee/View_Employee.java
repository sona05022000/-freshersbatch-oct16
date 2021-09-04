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

import java.awt.event.*;
public class View_Employee implements ActionListener {
     JFrame f;
     JTextField t;
     JLabel l1,l2;
     JButton b,b2;
     
     View_Employee(){
         f=new JFrame("View");
         f.setBackground(Color.green);
         f.setLayout(null);
         
        l1= new JLabel();
        l1.setBounds(0,0,1060,400);
        l1.setLayout(null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("icons/view.png"));
        l1.setIcon(img);
        
        
        l2= new JLabel("Employee Id");
        l2.setVisible(true);
        l2.setBounds(600,60,700,40);
        Font F1 = new Font("serif",Font.BOLD,30);
        l2.setForeground(Color.blue);
        l2.setFont(F1);
        l1.add(l2);
        f.add(l1);
        
         t = new JTextField();
        t.setBounds(790,60,220,30);
        t.setBackground(Color.white);
        l1.add(t);
        
        
         b= new JButton("Search");
        
        b.setBounds(770,150,100,30);
        b.addActionListener(this);
        l1.add(b);
        
        
        
         b2= new JButton("Cancel");
        
        b2.setBounds(930,150,100,30);
        b2.addActionListener(this);
        l1.add(b2);
        
        
        f.setSize(1060,400);
        f.setLocation(100,200);
        f.setVisible(true);
        
     }
     public void actionPerformed(ActionEvent ae){
         if(ae.getSource()==b2){
             f.setVisible(false);
             details d=new details();
             
         }
         if (ae.getSource()==b){
             f.setVisible(false);
             Print_Data p= new Print_Data(t.getText());
         }
     }
    public static void main(String[] ar){
        View_Employee v=new View_Employee();
    }
}
