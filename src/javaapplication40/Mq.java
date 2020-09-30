package javaapplication40;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Locale;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Mq extends JFrame implements ItemListener{
    
    JLabel l1, l2, l3;
    JTextField t1, k1, t3;
    
    JButton b1, b2, b3, b4, b5, b6;
    JRadioButton r1, r2, r3, r4, r5;
    JPanel p1, p2, p3;
    ButtonGroup g1;
    JCheckBox c1, c2, c3;
    Bn v = new Bn();

    public Mq() {
        int x=0;
        int q=20;
        this.setTitle("Mina");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(450, 700);
        this.setLocation(100, 20);
        l3 = new JLabel();
        
        c1 = new JCheckBox("plant");
        c2 = new JCheckBox("lizeart");
        c3 = new JCheckBox("play");
        b3 = new JButton("right");
        b4 = new JButton("left");
        b5 = new JButton("min");
        b6 = new JButton("max");
        l1 = new JLabel("full name");
        l2 = new JLabel("password");
        t1 = new JTextField();
        k1 = new JTextField();
        t3 = new JTextField();
        b1 = new JButton("save");
        b2 = new JButton("show");
        r1 = new JRadioButton("blue");
        r2 = new JRadioButton("red");
        r3 = new JRadioButton("yellow");
        r4 = new JRadioButton("green");
        r5 = new JRadioButton("gray");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p1.setBackground(Color.yellow);
        p2.setBackground(Color.RED);
        p3.setBackground(Color.BLUE);
        g1 = new ButtonGroup();
        this.setLayout(new GridLayout(3, 1));
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(l1);
        this.add(l2);
        this.add(t1);
        this.add(k1);
        this.add(b1);
        this.add(b2);
        this.add(t3);
        this.add(r1);
        this.add(r2);
        this.add(r3);
        this.add(r4);
        this.add(r5);
        this.add(c1);
        this.add(c2);
        this.add(c3);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(l3);
        p1.setLayout(null);
        p2.setLayout(null);
        p3.setLayout(null);
        l1.setBounds(10, 10, 90, 25);
        p1.add(l1);
        l2.setBounds(10, 60, 90, 25);
        p1.add(l2);
        t1.setBounds(90, 10, 200, 20);
        p1.add(t1);
        k1.setBounds(90, 60, 200, 20);
        p1.add(k1);
        b1.setBounds(100, 100, 90, 30);
        p1.add(b1);
        b2.setBounds(200, 100, 90, 30);
        p1.add(b2);
        t3.setBounds(90, 10, 200, 30);
        p2.add(t3);
        r1.setBounds(10, 90, 60, 15);
        p2.add(r1);
        r2.setBounds(90, 90, 60, 15);
        p2.add(r2);
        r3.setBounds(190, 90, 80, 15);
        p2.add(r3);
        r4.setBounds(290, 90, 60, 15);
        p2.add(r4);
        r5.setBounds(370, 90, 60, 15);
        p2.add(r5);
        g1.add(r1);
        g1.add(r2);
        g1.add(r3);
        g1.add(r4);
        g1.add(r5);
        c1.setBounds(100, 30, 70, 30);
        p3.add(c1);
        c2.setBounds(200, 30, 70, 30);
        p3.add(c2);
        c3.setBounds(300, 30, 70, 30);
        p3.add(c3);
        b1.setBackground(Color.cyan);
        b2.setBackground(Color.cyan);
        b3.setBackground(Color.cyan);
        b4.setBackground(Color.cyan);
        b5.setBackground(Color.cyan);
        b6.setBackground(Color.cyan);
        b1.setForeground(Color.darkGray);
        b2.setForeground(Color.darkGray);
        b3.setForeground(Color.darkGray);
        b4.setForeground(Color.darkGray);
        b5.setForeground(Color.darkGray);
        b6.setForeground(Color.darkGray);
        b3.setBounds(10, 100, 70, 50);
        p3.add(b3);
        b4.setBounds(100, 100, 70, 50);
        p3.add(b4);
        b5.setBounds(200, 100, 70, 50);
        p3.add(b5);
        b6.setBounds(300, 100, 70, 50);
        p3.add(b6);
        p3.add(l3);
        l3.setBounds(x, 0, 200, 50);
        l3.setFont(new Font("itiali",Font.ITALIC,q));
        b1.addActionListener(v);
        b2.addActionListener(v);
        r1.addActionListener(v);
        r2.addActionListener(v);
        r3.addActionListener(v);
        r4.addActionListener(v);
        r5.addActionListener(v);
        b3.addActionListener(v);
                b4.addActionListener(v);
                 b5.addActionListener(v);
                  b6.addActionListener(v);
c1.addItemListener(this);
c2.addItemListener(this);
c3.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        int q=10;
    if(c1.isSelected()){
     l3.setFont(new Font("itiali",Font.ITALIC,q));
    
    }
        else if (c2.isSelected()){
     l3.setFont(new Font("itiali",Font.CENTER_BASELINE,q));
    
    }
         else if (c3.isSelected()){
     l3.setFont(new Font("itiali",Font.ITALIC,q));
    
    }
        
        
        
    }
    
    private class Bn implements ActionListener {
        int x=0;
        int q=20;
        @Override
        public void actionPerformed(ActionEvent ae) {
            
            if (ae.getSource() == b1) {
                String q = t1.getText().toString();
                String w = k1.getText().toString();
                System.out.println(q);
                System.out.println(w);
                
            }
            if (ae.getSource() == b2) {
                String f = t1.getText().toString();
                String d = k1.getText().toString();
                t3.setText(f + "      " + d);
                l3.setText( "Welcome Eng "+"  "+f);
                t1.setText(" ");
                k1.setText(" ");
            }
            if (ae.getSource() == r1) {
                p2.setBackground(Color.blue);
                t3.setForeground(Color.blue);
                l3.setForeground(Color.blue);
            }
            if (ae.getSource() == r2) {
                t3.setForeground(Color.red);
                p2.setBackground(Color.RED);
                 l3.setForeground(Color.red);
            }
            if(ae.getSource()==r3){
            p2.setBackground(Color.yellow);
            t3.setForeground(Color.yellow);
             l3.setForeground(Color.yellow);
            }
            if(ae.getSource()==r4){
            p2.setBackground(Color.green);
            t3.setForeground(Color.green);
             l3.setForeground(Color.green);
            }
            if(ae.getSource()==r5){
            p2.setBackground(Color.GRAY);
            t3.setForeground(Color.GRAY);
             l3.setForeground(Color.gray);
            }
            if(ae.getSource()==b3){
            x+=5;
            l3.setBounds(x,  0, 400, 50);
            }
            if(ae.getSource()==b4){
            x-=5;
            l3.setBounds(x,  0, 400, 50);
            }
            if(ae.getSource()==b5){
            q-=2;
             l3.setFont(new Font("itiali",Font.ITALIC,q));
            }
             if(ae.getSource()==b6){
            q+=2;
             l3.setFont(new Font("itiali",Font.ITALIC,q));
            }
        }
        
    }
    
}
