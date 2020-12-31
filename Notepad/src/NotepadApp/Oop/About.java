package NotepadApp.Oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About extends JFrame implements ActionListener {
    JButton jb;
    About(){
        setBounds(600, 200, 700, 580);
        setLayout(null);

        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("NotepadApp/Icons/logo-linux.png"));
        Image i2 = il.getImage().getScaledInstance(400, 160, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon (i2);
        JLabel jl = new JLabel(i3);
        jl.setBounds(150, 30, 400, 160);
        add(jl);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("NotepadApp/Icons/notepad-icon.png"));
        Image i5 = i4.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon (i5);
        JLabel jl2 = new JLabel(i6);
        jl2.setBounds(50, 220, 70, 70);
        add(jl2);

        JLabel jl3 = new JLabel("<html>Linux Ubuntu<br>Notepad version 1<br>Taunur Team 2020, All Right Reversed<br><br>Notepad is a word processing progam<br>which allows changing of text in compiter file, <br>Notepad is simple text editor for basic text editing progam<br>which enable computer used to create documents </html>");
        jl3.setBounds(150, 150, 500, 300);
        jl3.setFont(new Font("Times New Roman", Font.PLAIN,18));
        add(jl3);

        jb = new JButton("OK");
        jb.setBounds(580, 500, 80, 25);
        jb.addActionListener(this);
        add(jb);
    }

    public void actionPerformed(ActionEvent ae){
         this.setVisible(false);
    }

    public static void main(String[] args) {
            new About().setVisible(true);
    }
}

