/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author isaac
 */
public class Mavenproject2 implements ActionListener{
    private static JLabel userlabel;
    private static JTextField userText;
    private static JLabel passwordlabel;
    private static JTextField passwordText;
    private static JButton button;
    private static JLabel success;
    private static JLabel destroylabel;
    private static JButton nukebutton;
    
    

    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        
        panel.setLayout(null);
        
        userlabel = new JLabel("Username");
        userlabel.setBounds(10,20,80,25);
        panel.add(userlabel);
        
        passwordlabel = new JLabel("Password");
        passwordlabel.setBounds(10,50,80,25);
        panel.add(passwordlabel);
        
        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);
        
        passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);
        
        button = new JButton("login");
        button.setBounds(10,80,80,25);
        button.addActionListener(new Mavenproject2());
        panel.add(button);
        
        success = new JLabel("");
        success.setBounds(10,110,300,25);
        panel.add(success);
        
        
        frame.setVisible(true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
       
        System.out.println( user + ", "+ password );
        
        if((user.equals("qwerty")) && (password.equals("123456789"))){
            success.setText("Login successful");
        
        }
        
        
        else{
            success.setText("Unsuccessful login");
        }
    }
}


