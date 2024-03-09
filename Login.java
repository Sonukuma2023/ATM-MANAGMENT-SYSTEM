package bank.managenment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
JLabel label1,label2,label3;
JTextField textField2  ;
JPasswordField passwordField2;
JButton button1,button2,button3;
    Login(){
        setTitle("BANK MANAGEMENT SYSTEM");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(10,10,100,100);
        add(image);
        ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2=ii1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon ii3=new ImageIcon(ii2);
        JLabel iimage=new JLabel(ii3);
        iimage.setBounds(630,350,100,100);
        add(iimage);
        label1=new JLabel("WELCOME TO ATM");
        label1.setBounds(130,50,450,40);
        label1.setForeground(Color.white);
        label1.setFont(new Font("Arial",Font.BOLD,38));
        add(label1);
        label2=new JLabel("CARD NO:");
        label2.setBounds(100,130,300,40);
        label2.setForeground(Color.white);
        label2.setFont(new Font("Arial",Font.BOLD,38));
        add(label2);
        textField2=new JTextField(15);
        textField2.setBounds(370,130,340,40);
       textField2 .setFont(new Font("Arial",Font.BOLD,18));
       add(textField2);
       label3=new JLabel("PIN :");
        label3.setBounds(100,170,450,40);
        label3.setForeground(Color.white);
        label3.setFont(new Font("Arial",Font.BOLD,38));
        add(label3);
        passwordField2=new JPasswordField(15);
         passwordField2.setBounds(370,180,340,40);
        passwordField2 .setFont(new Font("Arial",Font.BOLD,18));
        add(passwordField2);
        button1=new JButton("sign in");
        button1.setFont(new Font("Arial",Font.BOLD,38));
        button1.setBounds(150,270,180,40);
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK );
        button1.addActionListener(this);
        add(button1);
        button2=new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,38));
        button2.setBounds(380,270,175,40);
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.addActionListener(this);
        add(button2);
        button3=new JButton("signup");
        button3.setFont(new Font("Arial",Font.BOLD,38));
        button3.setBounds(230,350,180,40);
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.addActionListener(this);
        add(button3);


        ImageIcon iii1=new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2=iii1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
        ImageIcon iii3=new ImageIcon(iii2);
        JLabel iiimage=new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);


        setSize(850,480);
        setVisible(true);
//        setLocation(450,200);
        setLayout(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==button1){
               Con c=new Con();
               String cardno =textField2.getText();
               String pin =passwordField2.getText();
               String q="select * from login where card_no ='"+cardno+"'and pin='"+pin+"'";
                ResultSet resultSet=c.statement.executeQuery(q);
                if(resultSet.next()){
                    setVisible(false);
                    new Main_Class(pin);
                }
                else {
                    JOptionPane.showMessageDialog(null,"Incorrect card number or pin");
                }

            }
            else if (e.getSource()==button2) {
               textField2.setText(" ");
               passwordField2.setText("");
            }
            else if(e.getSource()==button3){
                new Signup();
                setVisible(false);

            }
        }
        catch(Exception e1){
            e1.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }

}
