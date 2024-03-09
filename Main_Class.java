package bank.managenment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_Class extends JFrame implements ActionListener {
JButton b1,b2,b3,b4,b5,b6,b7;
String pin;
    Main_Class(String pin){
          this.pin=pin;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2= i1.getImage().getScaledInstance(1550,800,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,800);
        add(l3);
        JLabel label=new JLabel("Please Select your  Transaction : ");
        label.setBounds(430,180,700,35);
        label.setForeground(Color.white);
        label.setFont(new Font("Arial",Font.BOLD,22));
        l3.add(label);
        b1=new JButton("DEPOSIT");
       b1.setFont(new Font("Arial",Font.BOLD,12));
       b1.setForeground(Color.white);
       b1.setBackground(new Color(100, 100, 33));
       b1.setBounds(405,260,150,35);
       b1.addActionListener(this);
       l3.add(b1);
        b2=new JButton("CASE WITHDRAW");
        b2.setFont(new Font("Arial",Font.BOLD,12));
        b2.setForeground(Color.white);
        b2.setBackground(new Color(100, 100, 33));
        b2.setBounds(700,260,150,35);
        b2.addActionListener(this);
        l3.add(b2);
        b3=new JButton("FASTCASE");
        b3.setFont(new Font("Arial",Font.BOLD,12));
        b3.setForeground(Color.white);
        b3.setBackground(new Color(100, 100, 33));
        b3.setBounds(405,308,150,35);
        b3.addActionListener(this);
        l3.add(b3);
        b4=new JButton("MINI STATEMENT");
        b4.setFont(new Font("Arial",Font.BOLD,12));
        b4.setForeground(Color.white);
        b4.setBackground(new Color(100, 100, 33));
        b4.setBounds(700,308,150,35);
        b4.addActionListener(this);
        l3.add(b4);
        b5=new JButton("PIN CHANGE");
        b5.setFont(new Font("Arial",Font.BOLD,12));
        b5.setForeground(Color.white);
        b5.setBackground(new Color(100, 100, 33));
        b5.setBounds(405,352,150,35);
        b5.addActionListener(this);
        l3.add(b5);
        b6=new JButton( "BALANCE ENQUIRY");
        b6.setFont(new Font("Arial",Font.BOLD,12));
        b6.setForeground(Color.white);
        b6.setBackground(new Color(100, 100, 33));
        b6.setBounds(700,352,150,35);
        b6.addActionListener(this);
        l3.add(b6);
        b7=new JButton(  "EXIT");
        b7.setFont(new Font("Arial",Font.BOLD,12));
        b7.setForeground(Color.white);
        b7.setBackground(new Color(100, 100, 33));
        b7.setBounds(700,396,150,35);
        b7.addActionListener(this);
        l3.add(b7);




        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            new Deposit(pin);
            setVisible(false);
        } else if (e.getSource()==b7) {
            System.exit(0);

        } else if (e.getSource()==b2) {
            new Withdrawl(pin);
            setVisible(false);
        } else if(e.getSource()==b6) {
            new BalanceEnquiry(pin);
            setVisible(false);

        } else if (e.getSource()==b3) {
            new FastCase(pin);
            setVisible(false);

        } else if (e.getSource()==b5) {
            new Pin(pin);
            setVisible(false);
        } else if (e.getSource()==b4) {
            new Mini(pin);
            setVisible(false);

        }


    }

    public static void main(String[] args) {

        new Main_Class("");
    }
}
