package bank.managenment.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JTextField textName,textFame ,textEmail,textAdd,textCity, textPin,textState;
    JLabel DOB;
    JRadioButton r1,r2,m1,m2,m3;
    JButton next;
    JDateChooser dateChoser;
          Random ran=new Random();
          long first4=(ran.nextLong()%9000l)+1000l;
          String first=" "+Math.abs(first4);

    Signup(){
        super("Application form");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,20,100,100);
        add(image);
        JLabel label1=new JLabel("Application form number ."+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Arial",Font.BOLD,38));
        add(label1);
        JLabel label2=new JLabel("page 1");
        label2.setFont(new Font("Arial",Font.BOLD,28));
        label2.setBounds(330,70,300,40);
        add(label2);
        JLabel label3=new JLabel("personal details");
        label3.setFont(new Font("Arial",Font.BOLD,38));
        label3.setBounds(330,120,300,30);
        add(label3);
        JLabel labelName=new JLabel("Name:");
        labelName.setFont(new Font("Arial",Font.BOLD,38));
        labelName.setBounds(10,190,200,30);
        add(labelName);
  textName=new JTextField();
  textName.setFont(new Font("Raleway",Font.BOLD,38));
  textName.setBounds(310,190,400,40);
//  textName.setBackground(Color.BLUE);
   add(textName);
        JLabel labelfName=new JLabel("Father Name:");
        labelfName.setFont(new Font("Arial",Font.BOLD,38));
        labelfName.setBounds(10,250,400,30);
        add(labelfName);
        textFame=new JTextField();
        textFame.setFont(new Font("Raleway",Font.BOLD,38));
        textFame.setBounds(310,250,400,30);
        add(textFame);
        DOB=new JLabel("date of birth :");
        DOB.setFont(new Font("Raleway",Font.BOLD,38));
        DOB.setBounds(10,300,300,30);
        add(DOB);
        dateChoser=new JDateChooser();
        dateChoser.setForeground(new Color(105,105,105));
        dateChoser.setBounds(310,300,400,30);
        add(dateChoser);
        JLabel labelG=new JLabel("Gender:");
        labelG.setFont(new Font("Raleway",Font.BOLD,38));
        labelG.setBounds(10,360,300,30);
        add(labelG);
        r1=new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBounds(310,360,100,30);
        add(r1);
        r2=new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBounds(410,360,200,30);
        add(r2);
        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r2);;
        buttonGroup.add(r1);;
        JLabel labelemail=new JLabel("Email address:");
        labelemail.setFont(new Font("Raleway",Font.BOLD,38));
        labelemail.setBounds(10,400,300,40);
        add(labelemail);
        textEmail=new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,38));
        textEmail.setBounds(310,400,400,40);
        add( textEmail);
        JLabel labelMs=new JLabel("Marital status:");
        labelMs.setFont(new Font("Raleway",Font.BOLD,38));
        labelMs.setBounds(10,450,300,40);
        add(labelMs);
        m1=new JRadioButton("Married");
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBounds(310,450,100,30);
        add(m1);
        m2=new JRadioButton("UnMarried");
         m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBounds(410,450,100,30);
        add( m2);
        m3=new JRadioButton("Other");
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        m3.setBounds(510,450,100,30);
        add(m3);
        ButtonGroup buttonGp=new ButtonGroup();
        buttonGp.add(m1);
        buttonGp.add(m2);
        buttonGp.add(m3);


        JLabel labelAdd=new JLabel("Address:");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,38));
        labelAdd.setBounds(10,500,300,40);
        add( labelAdd);
        textAdd=new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD,38));
        textAdd.setBounds(310,500,400,40);
        add( textAdd);
        JLabel labelCity=new JLabel("City:");
        labelCity.setFont(new Font("Raleway",Font.BOLD,38));
        labelCity.setBounds(10,550,300,40);
        add( labelCity);
        textCity=new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,38));
        textCity.setBounds(310,550,400,40);
        add( textCity);
        JLabel labelPin=new JLabel("Pine code:");
        labelPin.setFont(new Font("Raleway",Font.BOLD,38));
        labelPin.setBounds(10,600,300,40);
        add(  labelPin);
        textPin=new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD,38));
        textPin.setBounds(310,600,400,40);
        add( textPin);
        JLabel labelState=new JLabel("State:");
        labelState.setFont(new Font("Raleway",Font.BOLD,38));
        labelState.setBounds(10,650,300,40);
        add( labelState);
        textState=new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD,38));
        textState.setBounds(310,650,400,40);
        add(textState);
        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,38));
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setBounds(630,700,150,40);
        next.addActionListener(this);
        add(next);






        getContentPane().setBackground(new Color(69, 113, 39));
        setSize(850,480);
        setLayout(null);
        setVisible(true);
//        setLocation(450,200);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
     String formno=first;
     String name=textName.getText();
     String fname=textFame.getText();
     String dob=((JTextField) dateChoser.getDateEditor().getUiComponent()).getText();
     String gender=null;
     if(r1.isSelected()){
         gender="Male";
     } else if (r2.isSelected()) {
         gender="female";
     }
     String email=textEmail.getText();
     String martial=null;
     if(m1.isSelected()){
         martial="Married";
     } else if (m2.isSelected()) {
         martial="UnMarried";
     } else if (m3.isSelected()) {
         martial="other";
     }
     String address=textAdd.getText();
     String city=textCity.getText();
     String pinCode=textPin.getText();
     String state=textState.getText();
    try{
        if(textName.getText().equals("")){
            JOptionPane.showMessageDialog(null,"fill of the fields");
        }
        else{
            Con con1=new Con();
            String  q="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+martial+"','"+address+"','"+city+"','"+pinCode+"','"+state+"' )";
            con1.statement.executeUpdate(q);
            new Signup2(formno);
            setVisible(false);
        }

    }
    catch (Exception E){
        E.printStackTrace();
    }



    }

    public static void main(String[] args) {
        new Signup();
    }
}
