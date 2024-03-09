package bank.managenment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3  extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton s1,C;
    String formno;
    Signup3(String formno){
        this.formno=formno;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);
        JLabel l1=new JLabel("page 3");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);
        JLabel l2=new JLabel("Account detail");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(280,70,400,40);
        add(l2);
        JLabel l3=new JLabel("Account type:");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,140,400,30);
        add(l3);
        r1=new JRadioButton("Saving account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground( new Color(76, 220, 252) );
        r1.setBounds(100,180,150,30);
        add(r1);
        r2=new JRadioButton("Fixed apposite Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground( new Color(76, 220, 252) );
        r2.setBounds(350,180,250,30);
        add(r2);
        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground( new Color(76, 220, 252) );
        r3.setBounds(100,220,150,30);
        add(r3);
        r4=new JRadioButton("ReCurrent deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground( new Color(76, 220, 252) );
        r4.setBounds(350,220,250,30);
        add(r4);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);
        JLabel l4=new JLabel("card number:");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,300,200,30);
        add(l4);
        JLabel l5=new JLabel("(your 16-digit card number)");
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        l5.setBounds(100,330,200,30);
        add(l5);
        JLabel l6=new JLabel("xxxx-xxxx-xxxx-4884");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(330,300,250,30);
        add(l6);
        JLabel l7=new JLabel("(It would appear on atm card  /check Book)");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(330,330,500,30);
        add(l7);
        JLabel l8=new JLabel("PIN:");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,370,500,30);
        add(l8);
        JLabel l9=new JLabel("xxxx");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(330,370,500,30);
        add(l9);
        JLabel l10=new JLabel("4-digit-password");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setBounds(100,400,500,30);
        add(l10);
        JLabel l11=new JLabel("Service Required:");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,450,500,30);
        add(l11);
        c1=new JCheckBox("ATM CARD");
        c1.setBackground(new Color(25,252, 76));
        c1.setFont(new Font("Raleway",Font.BOLD,18));
        c1.setBounds(100,500,200,30);
        add(c1);
        c2=new JCheckBox("Internet Banking");
        c2.setBackground(new Color(25,252, 76));
        c2.setFont(new Font("Raleway",Font.BOLD,18));
        c2.setBounds(350,500,200,30);
        add(c2);
        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(25,252, 76));
        c3.setFont(new Font("Raleway",Font.BOLD,18));
        c3.setBounds(100,550,200,30);
        add(c3);
        c4=new JCheckBox( "Email Alert");
        c4.setBackground(new Color(25,252, 76));
        c4.setFont(new Font("Raleway",Font.BOLD,18));
        c4.setBounds(350,550,200,30);
        add(c4);
        c5=new JCheckBox( "Check Book");
        c5.setBackground(new Color(25,252, 76));
        c5.setFont(new Font("Raleway",Font.BOLD,18));
        c5.setBounds(100,600,200,30);
        add(c5);
        c6=new JCheckBox( "E-Statement");
        c6.setBackground(new Color(25,252, 76));
        c6.setFont(new Font("Raleway",Font.BOLD,18));
        c6.setBounds(350,600,200,30);
        add(c6);
        JCheckBox c7=new JCheckBox("I decleares  that the above entend details coorect to the the best of my knowledge",true);
        c7 .setBackground(new Color(25,252, 76));
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,680,600,20);
        add(c7);
        JLabel l12=new JLabel("FormNO: ");
        l12.setFont(new Font("Raleway",Font.BOLD,9));
        l12.setBounds(690,10,50,30);
        add(l12);
        JLabel l13=new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,9));
        l13.setBounds(730,10,50,30);
        add(l13);
        s1=new JButton("Submit");
        s1.setFont(new Font("Raleway",Font.BOLD,14));
        s1.setBackground(Color.black);
        s1.setForeground(Color.white);
        s1.setBounds(220,720,100,30);
        s1.addActionListener(this);
        add(s1);
        C=new JButton("CLEAR");
        C.setFont(new Font("Raleway",Font.BOLD,14));
        C.setBackground(Color.black);
        C.setForeground(Color.white);
        C.setBounds(420,720,100,30);
        C.addActionListener(this);
        add(C);


        getContentPane().setBackground(new Color(252,252,76));
        setSize(850,800);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     String atype="";
     if(r1.isSelected()){
         atype="Saving account";
     }
     else if(r2.isSelected()){
         atype="Fixed apposite Account";
     } else if (r3.isSelected()) {
         atype="Current Account";

     } else if (r4.isSelected()) {
         atype="ReCurrent deposit Account";
     }
        Random ran=new Random();
     long first7=(ran.nextLong()% 90000000L) +1409963000000000L;
     String Cardno = ""+Math.abs(first7);
     long first3=(ran.nextLong()%9000L)+1000L;
     String pin= ""+Math.abs(first3);
     String fac="";
     if(c1.isSelected()){
         fac+="ATM CARD";
     } else if (c2.isSelected()) {
         fac +="Internet Banking";

     } else if (c3.isSelected()) {
         fac +="Mobile Banking";
     } else if (c4.isSelected()) {
         fac +="Email Alert";
     } else if (c5.isSelected()) {
         fac +="Check Book";

     } else if (c6.isSelected()) {
         fac +="E-Statement";

     }
     try{
         if (e.getSource()==s1){
             if(atype.equals("")){
                 JOptionPane.showMessageDialog(null,"fill the all fields");
             }
             else{
                Con c1=new Con();
                String q1="insert into signup3 values('"+formno+"','"+atype+"','"+Cardno+"','"+pin+"''"+fac+"')";
                String q2="insert into login values('"+formno+"','"+Cardno+"','"+pin+"')";
                c1.statement.executeUpdate(q1);
                c1.statement.executeUpdate(q2);
                JOptionPane.showMessageDialog(null,"card number :"+ Cardno+"\n pin:"+pin);
                setVisible(false) ;
                new Deposit(pin);
             }
         }
         else if(e.getSource()==C){
             System.exit(0);

         }

     }catch (Exception e2){
         e2.printStackTrace();
     }


    }

    public static void main(String[] args) {
        new Signup3(" ");
    }
}
