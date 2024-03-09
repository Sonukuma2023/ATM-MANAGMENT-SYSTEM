package bank.managenment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
String formno;
    JComboBox combobox, combobox2,combobox3,combobox4,combobox5;
    JTextField textPan,textAdhar;
    JRadioButton r1,r2,r3,r4;
    JButton next;
    Signup2(String formno){
        super("Application form");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);
        this.formno=formno;
        JLabel l1=new JLabel("page2  : ");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);JLabel l2=new JLabel("Additional Details:  ");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);
        JLabel l3=new JLabel("Religion: ");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);
        String religion[]={"hindu","Muslim","sikh","Christan","other"};
        combobox=new JComboBox(religion);
        combobox.setBackground(new Color(252,208,76));
        combobox.setFont(new Font("Raleway",Font.BOLD,18));
        combobox.setBounds(350,120,320,30);
        add(combobox);
        JLabel l4=new JLabel("Category: ");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);
        String Category []={"Genral","OBC","SC","ST","Other"};
        combobox2=new JComboBox( Category);
        combobox2.setBackground(new Color(252,208,76));
        combobox2.setFont(new Font("Raleway",Font.BOLD,18));
        combobox2.setBounds(350,170,320,30);
        add(combobox2);
        JLabel l5=new JLabel("Income: ");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);
        String Income []={"null"," <1,50,000","<2,50,000","5,00,000"," upto 10,00000","Above20,00,000"};
        combobox3=new JComboBox( Income);
        combobox3.setBackground(new Color(252,208,76));
        combobox3.setFont(new Font("Raleway",Font.BOLD,18));
        combobox3.setBounds(350,220,320,30);
        add(combobox3);
        JLabel l6=new JLabel("Educational: ");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(100,270,120,30);
        add(l6);
        String Educational []={"Non Graduate","Graduate","Post-Graduate","Doctrate","other"};
        combobox4=new JComboBox( Educational);
        combobox4.setBackground(new Color(252,208,76));
        combobox4.setFont(new Font("Raleway",Font.BOLD,18));
        combobox4.setBounds(350,270,320,30);
        add(combobox4);
        JLabel l7=new JLabel("Occupation: ");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(100,340,120,30);
        add(l7);
        String Occupation []={"Salaried","Self_Employed","Business"," Student","Retried"};
        combobox5=new JComboBox(Occupation);
        combobox5.setBackground(new Color(252,208,76));
        combobox5.setFont(new Font("Raleway",Font.BOLD,18));
        combobox5.setBounds(350,340,320,30);
        add(combobox5);
        JLabel l8=new JLabel(" PAN number: ");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,390,200,30);
        add(l8);
        textPan=new JTextField();
        textPan.setFont(new Font("Raleway",Font.BOLD,18));
        textPan.setBounds(350,390,320,30);
        add( textPan);
        JLabel l9=new JLabel(" AAdhar number: ");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(100,440,320,30);
        add(l9);
        textAdhar=new JTextField();
        textAdhar.setFont(new Font("Raleway",Font.BOLD,18));
        textAdhar.setBounds(350,440,320,30);
        add(textAdhar);
        JLabel l10=new JLabel("Senior City: ");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setBounds(100,490,320,30);
        add(l10);
        r1=new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBounds(350,490,100,30);
        r1.setBackground(new Color(252,208,76));
        add(r1);
        r2=new JRadioButton("NO");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBounds(450,490,100,30);
        r2.setBackground(new Color(252,208,76));
        add(r2);
        ButtonGroup buttonGroup=new ButtonGroup();

        buttonGroup.add(r2);
        buttonGroup.add(r1);

        JLabel l11=new JLabel("Exiting Account: ");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,540,320,30);
        add(l11);
        r3=new JRadioButton("Yes");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBounds(350,540,100,30);
        r3.setBackground(new Color(252,208,76));
        add(r3);
        r4=new JRadioButton("NO");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBounds(460,540,100,30);
        r4.setBackground(new Color(252,208,76));
        add(r4);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r3);
        bg.add(r4);

        JLabel l12=new JLabel("Form No: ");
        l12.setFont(new Font("Raleway",Font.BOLD,14));
        l12.setBounds(700,10,100,30);
        add(l12);
        JLabel l13=new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,12));
        l13.setBounds(760,10,30,30);
        add(l13);

      next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,18));
        next.setBounds(570,640,100,30);
        next.setBackground(Color.white);
        next.setForeground(Color.BLACK);
        next.addActionListener(this);
        add(next);







        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
    String rel=(String)combobox.getSelectedItem();
    String cate=(String)combobox2.getSelectedItem();
    String inc=(String)combobox3.getSelectedItem();
    String edu=(String) combobox4.getSelectedItem();
    String occ=(String) combobox5.getSelectedItem();
    String pan=textPan.getText();
    String adhar=textAdhar.getText();
    String scitizen="";
    if(r1.isSelected()){
        scitizen="Yes";
    } else if (r2.isSelected()) {

        scitizen="NO";
    }
    String eAccount=" ";
    if(r3.isSelected()){
        eAccount="Yes";
    } else if (r4.isSelected()) {

        eAccount="NO";
    }
    try{
        if(textPan.getText().equals("") || textAdhar.getText().equals("") ){
            JOptionPane.showMessageDialog(null,"fill all the fields");

        }
        else{
            Con c1=new Con();
            String q="insert into signup2 values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+adhar+"','"+scitizen+"','"+eAccount+"')";
            c1.statement.executeUpdate(q);
            new Signup3(formno);
            setVisible(false);
        }

    }catch (Exception e1){
        e1.printStackTrace();
    }

}


    public static void main(String[] args) {
       new Signup2("");
    }
}
